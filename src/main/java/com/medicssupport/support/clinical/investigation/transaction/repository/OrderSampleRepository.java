package com.medicssupport.support.clinical.investigation.transaction.repository;

import com.medicssupport.support.clinical.investigation.transaction.model.order_sample.OrderSample;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderSampleRepository extends JpaRepository<OrderSample, Integer> {
    Page<OrderSample> findAllBySmRidIn(List<Integer> smRids, Pageable pageable);
    Page<OrderSample> findAllBySmPtRidIn(List<Integer> smPtRids, Pageable pageable);
    Page<OrderSample> findAllBySmIdInAndSmEntityRidIn(List<String> smIds, List<Integer> smEntityRids, Pageable pageable);
}
