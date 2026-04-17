package com.medicssupport.support.clinical.investigation.transaction.service.implement;

import com.medicssupport.support.application.core.layer.SuperServiceImpl;
import com.medicssupport.support.clinical.clinical.model.patient.Patient;
import com.medicssupport.support.clinical.clinical.service.PatientService;
import com.medicssupport.support.clinical.investigation.transaction.model.order_sample.OrderSample;
import com.medicssupport.support.clinical.investigation.transaction.model.result_detail.ResultDetail;
import com.medicssupport.support.clinical.investigation.transaction.model.result_detail.ResultDetailConstants;
import com.medicssupport.support.clinical.investigation.transaction.model.service_order.ServiceOrder;
import com.medicssupport.support.clinical.investigation.transaction.repository.ResultDetailRepository;
import com.medicssupport.support.clinical.investigation.transaction.service.ResultDetailService;
import com.medicssupport.support.clinical.investigation.transaction.service.worklist.WorklistStrategy;
import com.medicssupport.support.clinical.investigation.transaction.service.worklist.model.*;
import com.medicssupport.support.search.model.SearchData;
import com.medicssupport.support.search.model.SearchRequest;
import com.medicssupport.support.search.service.SearchStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@Slf4j
public class ResultDetailServiceImplement extends SuperServiceImpl<ResultDetail, Long> implements ResultDetailService {

    @Autowired
    private PatientService patientService;

    @Autowired
    private ResultDetailRepository resultDetailRepository;

    private final List<WorklistStrategy> worklistStrategies;

    @Autowired
    public ResultDetailServiceImplement(ResultDetailRepository resultDetailRepository, Map<String, SearchStrategy<ResultDetail>> searchStrategies, List<WorklistStrategy> worklistStrategies) {
        super(resultDetailRepository, searchStrategies);
        this.worklistStrategies = worklistStrategies;
    }

    @Transactional(readOnly = true)
    public List<ProcessValidationResult> getLabServiceStatus(SearchRequest request) {

        List<SearchData> searchDataList = request.getSearchData();

        List<SearchData> cleanedSearchDataList = new ArrayList<SearchData>();
        for (SearchData searchData: searchDataList){

            List<String> cleanValues = searchData.getSearchValues().stream()
                    .filter(value -> value != null && !value.trim().isEmpty())
                    .map(String::trim)
                    .distinct()
                    .collect(Collectors.toList());

            cleanedSearchDataList.add(new SearchData(searchData.getSearchKey(), cleanValues, searchData.getRequired()));
        }

        Map<String, List<String>> searchDataMap = cleanedSearchDataList.stream()
                .collect(Collectors.toMap(
                        SearchData::getSearchKey,
                        SearchData::getSearchValues,
                        (existing, replacement) -> existing
                ));

        List<String> patMRNList = searchDataMap.getOrDefault("pat_mrn", List.of());
        List<String> rdRidListStr = searchDataMap.getOrDefault("rd_rid", List.of());
        List<Long> rdRidList = rdRidListStr.stream().map(Long::parseLong).collect(Collectors.toList());

        List<Patient> patientList;
        if (!rdRidList.isEmpty()) {
            List<ResultDetail> specificDetails = resultDetailRepository.findAllById(rdRidList);
            List<Long> patientRids = specificDetails.stream().map(ResultDetail::getRdSourceRid).distinct().toList();
            patientList = patientService.get().stream().filter(p -> patientRids.contains(p.getPatRid())).collect(Collectors.toList());
        } else {
            patientList = patientService.getAllByMRNList(patMRNList);
        }

        if (patientList == null) {
            return null;
        }

        List<Long> patientRidList = patientList.stream().map(Patient::getPatRid).toList();

        List<ResultDetail> resultDetailList;
        if (!rdRidList.isEmpty()) {
            resultDetailList = resultDetailRepository.findAllById(rdRidList);
        } else {
            resultDetailList = getAllBySourceRid(patientRidList);
        }

        Map<Long, List<ResultDetail>> resultDetailsByPatient = resultDetailList.stream()
                .collect(Collectors.groupingBy(ResultDetail::getRdSourceRid));

        List<ProcessValidationResult> processValidationResults = new ArrayList<>();

        for (Patient patient : patientList) {
            
            List<SupplementaryInfo> patientSuppInfo = new ArrayList<>();
            // ... (keep age calculation)
            if (patient.getPatDob() != null) {
                int age = Period.between(patient.getPatDob(), LocalDate.now()).getYears();
                patientSuppInfo.add(SupplementaryInfo.builder()
                        .key("Age")
                        .value(String.valueOf(age))
                        .icon("calendar_today")
                        .build());
            }

            GroupContext groupContext = GroupContext.builder()
                    .groupName("Patient Details")
                    .identifier(patient.getPatMRN())
                    .displayName(patient.getPatFullName())
                    .status("active")
                    .supplementaryInfo(patientSuppInfo)
                    .build();

            List<SubjectDetail> subjectDetails = new ArrayList<>();
            List<ResultDetail> patientResultDetails = resultDetailsByPatient.get(patient.getPatRid());

            if (patientResultDetails != null) {
                boolean includeDataSegments = !rdRidList.isEmpty() || !(patientList.size() == 1 && patientResultDetails.size() > 2);
                for (ResultDetail resultDetail : patientResultDetails) {
                    String workListName = getWorklist(resultDetail);
                    WorklistStrategy wlStrategy = null;

                    for (WorklistStrategy strategy : worklistStrategies) {
                        if (strategy.getWorklistName().equals(workListName)) {
                            wlStrategy = strategy;
                            break;
                        }
                    }

                    if (wlStrategy != null) {
                        ValidationResult validationResult = wlStrategy.evaluate(resultDetail, includeDataSegments);
                        if (validationResult != null) {
                            subjectDetails.add(SubjectDetail.builder()
                                    .subjectHeader(validationResult.getSubjectHeader())
                                    .dataSegments(validationResult.getDataSegments())
                                    .build());
                        }
                    } else {
                        SubjectHeader subjectHeader = SubjectHeader.builder()
                                .id(String.valueOf(resultDetail.getRdRid()))
                                .title(resultDetail.getRdServiceName())
                                .subTitle("Not Found")
                                .indicator("error")
                                .supplementaryInfo(new ArrayList<>())
                                .build();

                        subjectDetails.add(SubjectDetail.builder()
                                .subjectHeader(subjectHeader)
                                .dataSegments(new ArrayList<>())
                                .build());
                    }
                }
            }
            
            processValidationResults.add(ProcessValidationResult.builder()
                    .groupContext(groupContext)
                    .subjectDetails(subjectDetails)
                    .build());
        }

        return processValidationResults;
    }

    public String getWorklist(ResultDetail resultDetail) {
        ServiceOrder serviceOrder = resultDetail.getServiceOrder();
        OrderSample orderSample = resultDetail.getOrderSample();

        String key = resultDetail.getRdStatus().toString() + "-" + resultDetail.getRdState().toString() + "-"
                + serviceOrder.getSoStatus().toString() + "-" + serviceOrder.getSoState().toString();
        if (orderSample != null) key += "-" + orderSample.getSmStatus().toString() + "-"  + orderSample.getSmState().toString();

        Map<String, String> worklistKeymap = new HashMap<>();
        worklistKeymap.put("2-0-12-0", ResultDetailConstants.WL_PRINT_OP_SAMPLE_LABELS);
        worklistKeymap.put("2-0-12-0-4-6", ResultDetailConstants.WL_ACCEPT_SAMPLES);
        worklistKeymap.put("4-0-12-0-4-6", ResultDetailConstants.WL_RECORD_LAB_RESULTS);
        worklistKeymap.put("4-2-12-0-4-6", ResultDetailConstants.WL_RECORD_LAB_RESULTS);
        worklistKeymap.put("8-8-12-0-4-6", ResultDetailConstants.WL_SIGN_LAB_RESULTS);

        return worklistKeymap.get(key);
    }

    private List<ResultDetail> getAllBySourceRid(List<Long> patRid) {
        return resultDetailRepository.findAllByRdSourceRidIn(patRid);
    }
}
