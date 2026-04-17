package com.medicssupport.support.clinical.clinical.repository;

import com.medicssupport.support.clinical.clinical.model.unit.Unit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;

@Repository
public interface UnitRepository extends JpaRepository<Unit, Integer> {
    Page<Unit> findAllByUnitRidIn(List<Integer> unitRids, Pageable pageable);
    Page<Unit> findAllByUnitCodeIn(List<String> unitCodes, Pageable pageable);
    Page<Unit> findAllByUnitNameIn(List<String> unitNames, Pageable pageable);
    Page<Unit> findAllByUnitEntRidIn(List<Integer> unitEntRids, Pageable pageable);
}
