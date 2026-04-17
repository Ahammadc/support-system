package com.medicssupport.support.clinical.clinical.converter;

import com.medicssupport.support.application.core.layer.BaseConverter;
import com.medicssupport.support.clinical.clinical.model.user.User;
import com.medicssupport.support.clinical.clinical.model.user.UserDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserConverter implements BaseConverter<User, UserDTO> {

    @Override
    public UserDTO toDto(User entity) {
        if (entity == null) {
            return null;
        }
        UserDTO dto = new UserDTO();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

    @Override
    public User toEntity(UserDTO dto) {
        if (dto == null) {
            return null;
        }
        User entity = new User();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }

    @Override
    public List<UserDTO> toDtoList(List<User> entities) {
        if (entities == null) {
            return null;
        }
        return entities.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<User> toEntityList(List<UserDTO> dtos) {
        if (dtos == null) {
            return null;
        }
        return dtos.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }
}
