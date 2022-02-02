package org.com.controller;

import org.com.controller.request.CarRequest;
import org.com.entity.CarEntity;
import org.com.services.CarService;

import javax.inject.Inject;
import javax.ws.rs.Produces;
import javax.ws.rs.POST;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.UUID;

@Path("/cars")
public class CarController {

    @Inject
    CarService carService;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public CarEntity create(CarRequest carRequest) {
        return carService.create(carRequest);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<CarEntity> findAllCars() {
        return carService.findAll();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public CarEntity findById(@PathParam("id") UUID id) {
        return carService.findById(id);
    }
}