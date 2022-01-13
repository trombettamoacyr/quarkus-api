package org.com.services;

import org.com.controller.request.UserRequest;
import org.com.entity.UserEntity;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@ApplicationScoped
public class UserService {

    public List<UserEntity> findAll() {
        return UserEntity.listAll();
    }

    public UserEntity findById(UUID id) {
        return UserEntity.findById(id);
    }

    @Transactional
    public UserEntity create(UserRequest request) {
        var user = new UserEntity();
        user.name = request.getName();
        user.email = request.getEmail();
        user.persist();

        return user;
    }
}
