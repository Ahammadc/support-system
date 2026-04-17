package com.medicssupport.support.clinical.clinical.strategy.appt_resource_mapping;

import com.medicssupport.support.application.constants.CommonConstants;
import com.medicssupport.support.clinical.clinical.model.appt_resource_mapping.ApptResourceMapping;
import com.medicssupport.support.clinical.clinical.model.appt_resource_mapping.ApptResourceMappingConstants;
import com.medicssupport.support.clinical.clinical.repository.ApptResourceMappingRepository;
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

@Component(ApptResourceMappingConstants.STRATEGY_ARM_RESOURCE_RID) // Renaming to reflect resource name/id search for consistency
@Slf4j
public class ApptResourceMappingResourceRidSearchStrategy extends SearchStrategyExtended<ApptResourceMapping> {

    @Autowired
    private ApptResourceMappingRepository apptResourceMappingRepository;

    @Override
    public Page<ApptResourceMapping> search(List<SearchData> searchData, Pageable pageable) {
        Map<String, List<String>> dataMap = getSearchDataMap(searchData, SearchConstants.EXPECTED_SIZE_ONE);

        List<Integer> armResourceRids = dataMap.getOrDefault(ApptResourceMappingConstants.KEY_ARM_RESOURCE_RID, List.of()).stream()
                .filter(val -> val.matches(CommonConstants.NUMERIC_REGEX))
                .map(Integer::valueOf)
                .toList();

        log.info("Searching appointment resource mapping by resource name (ID): {}", armResourceRids);

        return apptResourceMappingRepository.findAllByArmResourceRidIn(armResourceRids, pageable);
    }

    @Override
    public String getDefaultSortField() {
        return ApptResourceMappingConstants.COLUMN_APPOINTMENT_RESOURCE_ID;
    }
}
