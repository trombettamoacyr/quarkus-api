package org.com.controller;

import org.com.entity.UserEntity;

import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/users")
public class UserController {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<UserEntity> findAllUsers() {
        return UserEntity.listAll();
    }

    @POST
    @Transactional
    @Produces(MediaType.APPLICATION_JSON)
    public UserEntity newUser() {
        var newUser = new UserEntity();
        newUser.name = "Name";
        newUser.email = "user@email.com";
        newUser.persist();

        return newUser;
    }
}