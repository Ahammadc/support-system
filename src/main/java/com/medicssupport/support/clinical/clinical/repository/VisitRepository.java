package com.medicssupport.support.clinical.clinical.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.medicssupport.support.clinical.clinical.model.visit.Visit;
import java.util.List;


@Repository
public interface VisitRepository extends JpaRepository<Visit, Integer> {
	List<Visit> findByVisitPatientRid(Integer visitPatientRid);

	Page<Visit> findAllByVisitRidIn(List<Integer> visitRids, Pageable pageable);

	Page<Visit> findAllByVisitPatientRidIn(List<Integer> patRids, Pageable pageable);

	@Query("SELECT v.visitTypeIndex FROM Visit v WHERE v.visitRid = :visitRid")
	Integer findVisitTypeIndexByVisitRid(@Param("visitRid") Integer visitRid);}
