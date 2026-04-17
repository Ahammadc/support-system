package com.medicssupport.support.clinical.clinical.controller;

import com.medicssupport.support.application.core.layer.SuperController;
import com.medicssupport.support.application.model.ApiResponse;
import com.medicssupport.support.clinical.clinical.converter.PatientConverter;
import com.medicssupport.support.clinical.clinical.model.patient.PatientDTO;
import com.medicssupport.support.clinical.clinical.model.patient.PatientConstants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.medicssupport.support.clinical.clinical.service.PatientService;
import com.medicssupport.support.clinical.clinical.model.patient.Patient;

@RequestMapping(PatientConstants.PATH_PATIENT)
@RestController
@Slf4j
public class PatientController extends SuperController<Patient, PatientDTO, Long> {

	private final PatientService patientService;
	private final PatientConverter patientConverter;

	protected PatientController(PatientService patientService, PatientConverter patientConverter) {
		super(patientService, patientConverter);
		this.patientService = patientService;
		this.patientConverter = patientConverter;
	}

	/**
	 * Search patients by MRN
	 * GET method with Request Param
	 */
	@GetMapping(PatientConstants.PATH_MRN)
	public @ResponseBody ResponseEntity<ApiResponse<PatientDTO>> getPatientByMRN(@RequestParam String patientMRN) {
		Patient patient = patientService.getByMRN(patientMRN);
		return ResponseEntity.ok(ApiResponse.success(patientConverter.toDto(patient)));
	}

	@GetMapping(PatientConstants.PATH_HEALTH)
	public String start() {
		return PatientConstants.MSG_HEALTH_CHECK;
	}
}