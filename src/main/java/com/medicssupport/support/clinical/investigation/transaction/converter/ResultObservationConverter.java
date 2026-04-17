package com.medicssupport.support.clinical.investigation.transaction.converter;

import com.medicssupport.support.application.core.layer.BaseConverter;
import com.medicssupport.support.clinical.investigation.transaction.model.result_observation.ResultObservation;
import com.medicssupport.support.clinical.investigation.transaction.model.result_observation.ResultObservationDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ResultObservationConverter implements BaseConverter<ResultObservation, ResultObservationDTO> {

    @Override
    public ResultObservationDTO toDto(ResultObservation entity) {
        if (entity == null) {
            return null;
        }
        ResultObservationDTO dto = new ResultObservationDTO();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

    @Override
    public ResultObservation toEntity(ResultObservationDTO dto) {
        if (dto == null) {
            return null;
        }
        ResultObservation entity = new ResultObservation();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }

    @Override
    public List<ResultObservationDTO> toDtoList(List<ResultObservation> entities) {
        if (entities == null) {
            return null;
        }
        return entities.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<ResultObservation> toEntityList(List<ResultObservationDTO> dtos) {
        if (dtos == null) {
            return null;
        }
        return dtos.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }
}
