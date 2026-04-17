package com.medicssupport.support.clinical.investigation.transaction.controller;

import com.medicssupport.support.application.core.layer.SuperController;
import com.medicssupport.support.clinical.investigation.transaction.converter.ServiceOrderConverter;
import com.medicssupport.support.clinical.investigation.transaction.model.service_order.ServiceOrder;
import com.medicssupport.support.clinical.investigation.transaction.model.service_order.ServiceOrderConstants;
import com.medicssupport.support.clinical.investigation.transaction.model.service_order.ServiceOrderDTO;
import com.medicssupport.support.clinical.investigation.transaction.service.ServiceOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(ServiceOrderConstants.PATH_SERVICE_ORDER)
@RestController
@Slf4j
public class ServiceOrderController extends SuperController<ServiceOrder, ServiceOrderDTO, Integer> {

    protected ServiceOrderController(ServiceOrderService service, ServiceOrderConverter converter) {
        super(service, converter);
    }
}
