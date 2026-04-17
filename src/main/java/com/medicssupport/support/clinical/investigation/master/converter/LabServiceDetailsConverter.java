package com.medicssupport.support.clinical.investigation.master.converter;

import com.medicssupport.support.application.core.layer.BaseConverter;
import com.medicssupport.support.clinical.investigation.master.model.lab_service_details.LabServiceDetails;
import com.medicssupport.support.clinical.investigation.master.model.lab_service_details.LabServiceDetailsDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class LabServiceDetailsConverter implements BaseConverter<LabServiceDetails, LabServiceDetailsDTO> {

    @Override
    public LabServiceDetailsDTO toDto(LabServiceDetails entity) {
        if (entity == null) {
            return null;
        }
        LabServiceDetailsDTO dto = new LabServiceDetailsDTO();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

    @Override
    public LabServiceDetails toEntity(LabServiceDetailsDTO dto) {
        if (dto == null) {
            return null;
        }
        LabServiceDetails entity = new LabServiceDetails();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }

    @Override
    public List<LabServiceDetailsDTO> toDtoList(List<LabServiceDetails> entities) {
        if (entities == null) {
            return null;
        }
        return entities.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<LabServiceDetails> toEntityList(List<LabServiceDetailsDTO> dtos) {
        if (dtos == null) {
            return null;
        }
        return dtos.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }
}
