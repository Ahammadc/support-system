package com.medicssupport.support.clinical.clinical.converter;

import com.medicssupport.support.application.core.layer.BaseConverter;
import com.medicssupport.support.clinical.clinical.model.resource.Resource;
import com.medicssupport.support.clinical.clinical.model.resource.ResourceDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ResourceConverter implements BaseConverter<Resource, ResourceDTO> {

    @Override
    public ResourceDTO toDto(Resource entity) {
        if (entity == null) {
            return null;
        }
        ResourceDTO dto = new ResourceDTO();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

    @Override
    public Resource toEntity(ResourceDTO dto) {
        if (dto == null) {
            return null;
        }
        Resource entity = new Resource();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }

    @Override
    public List<ResourceDTO> toDtoList(List<Resource> entities) {
        if (entities == null) {
            return null;
        }
        return entities.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<Resource> toEntityList(List<ResourceDTO> dtos) {
        if (dtos == null) {
            return null;
        }
        return dtos.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }
}
