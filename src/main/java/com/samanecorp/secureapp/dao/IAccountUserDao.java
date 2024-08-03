package com.samanecorp.secureapp.dao;

import java.util.Optional;

import com.samanecorp.secureapp.controller.Repository;
import com.samanecorp.secureapp.entities.AccountUserEntity;

public interface IAccountUserDao extends Repository<AccountUserEntity>{

	Optional<AccountUserEntity> login(String email, String password);
}
