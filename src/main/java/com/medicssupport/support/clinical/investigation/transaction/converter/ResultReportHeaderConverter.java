package com.medicssupport.support.clinical.investigation.transaction.converter;

import com.medicssupport.support.application.core.layer.BaseConverter;
import com.medicssupport.support.clinical.investigation.transaction.model.result_report_header.ResultReportHeader;
import com.medicssupport.support.clinical.investigation.transaction.model.result_report_header.ResultReportHeaderDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ResultReportHeaderConverter implements BaseConverter<ResultReportHeader, ResultReportHeaderDTO> {

    @Override
    public ResultReportHeaderDTO toDto(ResultReportHeader entity) {
        if (entity == null) {
            return null;
        }
        ResultReportHeaderDTO dto = new ResultReportHeaderDTO();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

    @Override
    public ResultReportHeader toEntity(ResultReportHeaderDTO dto) {
        if (dto == null) {
            return null;
        }
        ResultReportHeader entity = new ResultReportHeader();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }

    @Override
    public List<ResultReportHeaderDTO> toDtoList(List<ResultReportHeader> entities) {
        if (entities == null) {
            return null;
        }
        return entities.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<ResultReportHeader> toEntityList(List<ResultReportHeaderDTO> dtos) {
        if (dtos == null) {
            return null;
        }
        return dtos.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }
}
