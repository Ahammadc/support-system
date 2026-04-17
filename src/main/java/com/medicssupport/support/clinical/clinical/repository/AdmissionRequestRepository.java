package com.medicssupport.support.clinical.clinical.repository;

import com.medicssupport.support.clinical.clinical.model.admission_request.AdmissionRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;

@Repository
public interface AdmissionRequestRepository extends JpaRepository<AdmissionRequest, Integer> {
    Page<AdmissionRequest> findAllByReqRidIn(List<Integer> reqRids, Pageable pageable);
    Page<AdmissionRequest> findAllByReqPatientRidIn(List<Integer> reqPatientRids, Pageable pageable);
}
