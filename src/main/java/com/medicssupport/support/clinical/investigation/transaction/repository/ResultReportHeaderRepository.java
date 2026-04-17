package com.medicssupport.support.clinical.investigation.transaction.repository;

import com.medicssupport.support.clinical.investigation.transaction.model.result_report_header.ResultReportHeader;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResultReportHeaderRepository extends JpaRepository<ResultReportHeader, Integer> {
    Page<ResultReportHeader> findAllByRptRidIn(List<Integer> rptRids, Pageable pageable);
}
