package com.medicssupport.support.clinical.clinical.strategy.entity;

import com.medicssupport.support.application.constants.CommonConstants;
import com.medicssupport.support.clinical.clinical.model.entity.UEntity;
import com.medicssupport.support.clinical.clinical.model.entity.UEntityConstants;
import com.medicssupport.support.clinical.clinical.repository.UEntityRepository;
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

@Component(UEntityConstants.STRATEGY_ENT_MODEL_RID)
@Slf4j
public class UEntityEntModelRidSearchStrategy extends SearchStrategyExtended<UEntity> {

    @Autowired
    private UEntityRepository uEntityRepository;

    @Override
    public Page<UEntity> search(List<SearchData> searchData, Pageable pageable) {
        Map<String, List<String>> dataMap = getSearchDataMap(searchData, SearchConstants.EXPECTED_SIZE_ONE);

        List<Integer> entModelRids = dataMap.getOrDefault(UEntityConstants.KEY_ENT_MODEL_RID, List.of()).stream()
                .filter(val -> val.matches(CommonConstants.NUMERIC_REGEX))
                .map(Integer::valueOf)
                .toList();

        log.info("Searching entity by ent_model_rid: {}", entModelRids);

        return uEntityRepository.findAllByEntModelRidIn(entModelRids, pageable);
    }

    @Override
    public String getDefaultSortField() {
        return UEntityConstants.COLUMN_ENT_RID;
    }
}
