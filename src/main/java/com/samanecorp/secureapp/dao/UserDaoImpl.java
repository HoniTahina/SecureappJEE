package com.samanecorp.secureapp.dao;

import com.samanecorp.secureapp.entities.UserEntity;
import org.hibernate.Session;
import com.samanecorp.secureapp.config.HibernateUtil;

public class UserDaoImpl extends GenericDaoImpl<UserEntity, Long> implements UserDao {

    public UserDaoImpl() {
        super(UserEntity.class);
    }

    @Override
    public UserEntity findByEmail(String email) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        UserEntity user = session.createQuery("FROM UserEntity WHERE email = :email", UserEntity.class)
                .setParameter("email", email)
                .uniqueResult();
        session.close();
        return user;
    }
}
