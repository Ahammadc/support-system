package com.medicssupport.support.clinical.investigation.transaction.controller;

import com.medicssupport.support.application.core.layer.SuperController;
import com.medicssupport.support.clinical.investigation.transaction.converter.OrderSampleConverter;
import com.medicssupport.support.clinical.investigation.transaction.model.order_sample.OrderSample;
import com.medicssupport.support.clinical.investigation.transaction.model.order_sample.OrderSampleConstants;
import com.medicssupport.support.clinical.investigation.transaction.model.order_sample.OrderSampleDTO;
import com.medicssupport.support.clinical.investigation.transaction.service.OrderSampleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(OrderSampleConstants.PATH_ORDER_SAMPLE)
@RestController
@Slf4j
public class OrderSampleController extends SuperController<OrderSample, OrderSampleDTO, Integer> {

    protected OrderSampleController(OrderSampleService service, OrderSampleConverter converter) {
        super(service, converter);
    }
}
