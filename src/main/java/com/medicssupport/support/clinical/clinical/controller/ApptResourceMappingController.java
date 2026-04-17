package com.medicssupport.support.clinical.clinical.controller;

import com.medicssupport.support.application.core.layer.SuperController;
import com.medicssupport.support.clinical.clinical.converter.ApptResourceMappingConverter;
import com.medicssupport.support.clinical.clinical.model.appt_resource_mapping.ApptResourceMapping;
import com.medicssupport.support.clinical.clinical.model.appt_resource_mapping.ApptResourceMappingDTO;
import com.medicssupport.support.clinical.clinical.model.appt_resource_mapping.ApptResourceMappingConstants;
import com.medicssupport.support.clinical.clinical.service.ApptResourceMappingService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping(ApptResourceMappingConstants.PATH_APPOINTMENT_RESOURCE_MAPPING)
@RestController
public class ApptResourceMappingController extends SuperController<ApptResourceMapping, ApptResourceMappingDTO, Integer> {

    protected ApptResourceMappingController(ApptResourceMappingService apptResourceMappingService, ApptResourceMappingConverter apptResourceMappingConverter) {
        super(apptResourceMappingService, apptResourceMappingConverter);
    }
}
