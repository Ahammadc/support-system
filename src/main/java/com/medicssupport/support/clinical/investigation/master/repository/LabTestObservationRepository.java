package com.medicssupport.support.clinical.investigation.master.repository;

import com.medicssupport.support.clinical.investigation.master.model.lab_test_observation.LabTestObservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;

@Repository
public interface LabTestObservationRepository extends JpaRepository<LabTestObservation, Integer> {
    Page<LabTestObservation> findAllByRidIn(List<Integer> rids, Pageable pageable);
    Page<LabTestObservation> findAllBySerRidIn(List<Integer> serRids, Pageable pageable);
    Page<LabTestObservation> findAllByObservationNameContainingIgnoreCase(String observationName, Pageable pageable);
}
