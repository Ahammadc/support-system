package com.medicssupport.support.clinical.investigation.transaction.converter;

import com.medicssupport.support.application.core.layer.BaseConverter;
import com.medicssupport.support.clinical.investigation.transaction.model.service_report.ServiceReport;
import com.medicssupport.support.clinical.investigation.transaction.model.service_report.ServiceReportDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ServiceReportConverter implements BaseConverter<ServiceReport, ServiceReportDTO> {

    @Override
    public ServiceReportDTO toDto(ServiceReport entity) {
        if (entity == null) {
            return null;
        }
        ServiceReportDTO dto = new ServiceReportDTO();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

    @Override
    public ServiceReport toEntity(ServiceReportDTO dto) {
        if (dto == null) {
            return null;
        }
        ServiceReport entity = new ServiceReport();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }

    @Override
    public List<ServiceReportDTO> toDtoList(List<ServiceReport> entities) {
        if (entities == null) {
            return null;
        }
        return entities.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<ServiceReport> toEntityList(List<ServiceReportDTO> dtos) {
        if (dtos == null) {
            return null;
        }
        return dtos.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }
}
