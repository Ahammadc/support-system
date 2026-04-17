package com.medicssupport.support.clinical.investigation.master.strategy;

import com.medicssupport.support.clinical.investigation.master.model.age_category.AgeCategory;
import com.medicssupport.support.clinical.investigation.master.model.age_category.AgeCategoryConstants;
import com.medicssupport.support.clinical.investigation.master.repository.AgeCategoryRepository;
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

@Component(AgeCategoryConstants.STRATEGY_AC_DESCRIPTION)
@Slf4j
public class AgeCategoryDescriptionSearchStrategy extends SearchStrategyExtended<AgeCategory> {

    @Autowired
    private AgeCategoryRepository ageCategoryRepository;

    @Override
    public Page<AgeCategory> search(List<SearchData> searchData, Pageable pageable) {
        Map<String, List<String>> dataMap = getSearchDataMap(searchData, SearchConstants.EXPECTED_SIZE_ONE);

        String description = dataMap.getOrDefault(AgeCategoryConstants.KEY_AC_DESCRIPTION, List.of("")).get(0);

        log.info("Searching age category by description: {}", description);

        return ageCategoryRepository.findAllByDescriptionContainingIgnoreCase(description, pageable);
    }

    @Override
    public String getDefaultSortField() {
        return AgeCategoryConstants.COLUMN_RID;
    }
}
