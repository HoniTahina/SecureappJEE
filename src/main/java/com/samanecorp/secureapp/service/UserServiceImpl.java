package com.samanecorp.secureapp.service;

import com.samanecorp.secureapp.dao.UserDao;
import com.samanecorp.secureapp.entities.UserEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserServiceImpl implements UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    private UserDao UserDao;

    public UserServiceImpl(UserDao UserDao) {
        this.UserDao = UserDao;
    }

    @Override
    public UserEntity createUser(UserEntity user) {
        logger.info("Creating user: " + user.getEmail());
        UserDao.save(user);
        return user;
    }

    @Override
    public UserEntity getUserById(Long id) {
        logger.info("Getting user by id: " + id);
        return UserDao.findById(id);
    }

    @Override
    public UserEntity getUserByEmail(String email) {
        logger.info("Getting user by email: " + email);
        return UserDao.findByEmail(email);
    }
}
