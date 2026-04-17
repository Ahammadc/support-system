package com.medicssupport.support.clinical.clinical.repository;

import com.medicssupport.support.clinical.clinical.model.resource.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;

@Repository
public interface ResourceRepository extends JpaRepository<Resource, Integer> {
    Page<Resource> findAllByResRidIn(List<Integer> resRids, Pageable pageable);
    Page<Resource> findAllByResEntRidIn(List<Integer> resEntRids, Pageable pageable);
}
