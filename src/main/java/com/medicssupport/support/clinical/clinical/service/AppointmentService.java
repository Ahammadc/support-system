package com.medicssupport.support.clinical.clinical.service;

import com.medicssupport.support.application.core.layer.SuperService;
import com.medicssupport.support.clinical.clinical.model.appointment.Appointment;
import org.springframework.stereotype.Service;

@Service
public interface AppointmentService extends SuperService<Appointment, Integer> {}
