package com.medicssupport.support.clinical.clinical.service;

import com.medicssupport.support.application.core.layer.SuperService;
import com.medicssupport.support.application.model.PageResponse;
import com.medicssupport.support.search.model.SearchRequest;
import org.springframework.stereotype.Service;

import com.medicssupport.support.clinical.clinical.model.patient.Patient;

import java.util.List;

@Service
public interface PatientService extends SuperService<Patient, Long> {
	Patient getByMRN(String patientMRN);
	List<Patient> getAllByMRNList(List<String> patientMRNList);
}
