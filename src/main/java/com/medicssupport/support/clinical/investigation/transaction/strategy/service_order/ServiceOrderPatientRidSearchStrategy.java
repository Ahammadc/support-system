package com.medicssupport.support.clinical.investigation.transaction.strategy.service_order;

import com.medicssupport.support.application.constants.CommonConstants;
import com.medicssupport.support.clinical.investigation.transaction.model.service_order.ServiceOrder;
import com.medicssupport.support.clinical.investigation.transaction.model.service_order.ServiceOrderConstants;
import com.medicssupport.support.clinical.investigation.transaction.repository.ServiceOrderRepository;
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

@Component(ServiceOrderConstants.STRATEGY_SO_PATIENT_RID)
@Slf4j
public class ServiceOrderPatientRidSearchStrategy extends SearchStrategyExtended<ServiceOrder> {

    @Autowired
    private ServiceOrderRepository repository;

    @Override
    public Page<ServiceOrder> search(List<SearchData> searchData, Pageable pageable) {
        Map<String, List<String>> dataMap = getSearchDataMap(searchData, SearchConstants.EXPECTED_SIZE_ONE);

        List<Integer> soPatientRids = dataMap.getOrDefault(ServiceOrderConstants.KEY_SO_PATIENT_RID, List.of()).stream()
                .filter(val -> val.matches(CommonConstants.NUMERIC_REGEX))
                .map(Integer::valueOf)
                .toList();

        log.info("Searching service order by so_patient_rid: {}", soPatientRids);

        return repository.findAllBySoPatientRidIn(soPatientRids, pageable);
    }

    @Override
    public String getDefaultSortField() {
        return ServiceOrderConstants.COLUMN_SO_RID;
    }
}
