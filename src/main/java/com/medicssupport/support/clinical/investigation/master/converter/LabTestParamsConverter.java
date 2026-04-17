package com.medicssupport.support.clinical.investigation.master.converter;

import com.medicssupport.support.application.core.layer.BaseConverter;
import com.medicssupport.support.clinical.investigation.master.model.lab_test_params.LabTestParams;
import com.medicssupport.support.clinical.investigation.master.model.lab_test_params.LabTestParamsDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class LabTestParamsConverter implements BaseConverter<LabTestParams, LabTestParamsDTO> {

    @Override
    public LabTestParamsDTO toDto(LabTestParams entity) {
        if (entity == null) {
            return null;
        }
        LabTestParamsDTO dto = new LabTestParamsDTO();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

    @Override
    public LabTestParams toEntity(LabTestParamsDTO dto) {
        if (dto == null) {
            return null;
        }
        LabTestParams entity = new LabTestParams();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }

    @Override
    public List<LabTestParamsDTO> toDtoList(List<LabTestParams> entities) {
        if (entities == null) {
            return null;
        }
        return entities.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<LabTestParams> toEntityList(List<LabTestParamsDTO> dtos) {
        if (dtos == null) {
            return null;
        }
        return dtos.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }
}
