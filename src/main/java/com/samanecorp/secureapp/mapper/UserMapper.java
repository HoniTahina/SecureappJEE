package com.samanecorp.secureapp.mapper;

import com.samanecorp.secureapp.dto.UserDto;
import com.samanecorp.secureapp.entities.UserEntity;

public class UserMapper {
    public static UserDto toDTO(UserEntity entity) {
        UserDto dto = new UserDto();
        dto.setId(entity.getId());
        dto.setEmail(entity.getEmail());
        dto.setPassword(entity.getPassword());
        dto.setState(entity.isState());
        return dto;
    }

    public static UserEntity toEntity(UserDto dto) {
        UserEntity entity = new UserEntity();
        entity.setId(dto.getId());
        entity.setEmail(dto.getEmail());
        entity.setPassword(dto.getPassword());
        entity.setState(dto.isState());
        return entity;
    }
}
