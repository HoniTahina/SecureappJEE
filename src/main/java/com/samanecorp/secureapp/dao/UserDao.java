package com.samanecorp.secureapp.dao;

import com.samanecorp.secureapp.entities.UserEntity;

public interface UserDao extends GenericDao<UserEntity, Long> {
	UserEntity findByEmail(String email);

	public static void main(String[] args) {
	}
}
