package com.medicssupport.support.clinical.clinical.converter;

import com.medicssupport.support.application.core.layer.BaseConverter;
import com.medicssupport.support.clinical.clinical.model.patient.Patient;
import com.medicssupport.support.clinical.clinical.model.patient.PatientDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PatientConverter implements BaseConverter<Patient, PatientDTO> {

    @Override
    public PatientDTO toDto(Patient entity) {
        if (entity == null) {
            return null;
        }
        PatientDTO dto = new PatientDTO();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

    @Override
    public Patient toEntity(PatientDTO dto) {
        if (dto == null) {
            return null;
        }
        Patient entity = new Patient();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }

    @Override
    public List<PatientDTO> toDtoList(List<Patient> entities) {
        if (entities == null) {
            return null;
        }
        return entities.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<Patient> toEntityList(List<PatientDTO> dtos) {
        if (dtos == null) {
            return null;
        }
        return dtos.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }
}
