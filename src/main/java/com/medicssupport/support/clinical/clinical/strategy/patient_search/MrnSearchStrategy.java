package com.medicssupport.support.clinical.clinical.strategy.patient_search;


import com.medicssupport.support.clinical.clinical.model.patient.Patient;
import com.medicssupport.support.clinical.clinical.model.patient.PatientConstants;
import com.medicssupport.support.clinical.clinical.model.staff.Staff;
import com.medicssupport.support.clinical.clinical.repository.PatientRepository;
import com.medicssupport.support.search.model.SearchData;
import com.medicssupport.support.search.service.SearchStrategyExtended;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;

@Component(PatientConstants.STRATEGY_PAT_MRN)
@Slf4j
public class MrnSearchStrategy extends SearchStrategyExtended<Patient> {

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public Page<Patient> search(List<SearchData> searchData, Pageable pageable) {
        Map<String, List<String>> dataMap = getSearchDataMap(searchData, 1);

        // Extract Strings
        List<String> patMRNs = dataMap.getOrDefault(PatientConstants.KEY_PAT_MRN, List.of());
        return patientRepository.findAllByPatMRNIn(patMRNs, pageable);
    }

    @Override
    public String getDefaultSortField() {
        return PatientConstants.COLUMN_PAT_RID;
    }
}