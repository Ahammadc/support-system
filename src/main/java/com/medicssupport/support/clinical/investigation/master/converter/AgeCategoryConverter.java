package com.medicssupport.support.clinical.investigation.master.converter;

import com.medicssupport.support.application.core.layer.BaseConverter;
import com.medicssupport.support.clinical.investigation.master.model.age_category.AgeCategory;
import com.medicssupport.support.clinical.investigation.master.model.age_category.AgeCategoryDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class AgeCategoryConverter implements BaseConverter<AgeCategory, AgeCategoryDTO> {

    @Override
    public AgeCategoryDTO toDto(AgeCategory entity) {
        if (entity == null) {
            return null;
        }
        AgeCategoryDTO dto = new AgeCategoryDTO();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

    @Override
    public AgeCategory toEntity(AgeCategoryDTO dto) {
        if (dto == null) {
            return null;
        }
        AgeCategory entity = new AgeCategory();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }

    @Override
    public List<AgeCategoryDTO> toDtoList(List<AgeCategory> entities) {
        if (entities == null) {
            return null;
        }
        return entities.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<AgeCategory> toEntityList(List<AgeCategoryDTO> dtos) {
        if (dtos == null) {
            return null;
        }
        return dtos.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }
}
