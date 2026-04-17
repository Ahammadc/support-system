package com.medicssupport.support.clinical.investigation.transaction.service.implement;

import com.medicssupport.support.application.core.layer.SuperServiceImpl;
import com.medicssupport.support.clinical.investigation.transaction.model.order_sample.OrderSample;
import com.medicssupport.support.clinical.investigation.transaction.repository.OrderSampleRepository;
import com.medicssupport.support.clinical.investigation.transaction.service.OrderSampleService;
import com.medicssupport.support.search.service.SearchStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@Slf4j
public class OrderSampleServiceImplement extends SuperServiceImpl<OrderSample, Integer> implements OrderSampleService {

    @Autowired
    public OrderSampleServiceImplement(OrderSampleRepository repository, Map<String, SearchStrategy<OrderSample>> searchStrategies) {
        super(repository, searchStrategies);
    }
}
