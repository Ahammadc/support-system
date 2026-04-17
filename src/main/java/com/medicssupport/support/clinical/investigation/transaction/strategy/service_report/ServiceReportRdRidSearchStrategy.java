package com.medicssupport.support.clinical.investigation.transaction.strategy.service_report;

import com.medicssupport.support.application.constants.CommonConstants;
import com.medicssupport.support.clinical.investigation.transaction.model.service_report.ServiceReport;
import com.medicssupport.support.clinical.investigation.transaction.model.service_report.ServiceReportConstants;
import com.medicssupport.support.clinical.investigation.transaction.repository.ServiceReportRepository;
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

@Component(ServiceReportConstants.STRATEGY_SR_RD_RID)
@Slf4j
public class ServiceReportRdRidSearchStrategy extends SearchStrategyExtended<ServiceReport> {

    @Autowired
    private ServiceReportRepository repository;

    @Override
    public Page<ServiceReport> search(List<SearchData> searchData, Pageable pageable) {
        Map<String, List<String>> dataMap = getSearchDataMap(searchData, SearchConstants.EXPECTED_SIZE_ONE);

        List<Integer> srRdRids = dataMap.getOrDefault(ServiceReportConstants.KEY_SR_RD_RID, List.of()).stream()
                .filter(val -> val.matches(CommonConstants.NUMERIC_REGEX))
                .map(Integer::valueOf)
                .toList();

        log.info("Searching service report by sr_rd_rid: {}", srRdRids);

        return repository.findAllBySrRdRidIn(srRdRids, pageable);
    }

    @Override
    public String getDefaultSortField() {
        return ServiceReportConstants.COLUMN_SR_RD_RID;
    }
}
