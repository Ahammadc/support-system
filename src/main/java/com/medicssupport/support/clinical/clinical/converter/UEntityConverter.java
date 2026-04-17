package com.medicssupport.support.clinical.clinical.converter;

import com.medicssupport.support.application.core.layer.BaseConverter;
import com.medicssupport.support.clinical.clinical.model.entity.UEntity;
import com.medicssupport.support.clinical.clinical.model.entity.UEntityDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UEntityConverter implements BaseConverter<UEntity, UEntityDTO> {

    @Override
    public UEntityDTO toDto(UEntity entity) {
        if (entity == null) {
            return null;
        }
        UEntityDTO dto = new UEntityDTO();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

    @Override
    public UEntity toEntity(UEntityDTO dto) {
        if (dto == null) {
            return null;
        }
        UEntity entity = new UEntity();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }

    @Override
    public List<UEntityDTO> toDtoList(List<UEntity> entities) {
        if (entities == null) {
            return null;
        }
        return entities.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<UEntity> toEntityList(List<UEntityDTO> dtos) {
        if (dtos == null) {
            return null;
        }
        return dtos.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }
}
