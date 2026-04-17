package com.medicssupport.support.clinical.clinical.converter;

import com.medicssupport.support.application.core.layer.BaseConverter;
import com.medicssupport.support.clinical.clinical.model.visit.Visit;
import com.medicssupport.support.clinical.clinical.model.visit.VisitDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class VisitConverter implements BaseConverter<Visit, VisitDTO> {

    @Override
    public VisitDTO toDto(Visit entity) {
        if (entity == null) {
            return null;
        }
        VisitDTO dto = new VisitDTO();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

    @Override
    public Visit toEntity(VisitDTO dto) {
        if (dto == null) {
            return null;
        }
        Visit entity = new Visit();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }

    @Override
    public List<VisitDTO> toDtoList(List<Visit> entities) {
        if (entities == null) {
            return null;
        }
        return entities.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<Visit> toEntityList(List<VisitDTO> dtos) {
        if (dtos == null) {
            return null;
        }
        return dtos.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }
}
