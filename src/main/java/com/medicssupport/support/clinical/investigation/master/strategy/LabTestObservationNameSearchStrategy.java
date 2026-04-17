package com.medicssupport.support.clinical.investigation.master.strategy;

import com.medicssupport.support.clinical.investigation.master.model.lab_test_observation.LabTestObservation;
import com.medicssupport.support.clinical.investigation.master.model.lab_test_observation.LabTestObservationConstants;
import com.medicssupport.support.clinical.investigation.master.repository.LabTestObservationRepository;
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

@Component(LabTestObservationConstants.STRATEGY_LTO_OBSERVATION_NAME)
@Slf4j
public class LabTestObservationNameSearchStrategy extends SearchStrategyExtended<LabTestObservation> {

    @Autowired
    private LabTestObservationRepository labTestObservationRepository;

    @Override
    public Page<LabTestObservation> search(List<SearchData> searchData, Pageable pageable) {
        Map<String, List<String>> dataMap = getSearchDataMap(searchData, SearchConstants.EXPECTED_SIZE_ONE);

        String observationName = dataMap.getOrDefault(LabTestObservationConstants.KEY_LTO_OBSERVATION_NAME, List.of("")).get(0);

        log.info("Searching lab test observation by observation_name: {}", observationName);

        return labTestObservationRepository.findAllByObservationNameContainingIgnoreCase(observationName, pageable);
    }

    @Override
    public String getDefaultSortField() {
        return LabTestObservationConstants.COLUMN_RID;
    }
}
