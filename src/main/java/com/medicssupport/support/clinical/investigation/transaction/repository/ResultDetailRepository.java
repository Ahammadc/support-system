package com.medicssupport.support.clinical.investigation.transaction.repository;

import com.medicssupport.support.clinical.investigation.transaction.model.result_detail.ResultDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResultDetailRepository extends JpaRepository<ResultDetail, Long> {
    Page<ResultDetail> findAllByRdRidIn(List<Integer> rdRids, Pageable pageable);
    Page<ResultDetail> findAllByRdSourceIdIn(List<String> rdSourceIds, Pageable pageable);
    Page<ResultDetail> findAllByRdVisitRidIn(List<Integer> rdVisitRids, Pageable pageable);

    List<ResultDetail> findAllByRdSourceRidIn(List<Long> rdSourceId);

}
