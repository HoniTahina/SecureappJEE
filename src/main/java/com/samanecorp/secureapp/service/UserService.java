package com.samanecorp.secureapp.service;

import com.samanecorp.secureapp.entities.UserEntity;

public interface UserService {
    UserEntity createUser(UserEntity user);
    UserEntity getUserById(Long id);
    UserEntity getUserByEmail(String email);
}
