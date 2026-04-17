package com.medicssupport.support.clinical.clinical.service;

import com.medicssupport.support.application.core.layer.SuperService;
import com.medicssupport.support.clinical.clinical.model.admission_request.AdmissionRequest;
import org.springframework.stereotype.Service;

@Service
public interface AdmissionRequestService extends SuperService<AdmissionRequest, Integer> {}
