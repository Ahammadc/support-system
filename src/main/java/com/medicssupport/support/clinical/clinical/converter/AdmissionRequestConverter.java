package com.medicssupport.support.clinical.clinical.converter;

import com.medicssupport.support.application.core.layer.BaseConverter;
import com.medicssupport.support.clinical.clinical.model.admission_request.AdmissionRequest;
import com.medicssupport.support.clinical.clinical.model.admission_request.AdmissionRequestDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class AdmissionRequestConverter implements BaseConverter<AdmissionRequest, AdmissionRequestDTO> {

    @Override
    public AdmissionRequestDTO toDto(AdmissionRequest entity) {
        if (entity == null) {
            return null;
        }
        AdmissionRequestDTO dto = new AdmissionRequestDTO();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

    @Override
    public AdmissionRequest toEntity(AdmissionRequestDTO dto) {
        if (dto == null) {
            return null;
        }
        AdmissionRequest entity = new AdmissionRequest();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }

    @Override
    public List<AdmissionRequestDTO> toDtoList(List<AdmissionRequest> entities) {
        if (entities == null) {
            return null;
        }
        return entities.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<AdmissionRequest> toEntityList(List<AdmissionRequestDTO> dtos) {
        if (dtos == null) {
            return null;
        }
        return dtos.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }
}
