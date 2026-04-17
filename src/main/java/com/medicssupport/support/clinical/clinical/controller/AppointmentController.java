package com.medicssupport.support.clinical.clinical.controller;

import com.medicssupport.support.application.core.layer.SuperController;
import com.medicssupport.support.clinical.clinical.converter.AppointmentConverter;
import com.medicssupport.support.clinical.clinical.model.appointment.Appointment;
import com.medicssupport.support.clinical.clinical.model.appointment.AppointmentDTO;
import com.medicssupport.support.clinical.clinical.model.appointment.AppointmentConstants;
import com.medicssupport.support.clinical.clinical.service.AppointmentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(AppointmentConstants.PATH_APPOINTMENT)
@RestController
public class AppointmentController extends SuperController<Appointment, AppointmentDTO, Integer> {

    protected AppointmentController(AppointmentService appointmentService, AppointmentConverter appointmentConverter) {
        super(appointmentService, appointmentConverter);
    }
}
