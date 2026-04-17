package com.medicssupport.support.clinical.investigation.transaction.service.implement;

import com.medicssupport.support.application.core.layer.SuperServiceImpl;
import com.medicssupport.support.clinical.investigation.transaction.model.service_order.ServiceOrder;
import com.medicssupport.support.clinical.investigation.transaction.repository.ServiceOrderRepository;
import com.medicssupport.support.clinical.investigation.transaction.service.ServiceOrderService;
import com.medicssupport.support.search.service.SearchStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@Slf4j
public class ServiceOrderServiceImplement extends SuperServiceImpl<ServiceOrder, Integer> implements ServiceOrderService {

    @Autowired
    public ServiceOrderServiceImplement(ServiceOrderRepository repository, Map<String, SearchStrategy<ServiceOrder>> searchStrategies) {
        super(repository, searchStrategies);
    }
}
