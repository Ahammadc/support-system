package com.medicssupport.support.clinical.clinical.converter;

import com.medicssupport.support.application.core.layer.BaseConverter;
import com.medicssupport.support.clinical.clinical.model.appt_resource_mapping.ApptResourceMapping;
import com.medicssupport.support.clinical.clinical.model.appt_resource_mapping.ApptResourceMappingDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ApptResourceMappingConverter implements BaseConverter<ApptResourceMapping, ApptResourceMappingDTO> {

    @Override
    public ApptResourceMappingDTO toDto(ApptResourceMapping entity) {
        if (entity == null) {
            return null;
        }
        ApptResourceMappingDTO dto = new ApptResourceMappingDTO();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

    @Override
    public ApptResourceMapping toEntity(ApptResourceMappingDTO dto) {
        if (dto == null) {
            return null;
        }
        ApptResourceMapping entity = new ApptResourceMapping();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }

    @Override
    public List<ApptResourceMappingDTO> toDtoList(List<ApptResourceMapping> entities) {
        if (entities == null) {
            return null;
        }
        return entities.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<ApptResourceMapping> toEntityList(List<ApptResourceMappingDTO> dtos) {
        if (dtos == null) {
            return null;
        }
        return dtos.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }
}
