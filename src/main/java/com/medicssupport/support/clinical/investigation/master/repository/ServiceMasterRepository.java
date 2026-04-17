package com.medicssupport.support.clinical.investigation.master.repository;

import com.medicssupport.support.clinical.investigation.master.model.service_master.ServiceMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;

@Repository
public interface ServiceMasterRepository extends JpaRepository<ServiceMaster, Integer> {
    Page<ServiceMaster> findAllByRidIn(List<Integer> rids, Pageable pageable);
    Page<ServiceMaster> findAllByCodeContainingIgnoreCase(String code, Pageable pageable);
    Page<ServiceMaster> findAllByNameContainingIgnoreCase(String name, Pageable pageable);
}
