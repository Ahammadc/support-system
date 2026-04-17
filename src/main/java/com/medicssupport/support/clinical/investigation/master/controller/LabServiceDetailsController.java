package com.medicssupport.support.clinical.investigation.master.controller;

import com.medicssupport.support.application.core.layer.SuperController;
import com.medicssupport.support.clinical.investigation.master.converter.LabServiceDetailsConverter;
import com.medicssupport.support.clinical.investigation.master.model.lab_service_details.LabServiceDetails;
import com.medicssupport.support.clinical.investigation.master.model.lab_service_details.LabServiceDetailsDTO;
import com.medicssupport.support.clinical.investigation.master.model.lab_service_details.LabServiceDetailsConstants;
import com.medicssupport.support.clinical.investigation.master.service.LabServiceDetailsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping(LabServiceDetailsConstants.PATH_LAB_SERVICE_DETAILS)
@RestController
public class LabServiceDetailsController extends SuperController<LabServiceDetails, LabServiceDetailsDTO, Integer> {

    protected LabServiceDetailsController(LabServiceDetailsService labServiceDetailsService, LabServiceDetailsConverter labServiceDetailsConverter) {
        super(labServiceDetailsService, labServiceDetailsConverter);
    }
}