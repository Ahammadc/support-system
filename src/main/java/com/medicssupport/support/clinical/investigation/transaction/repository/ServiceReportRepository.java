package com.medicssupport.support.clinical.investigation.transaction.repository;

import com.medicssupport.support.clinical.investigation.transaction.model.service_report.ServiceReport;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceReportRepository extends JpaRepository<ServiceReport, Integer> {
    Page<ServiceReport> findAllBySrRdRidIn(List<Integer> srRdRids, Pageable pageable);
}
