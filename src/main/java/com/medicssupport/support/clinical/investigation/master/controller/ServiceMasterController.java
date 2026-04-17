package com.medicssupport.support.clinical.investigation.master.controller;

import com.medicssupport.support.application.core.layer.SuperController;
import com.medicssupport.support.clinical.investigation.master.converter.ServiceMasterConverter;
import com.medicssupport.support.clinical.investigation.master.model.service_master.ServiceMaster;
import com.medicssupport.support.clinical.investigation.master.model.service_master.ServiceMasterDTO;
import com.medicssupport.support.clinical.investigation.master.model.service_master.ServiceMasterConstants;
import com.medicssupport.support.clinical.investigation.master.service.ServiceMasterService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping(ServiceMasterConstants.PATH_SERVICE_MASTER)
@RestController
public class ServiceMasterController extends SuperController<ServiceMaster, ServiceMasterDTO, Integer> {

    protected ServiceMasterController(ServiceMasterService serviceMasterService, ServiceMasterConverter serviceMasterConverter) {
        super(serviceMasterService, serviceMasterConverter);
    }
}
