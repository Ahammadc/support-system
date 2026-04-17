package com.medicssupport.support.clinical.investigation.master.converter;

import com.medicssupport.support.application.core.layer.BaseConverter;
import com.medicssupport.support.clinical.investigation.master.model.lab_test_observation.LabTestObservation;
import com.medicssupport.support.clinical.investigation.master.model.lab_test_observation.LabTestObservationDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class LabTestObservationConverter implements BaseConverter<LabTestObservation, LabTestObservationDTO> {

    @Override
    public LabTestObservationDTO toDto(LabTestObservation entity) {
        if (entity == null) {
            return null;
        }
        LabTestObservationDTO dto = new LabTestObservationDTO();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

    @Override
    public LabTestObservation toEntity(LabTestObservationDTO dto) {
        if (dto == null) {
            return null;
        }
        LabTestObservation entity = new LabTestObservation();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }

    @Override
    public List<LabTestObservationDTO> toDtoList(List<LabTestObservation> entities) {
        if (entities == null) {
            return null;
        }
        return entities.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<LabTestObservation> toEntityList(List<LabTestObservationDTO> dtos) {
        if (dtos == null) {
            return null;
        }
        return dtos.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }
}
