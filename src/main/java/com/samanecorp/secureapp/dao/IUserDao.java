package com.samanecorp.secureapp.dao;

import java.util.Optional;

import com.samanecorp.secureapp.entities.UserEntity;

public interface IUserDao extends Repository<UserEntity>{
	public Optional<UserEntity> login (String email, String password);

}
