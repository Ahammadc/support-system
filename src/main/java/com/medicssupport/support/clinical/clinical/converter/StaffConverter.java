package com.medicssupport.support.clinical.clinical.converter;

import com.medicssupport.support.application.core.layer.BaseConverter;
import com.medicssupport.support.clinical.clinical.model.staff.Staff;
import com.medicssupport.support.clinical.clinical.model.staff.StaffDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StaffConverter implements BaseConverter<Staff, StaffDTO> {

    @Override
    public StaffDTO toDto(Staff entity) {
        if (entity == null) {
            return null;
        }
        StaffDTO dto = new StaffDTO();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

    @Override
    public Staff toEntity(StaffDTO dto) {
        if (dto == null) {
            return null;
        }
        Staff entity = new Staff();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }

    @Override
    public List<StaffDTO> toDtoList(List<Staff> entities) {
        if (entities == null) {
            return null;
        }
        return entities.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<Staff> toEntityList(List<StaffDTO> dtos) {
        if (dtos == null) {
            return null;
        }
        return dtos.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }
}
