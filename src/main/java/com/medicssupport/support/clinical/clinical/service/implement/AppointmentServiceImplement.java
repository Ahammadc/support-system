package com.medicssupport.support.clinical.clinical.service.implement;

import com.medicssupport.support.application.core.layer.SuperServiceImpl;
import com.medicssupport.support.clinical.clinical.model.appointment.Appointment;
import com.medicssupport.support.clinical.clinical.repository.AppointmentRepository;
import com.medicssupport.support.clinical.clinical.service.AppointmentService;
import com.medicssupport.support.search.service.SearchStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Map;

@Service
public class AppointmentServiceImplement extends SuperServiceImpl<Appointment, Integer> implements AppointmentService {

    @Autowired
    public AppointmentServiceImplement(AppointmentRepository appointmentRepository, Map<String, SearchStrategy<Appointment>> searchStrategies) {
        super(appointmentRepository, searchStrategies);
    }
}
