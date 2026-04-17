package com.medicssupport.support.clinical.investigation.master.repository;

import com.medicssupport.support.clinical.investigation.master.model.lab_test_params.LabTestParams;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;

@Repository
public interface LabTestParamsRepository extends JpaRepository<LabTestParams, Integer> {
    Page<LabTestParams> findAllByRidIn(List<Integer> rids, Pageable pageable);
    Page<LabTestParams> findAllByCategoryRidIn(List<Integer> categoryRids, Pageable pageable);
    Page<LabTestParams> findAllByNameContainingIgnoreCase(String name, Pageable pageable);
}
