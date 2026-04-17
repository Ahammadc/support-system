package com.medicssupport.support.clinical.investigation.master.strategy;

import com.medicssupport.support.application.constants.CommonConstants;
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

@Component(LabTestObservationConstants.STRATEGY_LTO_RID)
@Slf4j
public class LabTestObservationRidSearchStrategy extends SearchStrategyExtended<LabTestObservation> {

    @Autowired
    private LabTestObservationRepository labTestObservationRepository;

    @Override
    public Page<LabTestObservation> search(List<SearchData> searchData, Pageable pageable) {
        Map<String, List<String>> dataMap = getSearchDataMap(searchData, SearchConstants.EXPECTED_SIZE_ONE);

        List<Integer> rids = dataMap.getOrDefault(LabTestObservationConstants.KEY_LTO_RID, List.of()).stream()
                .filter(val -> val.matches(CommonConstants.NUMERIC_REGEX))
                .map(Integer::valueOf)
                .toList();

        log.info("Searching lab test observation by rid: {}", rids);

        return labTestObservationRepository.findAllByRidIn(rids, pageable);
    }

    @Override
    public String getDefaultSortField() {
        return LabTestObservationConstants.COLUMN_RID;
    }
}
