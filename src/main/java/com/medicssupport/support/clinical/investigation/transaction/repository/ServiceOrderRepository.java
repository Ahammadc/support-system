package com.medicssupport.support.clinical.investigation.transaction.repository;

import com.medicssupport.support.clinical.investigation.transaction.model.service_order.ServiceOrder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceOrderRepository extends JpaRepository<ServiceOrder, Integer> {
    Page<ServiceOrder> findAllBySoRidIn(List<Integer> soRids, Pageable pageable);
    Page<ServiceOrder> findAllBySoPatientRidIn(List<Integer> soPatientRids, Pageable pageable);
    Page<ServiceOrder> findAllBySoVisitRidIn(List<Integer> soVisitRids, Pageable pageable);
}
