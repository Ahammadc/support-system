package com.medicssupport.support.clinical.investigation.transaction.strategy.result_observation;

import com.medicssupport.support.application.constants.CommonConstants;
import com.medicssupport.support.clinical.investigation.transaction.model.result_observation.ResultObservation;
import com.medicssupport.support.clinical.investigation.transaction.model.result_observation.ResultObservationConstants;
import com.medicssupport.support.clinical.investigation.transaction.repository.ResultObservationRepository;
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

@Component(ResultObservationConstants.STRATEGY_RO_RID)
@Slf4j
public class ResultObservationRidSearchStrategy extends SearchStrategyExtended<ResultObservation> {

    @Autowired
    private ResultObservationRepository repository;

    @Override
    public Page<ResultObservation> search(List<SearchData> searchData, Pageable pageable) {
        Map<String, List<String>> dataMap = getSearchDataMap(searchData, SearchConstants.EXPECTED_SIZE_ONE);

        List<Integer> roRids = dataMap.getOrDefault(ResultObservationConstants.KEY_RO_RID, List.of()).stream()
                .filter(val -> val.matches(CommonConstants.NUMERIC_REGEX))
                .map(Integer::valueOf)
                .toList();

        log.info("Searching result observation by ro_rid: {}", roRids);

        return repository.findAllByRoRidIn(roRids, pageable);
    }

    @Override
    public String getDefaultSortField() {
        return ResultObservationConstants.COLUMN_RO_RID;
    }
}
