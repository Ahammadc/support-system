package com.medicssupport.support.clinical.clinical.controller;

import com.medicssupport.support.application.core.layer.SuperController;
import com.medicssupport.support.clinical.clinical.converter.AdmissionRequestConverter;
import com.medicssupport.support.clinical.clinical.model.admission_request.AdmissionRequest;
import com.medicssupport.support.clinical.clinical.model.admission_request.AdmissionRequestDTO;
import com.medicssupport.support.clinical.clinical.model.admission_request.AdmissionRequestConstants;
import com.medicssupport.support.clinical.clinical.service.AdmissionRequestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping(AdmissionRequestConstants.PATH_ADMISSION_REQUEST)
@RestController
public class AdmissionRequestController extends SuperController<AdmissionRequest, AdmissionRequestDTO, Integer> {

    protected AdmissionRequestController(AdmissionRequestService admissionRequestService, AdmissionRequestConverter admissionRequestConverter) {
        super(admissionRequestService, admissionRequestConverter);
    }
}
