package org.com.controller;

import org.com.controller.request.UserRequest;
import org.com.entity.UserEntity;
import org.com.services.UserService;

import javax.inject.Inject;
import javax.ws.rs.Produces;
import javax.ws.rs.POST;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.UUID;

@Path("/users")
public class UserController {

    @Inject
    UserService userService;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public UserEntity create(UserRequest userRequest) {
        return userService.create(userRequest);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<UserEntity> findAllUsers() {
        return userService.findAll();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public UserEntity findById(@PathParam("id") UUID id) {
        return userService.findById(id);
    }
}