package com.medicssupport.support.clinical.clinical.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.medicssupport.support.clinical.clinical.model.patient.Patient;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
	Patient findByPatMRN(String patMRN);

	List<Patient> findAllByPatMRNIn(List<String> patientMrnList);

	Page<Patient> findAllByPatMRNIn(List<String> patientMrnList, Pageable pageable);

	Page<Patient> findByPatPhoneIn(List<String> patientMrnList, Pageable pageable);
}
