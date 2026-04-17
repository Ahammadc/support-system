package com.medicssupport.support.clinical.investigation.master.converter;

import com.medicssupport.support.application.core.layer.BaseConverter;
import com.medicssupport.support.clinical.investigation.master.model.normal_range.NormalRange;
import com.medicssupport.support.clinical.investigation.master.model.normal_range.NormalRangeDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class NormalRangeConverter implements BaseConverter<NormalRange, NormalRangeDTO> {

    @Override
    public NormalRangeDTO toDto(NormalRange entity) {
        if (entity == null) {
            return null;
        }
        NormalRangeDTO dto = new NormalRangeDTO();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

    @Override
    public NormalRange toEntity(NormalRangeDTO dto) {
        if (dto == null) {
            return null;
        }
        NormalRange entity = new NormalRange();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }

    @Override
    public List<NormalRangeDTO> toDtoList(List<NormalRange> entities) {
        if (entities == null) {
            return null;
        }
        return entities.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<NormalRange> toEntityList(List<NormalRangeDTO> dtos) {
        if (dtos == null) {
            return null;
        }
        return dtos.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }
}
