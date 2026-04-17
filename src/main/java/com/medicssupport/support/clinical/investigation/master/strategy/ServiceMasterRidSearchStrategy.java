package com.medicssupport.support.clinical.investigation.master.strategy;

import com.medicssupport.support.application.constants.CommonConstants;
import com.medicssupport.support.clinical.investigation.master.model.service_master.ServiceMaster;
import com.medicssupport.support.clinical.investigation.master.model.service_master.ServiceMasterConstants;
import com.medicssupport.support.clinical.investigation.master.repository.ServiceMasterRepository;
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

@Component(ServiceMasterConstants.STRATEGY_SER_RID)
@Slf4j
public class ServiceMasterRidSearchStrategy extends SearchStrategyExtended<ServiceMaster> {

    @Autowired
    private ServiceMasterRepository serviceMasterRepository;

    @Override
    public Page<ServiceMaster> search(List<SearchData> searchData, Pageable pageable) {
        Map<String, List<String>> dataMap = getSearchDataMap(searchData, SearchConstants.EXPECTED_SIZE_ONE);

        List<Integer> rids = dataMap.getOrDefault(ServiceMasterConstants.KEY_SER_RID, List.of()).stream()
                .filter(val -> val.matches(CommonConstants.NUMERIC_REGEX))
                .map(Integer::valueOf)
                .toList();

        log.info("Searching service master by rid: {}", rids);

        return serviceMasterRepository.findAllByRidIn(rids, pageable);
    }

    @Override
    public String getDefaultSortField() {
        return ServiceMasterConstants.COLUMN_RID;
    }
}
