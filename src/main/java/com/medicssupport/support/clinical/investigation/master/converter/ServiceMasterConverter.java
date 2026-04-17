package com.medicssupport.support.clinical.investigation.master.converter;

import com.medicssupport.support.application.core.layer.BaseConverter;
import com.medicssupport.support.clinical.investigation.master.model.service_master.ServiceMaster;
import com.medicssupport.support.clinical.investigation.master.model.service_master.ServiceMasterDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ServiceMasterConverter implements BaseConverter<ServiceMaster, ServiceMasterDTO> {

    @Override
    public ServiceMasterDTO toDto(ServiceMaster entity) {
        if (entity == null) {
            return null;
        }
        ServiceMasterDTO dto = new ServiceMasterDTO();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

    @Override
    public ServiceMaster toEntity(ServiceMasterDTO dto) {
        if (dto == null) {
            return null;
        }
        ServiceMaster entity = new ServiceMaster();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }

    @Override
    public List<ServiceMasterDTO> toDtoList(List<ServiceMaster> entities) {
        if (entities == null) {
            return null;
        }
        return entities.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<ServiceMaster> toEntityList(List<ServiceMasterDTO> dtos) {
        if (dtos == null) {
            return null;
        }
        return dtos.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }
}
