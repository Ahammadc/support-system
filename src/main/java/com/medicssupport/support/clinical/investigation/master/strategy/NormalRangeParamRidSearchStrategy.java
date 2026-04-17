package com.medicssupport.support.clinical.investigation.master.strategy;

import com.medicssupport.support.application.constants.CommonConstants;
import com.medicssupport.support.clinical.investigation.master.model.normal_range.NormalRange;
import com.medicssupport.support.clinical.investigation.master.model.normal_range.NormalRangeConstants;
import com.medicssupport.support.clinical.investigation.master.repository.NormalRangeRepository;
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

@Component(NormalRangeConstants.STRATEGY_NR_PARAM_RID)
@Slf4j
public class NormalRangeParamRidSearchStrategy extends SearchStrategyExtended<NormalRange> {

    @Autowired
    private NormalRangeRepository normalRangeRepository;

    @Override
    public Page<NormalRange> search(List<SearchData> searchData, Pageable pageable) {
        Map<String, List<String>> dataMap = getSearchDataMap(searchData, SearchConstants.EXPECTED_SIZE_ONE);

        List<Integer> paramRids = dataMap.getOrDefault(NormalRangeConstants.KEY_NR_PARAM_RID, List.of()).stream()
                .filter(val -> val.matches(CommonConstants.NUMERIC_REGEX))
                .map(Integer::valueOf)
                .toList();

        log.info("Searching normal range by param_rid: {}", paramRids);

        return normalRangeRepository.findAllByParamRidIn(paramRids, pageable);
    }

    @Override
    public String getDefaultSortField() {
        return NormalRangeConstants.COLUMN_RID;
    }
}
