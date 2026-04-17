package com.medicssupport.support.clinical.clinical.strategy.admission_request;

import com.medicssupport.support.application.constants.CommonConstants;
import com.medicssupport.support.clinical.clinical.model.admission_request.AdmissionRequest;
import com.medicssupport.support.clinical.clinical.model.admission_request.AdmissionRequestConstants;
import com.medicssupport.support.clinical.clinical.repository.AdmissionRequestRepository;
import com.medicssupport.support.search.constants.SearchConstants;
import com.medicssupport.support.search.model.SearchData;
import com.medicssupport.support.search.service.SearchStrategyExtended;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component(AdmissionRequestConstants.STRATEGY_REQ_PATIENT_RID)
@Slf4j
public class AdmissionRequestPatientRidSearchStrategy extends SearchStrategyExtended<AdmissionRequest> {

    @Autowired
    private AdmissionRequestRepository admissionRequestRepository;

    @Override
    public Page<AdmissionRequest> search(List<SearchData> searchData, Pageable pageable) {
        Map<String, List<String>> dataMap = getSearchDataMap(searchData, SearchConstants.EXPECTED_SIZE_ONE);

        List<Integer> reqPatientRids = dataMap.getOrDefault(AdmissionRequestConstants.KEY_REQ_PATIENT_RID, List.of()).stream()
                .filter(val -> val.matches(CommonConstants.NUMERIC_REGEX))
                .map(Integer::valueOf)
                .toList();

        log.info("Searching admission request by req_patient_rid: {}", reqPatientRids);

        return admissionRequestRepository.findAllByReqPatientRidIn(reqPatientRids, pageable);
    }

    @Override
    public String getDefaultSortField() {
        return AdmissionRequestConstants.COLUMN_REQ_RID;
    }
}
