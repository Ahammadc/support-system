package com.medicssupport.support.clinical.clinical.strategy.unit;

import com.medicssupport.support.application.constants.CommonConstants;
import com.medicssupport.support.clinical.clinical.model.unit.Unit;
import com.medicssupport.support.clinical.clinical.model.unit.UnitConstants;
import com.medicssupport.support.clinical.clinical.repository.UnitRepository;
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

@Component(UnitConstants.STRATEGY_UNIT_ENT_RID)
@Slf4j
public class UnitEntRidSearchStrategy extends SearchStrategyExtended<Unit> {

    @Autowired
    private UnitRepository unitRepository;

    @Override
    public Page<Unit> search(List<SearchData> searchData, Pageable pageable) {
        Map<String, List<String>> dataMap = getSearchDataMap(searchData, SearchConstants.EXPECTED_SIZE_ONE);

        List<Integer> unitEntRids = dataMap.getOrDefault(UnitConstants.KEY_UNIT_ENT_RID, List.of()).stream()
                .filter(val -> val.matches(CommonConstants.NUMERIC_REGEX))
                .map(Integer::valueOf)
                .toList();

        log.info("Searching unit by unit_ent_rid: {}", unitEntRids);

        return unitRepository.findAllByUnitEntRidIn(unitEntRids, pageable);
    }

    @Override
    public String getDefaultSortField() {
        return UnitConstants.COLUMN_UNIT_RID;
    }
}
