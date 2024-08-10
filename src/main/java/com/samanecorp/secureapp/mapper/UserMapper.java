package com.samanecorp.secureapp.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.samanecorp.secureapp.dto.UserDto;
import com.samanecorp.secureapp.entities.UserEntity;

public class UserMapper {
	public static List<UserDto> listUserEntityToListUserDto(List<UserEntity> users) {
		return users.stream().map(user -> toUserDto(user)).collect(Collectors.toList());
	}

	public static UserDto toUserDto(UserEntity user) {
		return new UserDto(user.getId(), user.getEmail(), user.getPassword(), user.isState());
	}

	public static UserEntity toUserEntity(UserDto user) {

		return new UserEntity(user.getId(), user.getEmail(), user.getPassword(), user.isState());
	}
}
