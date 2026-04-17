package com.medicssupport.support.clinical.investigation.transaction.converter;

import com.medicssupport.support.application.core.layer.BaseConverter;
import com.medicssupport.support.clinical.investigation.transaction.model.service_order.ServiceOrder;
import com.medicssupport.support.clinical.investigation.transaction.model.service_order.ServiceOrderDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ServiceOrderConverter implements BaseConverter<ServiceOrder, ServiceOrderDTO> {

    @Override
    public ServiceOrderDTO toDto(ServiceOrder entity) {
        if (entity == null) {
            return null;
        }
        ServiceOrderDTO dto = new ServiceOrderDTO();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

    @Override
    public ServiceOrder toEntity(ServiceOrderDTO dto) {
        if (dto == null) {
            return null;
        }
        ServiceOrder entity = new ServiceOrder();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }

    @Override
    public List<ServiceOrderDTO> toDtoList(List<ServiceOrder> entities) {
        if (entities == null) {
            return null;
        }
        return entities.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<ServiceOrder> toEntityList(List<ServiceOrderDTO> dtos) {
        if (dtos == null) {
            return null;
        }
        return dtos.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }
}
