package com.medicssupport.support.clinical.investigation.transaction.converter;

import com.medicssupport.support.application.core.layer.BaseConverter;
import com.medicssupport.support.clinical.investigation.transaction.model.result_detail.ResultDetail;
import com.medicssupport.support.clinical.investigation.transaction.model.result_detail.ResultDetailDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ResultDetailConverter implements BaseConverter<ResultDetail, ResultDetailDTO> {

    private final ServiceOrderConverter serviceOrderConverter;
    private final ResultObservationConverter resultObservationConverter;
    private final OrderSampleConverter orderSampleConverter;
    private final ResultReportHeaderConverter resultReportHeaderConverter;
    private final ServiceReportConverter serviceReportConverter;

    public ResultDetailConverter(ServiceOrderConverter serviceOrderConverter, ResultObservationConverter resultObservationConverter, OrderSampleConverter orderSampleConverter, ResultReportHeaderConverter resultReportHeaderConverter, ServiceReportConverter serviceReportConverter) {
        this.serviceOrderConverter = serviceOrderConverter;
        this.resultObservationConverter = resultObservationConverter;
        this.orderSampleConverter = orderSampleConverter;
        this.resultReportHeaderConverter = resultReportHeaderConverter;
        this.serviceReportConverter = serviceReportConverter;
    }

    @Override
    public ResultDetailDTO toDto(ResultDetail entity) {
        if (entity == null) {
            return null;
        }
        ResultDetailDTO dto = new ResultDetailDTO();
        BeanUtils.copyProperties(entity, dto);
//        dto.setServiceOrder(serviceOrderConverter.toDto(entity.getServiceOrder()));
//        dto.setResultObservation(resultObservationConverter.toDtoList(entity.getResultObservation()));
//        dto.setOrderSample(orderSampleConverter.toDto(entity.getOrderSample()));
//        dto.setResultReportHeader(resultReportHeaderConverter.toDto(entity.getResultReportHeader()));
//        dto.setServiceReport(serviceReportConverter.toDto(entity.getServiceReport()));
        return dto;
    }

    @Override
    public ResultDetail toEntity(ResultDetailDTO dto) {
        if (dto == null) {
            return null;
        }
        ResultDetail entity = new ResultDetail();
        BeanUtils.copyProperties(dto, entity);
//        entity.setServiceOrder(serviceOrderConverter.toEntity(dto.getServiceOrder()));
//        entity.setResultObservation(resultObservationConverter.toEntityList(dto.getResultObservation()));
//        entity.setOrderSample(orderSampleConverter.toEntity(dto.getOrderSample()));
//        entity.setResultReportHeader(resultReportHeaderConverter.toEntity(dto.getResultReportHeader()));
//        entity.setServiceReport(serviceReportConverter.toEntity(dto.getServiceReport()));
        return entity;
    }

    @Override
    public List<ResultDetailDTO> toDtoList(List<ResultDetail> entities) {
        if (entities == null) {
            return null;
        }
        return entities.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<ResultDetail> toEntityList(List<ResultDetailDTO> dtos) {
        if (dtos == null) {
            return null;
        }
        return dtos.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }
}
