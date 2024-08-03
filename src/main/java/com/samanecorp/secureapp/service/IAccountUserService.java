package com.samanecorp.secureapp.service;

import java.util.List;
import java.util.Optional;

import com.samanecorp.secureapp.dto.UserDto;


public interface IAccountUserService {
	Optional<UserDto> login(String email, String password);

	Optional<List<UserDto>> findAll();
	boolean save(UserDto accountUserDto);
}
