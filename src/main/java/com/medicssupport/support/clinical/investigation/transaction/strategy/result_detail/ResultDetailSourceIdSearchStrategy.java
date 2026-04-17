package com.medicssupport.support.clinical.investigation.transaction.strategy.result_detail;

import com.medicssupport.support.clinical.investigation.transaction.model.result_detail.ResultDetail;
import com.medicssupport.support.clinical.investigation.transaction.model.result_detail.ResultDetailConstants;
import com.medicssupport.support.clinical.investigation.transaction.repository.ResultDetailRepository;
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

@Component(ResultDetailConstants.STRATEGY_RD_SOURCE_ID)
@Slf4j
public class ResultDetailSourceIdSearchStrategy extends SearchStrategyExtended<ResultDetail> {

    @Autowired
    private ResultDetailRepository repository;

    @Override
    public Page<ResultDetail> search(List<SearchData> searchData, Pageable pageable) {
        Map<String, List<String>> dataMap = getSearchDataMap(searchData, SearchConstants.EXPECTED_SIZE_ONE);

        List<String> rdSourceIds = dataMap.getOrDefault(ResultDetailConstants.KEY_RD_SOURCE_ID, List.of());

        log.info("Searching result detail by rd_source_id: {}", rdSourceIds);

        return repository.findAllByRdSourceIdIn(rdSourceIds, pageable);
    }

    @Override
    public String getDefaultSortField() {
        return ResultDetailConstants.COLUMN_RD_RID;
    }
}
