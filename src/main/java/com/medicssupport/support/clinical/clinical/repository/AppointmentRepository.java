package com.medicssupport.support.clinical.clinical.repository;

import com.medicssupport.support.clinical.clinical.model.appointment.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {
    Page<Appointment> findAllByApptRidIn(List<Integer> apptRids, Pageable pageable);

    Page<Appointment> findAllByApptEntRidIn(List<Integer> apptEntRids, Pageable pageable);

    Page<Appointment> findAllByApptUnitRidIn(List<Integer> apptUnitRids, Pageable pageable);

    Page<Appointment> findAllByApptVisitRidIn(List<Integer> apptVisitRids, Pageable pageable);

    Page<Appointment> findAllByApptPatientRidIn(List<Integer> apptPatientRids, Pageable pageable);

    Page<Appointment> findAllByApptPatientMrnIn(List<String> apptPatientMrns, Pageable pageable);

    Page<Appointment> findAllByApptServiceProviderRidIn(List<Integer> serviceProviderRids, Pageable pageable);
}
