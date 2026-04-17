package com.medicssupport.support.clinical.clinical.repository;

import com.medicssupport.support.clinical.clinical.model.staff.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Long> {
    Page<Staff> findAllByStaffRidIn(List<Long> staffRids, Pageable pageable);

    Page<Staff> findAllByStaffCodeInAndStaffEntityRidIn(List<String> staffCodes, List<Long> entityRids, Pageable pageable);
}
