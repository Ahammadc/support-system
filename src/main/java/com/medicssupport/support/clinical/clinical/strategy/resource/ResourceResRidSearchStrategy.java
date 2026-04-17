package com.medicssupport.support.clinical.clinical.strategy.resource;

import com.medicssupport.support.application.constants.CommonConstants;
import com.medicssupport.support.clinical.clinical.model.resource.Resource;
import com.medicssupport.support.clinical.clinical.model.resource.ResourceConstants;
import com.medicssupport.support.clinical.clinical.repository.ResourceRepository;
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

@Component(ResourceConstants.STRATEGY_RES_RID)
@Slf4j
public class ResourceResRidSearchStrategy extends SearchStrategyExtended<Resource> {

    @Autowired
    private ResourceRepository resourceRepository;

    @Override
    public Page<Resource> search(List<SearchData> searchData, Pageable pageable) {
        Map<String, List<String>> dataMap = getSearchDataMap(searchData, SearchConstants.EXPECTED_SIZE_ONE);

        List<Integer> resRids = dataMap.getOrDefault(ResourceConstants.KEY_RES_RID, List.of()).stream()
                .filter(val -> val.matches(CommonConstants.NUMERIC_REGEX))
                .map(Integer::valueOf)
                .toList();

        log.info("Searching resource by res_rid: {}", resRids);

        return resourceRepository.findAllByResRidIn(resRids, pageable);
    }

    @Override
    public String getDefaultSortField() {
        return ResourceConstants.COLUMN_RES_RID;
    }
}
