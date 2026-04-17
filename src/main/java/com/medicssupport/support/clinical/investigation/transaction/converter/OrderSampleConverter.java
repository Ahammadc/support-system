package com.medicssupport.support.clinical.investigation.transaction.converter;

import com.medicssupport.support.application.core.layer.BaseConverter;
import com.medicssupport.support.clinical.investigation.transaction.model.order_sample.OrderSample;
import com.medicssupport.support.clinical.investigation.transaction.model.order_sample.OrderSampleDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class OrderSampleConverter implements BaseConverter<OrderSample, OrderSampleDTO> {

    @Override
    public OrderSampleDTO toDto(OrderSample entity) {
        if (entity == null) {
            return null;
        }
        OrderSampleDTO dto = new OrderSampleDTO();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

    @Override
    public OrderSample toEntity(OrderSampleDTO dto) {
        if (dto == null) {
            return null;
        }
        OrderSample entity = new OrderSample();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }

    @Override
    public List<OrderSampleDTO> toDtoList(List<OrderSample> entities) {
        if (entities == null) {
            return null;
        }
        return entities.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<OrderSample> toEntityList(List<OrderSampleDTO> dtos) {
        if (dtos == null) {
            return null;
        }
        return dtos.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }
}
