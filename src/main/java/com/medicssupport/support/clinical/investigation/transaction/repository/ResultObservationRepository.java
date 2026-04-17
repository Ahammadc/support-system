package com.medicssupport.support.clinical.investigation.transaction.repository;

import com.medicssupport.support.clinical.investigation.transaction.model.result_observation.ResultObservation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResultObservationRepository extends JpaRepository<ResultObservation, Integer> {
    Page<ResultObservation> findAllByRoRidIn(List<Integer> roRids, Pageable pageable);
    Page<ResultObservation> findAllByRoRdRidIn(List<Integer> roRdRids, Pageable pageable);
}
