package com.medicssupport.support.clinical.clinical.strategy.visit;

import com.medicssupport.support.clinical.clinical.model.visit.Visit;
import com.medicssupport.support.clinical.clinical.model.visit.VisitConstants;
import com.medicssupport.support.clinical.clinical.repository.VisitRepository;
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
import java.util.stream.Collectors;

@Component(VisitConstants.STRATEGY_VISIT_PATIENT_RID)
@Slf4j
public class PatRidSearchStrategy extends SearchStrategyExtended<Visit> {

    @Autowired
    private VisitRepository visitRepository;

    @Override
    public Page<Visit> search(List<SearchData> searchData, Pageable pageable) {
        Map<String, List<String>> dataMap = getSearchDataMap(searchData, SearchConstants.EXPECTED_SIZE_ONE);
        List<String> visitPatientRids = dataMap.getOrDefault(VisitConstants.KEY_VISIT_PATIENT_RID, List.of());

        log.info("Searching visits by Pat RID: {}", visitPatientRids);
        List<Integer> integerValues = visitPatientRids.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        return visitRepository.findAllByVisitPatientRidIn(integerValues, pageable);
    }

    @Override
    public String getDefaultSortField() {
        return VisitConstants.COLUMN_VISIT_RID;
    }
}
