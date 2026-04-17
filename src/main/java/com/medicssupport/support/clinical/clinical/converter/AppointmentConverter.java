package com.medicssupport.support.clinical.clinical.converter;

import com.medicssupport.support.application.core.layer.BaseConverter;
import com.medicssupport.support.clinical.clinical.model.appointment.Appointment;
import com.medicssupport.support.clinical.clinical.model.appointment.AppointmentDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class AppointmentConverter implements BaseConverter<Appointment, AppointmentDTO> {

    @Override
    public AppointmentDTO toDto(Appointment entity) {
        if (entity == null) {
            return null;
        }
        AppointmentDTO dto = new AppointmentDTO();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

    @Override
    public Appointment toEntity(AppointmentDTO dto) {
        if (dto == null) {
            return null;
        }
        Appointment entity = new Appointment();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }

    @Override
    public List<AppointmentDTO> toDtoList(List<Appointment> entities) {
        if (entities == null) {
            return null;
        }
        return entities.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<Appointment> toEntityList(List<AppointmentDTO> dtos) {
        if (dtos == null) {
            return null;
        }
        return dtos.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }
}
