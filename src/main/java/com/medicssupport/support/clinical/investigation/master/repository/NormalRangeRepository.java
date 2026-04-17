package com.medicssupport.support.clinical.investigation.master.repository;

import com.medicssupport.support.clinical.investigation.master.model.normal_range.NormalRange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;

@Repository
public interface NormalRangeRepository extends JpaRepository<NormalRange, Integer> {
    Page<NormalRange> findAllByRidIn(List<Integer> rids, Pageable pageable);
    Page<NormalRange> findAllByAcRidIn(List<Integer> acRids, Pageable pageable);
    Page<NormalRange> findAllByParamRidIn(List<Integer> paramRids, Pageable pageable);
}
