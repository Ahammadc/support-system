package com.medicssupport.support.clinical.clinical.converter;

import com.medicssupport.support.application.core.layer.BaseConverter;
import com.medicssupport.support.clinical.clinical.model.unit.Unit;
import com.medicssupport.support.clinical.clinical.model.unit.UnitDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UnitConverter implements BaseConverter<Unit, UnitDTO> {

    @Override
    public UnitDTO toDto(Unit entity) {
        if (entity == null) {
            return null;
        }
        UnitDTO dto = new UnitDTO();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

    @Override
    public Unit toEntity(UnitDTO dto) {
        if (dto == null) {
            return null;
        }
        Unit entity = new Unit();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }

    @Override
    public List<UnitDTO> toDtoList(List<Unit> entities) {
        if (entities == null) {
            return null;
        }
        return entities.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<Unit> toEntityList(List<UnitDTO> dtos) {
        if (dtos == null) {
            return null;
        }
        return dtos.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }
}
