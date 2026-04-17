package com.medicssupport.support.clinical.clinical.service.implement;

import com.medicssupport.support.application.core.layer.SuperServiceImpl;
import com.medicssupport.support.clinical.clinical.model.patient.Patient;
import com.medicssupport.support.clinical.clinical.repository.PatientRepository;
import com.medicssupport.support.clinical.clinical.service.PatientService;
import com.medicssupport.support.search.service.SearchStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PatientServiceImplemented extends SuperServiceImpl<Patient, Long> implements PatientService {

    private final PatientRepository patientRepository;

    @Autowired
    public PatientServiceImplemented(PatientRepository patientRepository, Map<String, SearchStrategy<Patient>> searchStrategies) {
        super(patientRepository, searchStrategies);
        this.patientRepository = patientRepository;
    }

    @Override
    public Patient getByMRN(String patientMRN) {
        return patientRepository.findByPatMRN(patientMRN);
    }

    @Override
    public List<Patient> getAllByMRNList(List<String> patientMRNList) {
        return patientRepository.findAllByPatMRNIn(patientMRNList);
    }
}

