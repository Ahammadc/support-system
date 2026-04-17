package com.medicssupport.support.clinical.investigation.master.repository;

import com.medicssupport.support.clinical.investigation.master.model.age_category.AgeCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;

@Repository
public interface AgeCategoryRepository extends JpaRepository<AgeCategory, Integer> {
    Page<AgeCategory> findAllByRidIn(List<Integer> rids, Pageable pageable);
    Page<AgeCategory> findAllByDescriptionContainingIgnoreCase(String description, Pageable pageable);
}
