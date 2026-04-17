package com.medicssupport.support.clinical.investigation.master.repository;

import com.medicssupport.support.clinical.investigation.master.model.lab_service_details.LabServiceDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;

@Repository
public interface LabServiceDetailsRepository extends JpaRepository<LabServiceDetails, Integer> {
    Page<LabServiceDetails> findAllBySerRidIn(List<Integer> serRids, Pageable pageable);
    Page<LabServiceDetails> findAllByResultParameterRidIn(List<Integer> resultParameterRids, Pageable pageable);
}
