package com.medicssupport.support.clinical.clinical.repository;

import com.medicssupport.support.clinical.clinical.model.appt_resource_mapping.ApptResourceMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;

@Repository
public interface ApptResourceMappingRepository extends JpaRepository<ApptResourceMapping, Integer> {
    Page<ApptResourceMapping> findAllByArmRidIn(List<Integer> armRids, Pageable pageable);
    Page<ApptResourceMapping> findAllByArmResourceRidIn(List<Integer> armResourceRids, Pageable pageable);
}
