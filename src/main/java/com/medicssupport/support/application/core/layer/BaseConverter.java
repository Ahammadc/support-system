package com.medicssupport.support.application.core.layer;

import java.util.List;

public interface BaseConverter<ENTITY, DTO> {
    DTO toDto(ENTITY entity);
    ENTITY toEntity(DTO dto);
    List<DTO> toDtoList(List<ENTITY> entities);
    List<ENTITY> toEntityList(List<DTO> dtos);
}
