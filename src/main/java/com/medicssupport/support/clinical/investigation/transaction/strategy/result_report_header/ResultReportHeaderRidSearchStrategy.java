package com.medicssupport.support.clinical.investigation.transaction.strategy.result_report_header;

import com.medicssupport.support.application.constants.CommonConstants;
import com.medicssupport.support.clinical.investigation.transaction.model.result_report_header.ResultReportHeader;
import com.medicssupport.support.clinical.investigation.transaction.model.result_report_header.ResultReportHeaderConstants;
import com.medicssupport.support.clinical.investigation.transaction.repository.ResultReportHeaderRepository;
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

@Component(ResultReportHeaderConstants.STRATEGY_RPT_RID)
@Slf4j
public class ResultReportHeaderRidSearchStrategy extends SearchStrategyExtended<ResultReportHeader> {

    @Autowired
    private ResultReportHeaderRepository repository;

    @Override
    public Page<ResultReportHeader> search(List<SearchData> searchData, Pageable pageable) {
        Map<String, List<String>> dataMap = getSearchDataMap(searchData, SearchConstants.EXPECTED_SIZE_ONE);

        List<Integer> rptRids = dataMap.getOrDefault(ResultReportHeaderConstants.KEY_RPT_RID, List.of()).stream()
                .filter(val -> val.matches(CommonConstants.NUMERIC_REGEX))
                .map(Integer::valueOf)
                .toList();

        log.info("Searching result report header by rpt_rid: {}", rptRids);

        return repository.findAllByRptRidIn(rptRids, pageable);
    }

    @Override
    public String getDefaultSortField() {
        return ResultReportHeaderConstants.COLUMN_RPT_RID;
    }
}
