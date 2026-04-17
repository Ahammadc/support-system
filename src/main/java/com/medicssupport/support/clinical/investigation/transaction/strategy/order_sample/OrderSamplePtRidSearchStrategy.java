package com.medicssupport.support.clinical.investigation.transaction.strategy.order_sample;

import com.medicssupport.support.application.constants.CommonConstants;
import com.medicssupport.support.clinical.investigation.transaction.model.order_sample.OrderSample;
import com.medicssupport.support.clinical.investigation.transaction.model.order_sample.OrderSampleConstants;
import com.medicssupport.support.clinical.investigation.transaction.repository.OrderSampleRepository;
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

@Component(OrderSampleConstants.STRATEGY_SM_PT_RID)
@Slf4j
public class OrderSamplePtRidSearchStrategy extends SearchStrategyExtended<OrderSample> {

    @Autowired
    private OrderSampleRepository orderSampleRepository;

    @Override
    public Page<OrderSample> search(List<SearchData> searchData, Pageable pageable) {
        Map<String, List<String>> dataMap = getSearchDataMap(searchData, SearchConstants.EXPECTED_SIZE_ONE);

        List<Integer> smPtRids = dataMap.getOrDefault(OrderSampleConstants.KEY_SM_PT_RID, List.of()).stream()
                .filter(val -> val.matches(CommonConstants.NUMERIC_REGEX))
                .map(Integer::valueOf)
                .toList();

        log.info("Searching order sample by sm_pt_rid: {}", smPtRids);

        return orderSampleRepository.findAllBySmPtRidIn(smPtRids, pageable);
    }

    @Override
    public String getDefaultSortField() {
        return OrderSampleConstants.COLUMN_SM_RID;
    }
}
