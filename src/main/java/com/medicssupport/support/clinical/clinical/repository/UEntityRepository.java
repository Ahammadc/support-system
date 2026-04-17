package com.medicssupport.support.clinical.clinical.repository;

import com.medicssupport.support.clinical.clinical.model.entity.UEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;

@Repository
public interface UEntityRepository extends JpaRepository<UEntity, Integer> {
    Page<UEntity> findAllByEntRidIn(List<Integer> entRids, Pageable pageable);
    Page<UEntity> findAllByEntCodeIn(List<String> entCodes, Pageable pageable);
    Page<UEntity> findAllByEntParentRidIn(List<Integer> entParentRids, Pageable pageable);
    Page<UEntity> findAllByEntModelRidIn(List<Integer> entModelRids, Pageable pageable);
    Page<UEntity> findAllByEntParentRidInAndEntTypeIn(List<Integer> entParentRids, List<Integer> entTypes, Pageable pageable);
}
