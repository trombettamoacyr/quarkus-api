package org.com.services;

import org.com.controller.request.CarRequest;
import org.com.services.entity.CarEntity;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@ApplicationScoped
public class CarService {

    public List<CarEntity> findAll() {
        return CarEntity.listAll();
    }

    public CarEntity findById(UUID id) {
        return CarEntity.findById(id);
    }

    @Transactional
    public CarEntity create(CarRequest request) {
        var car = new CarEntity();
        car.id = UUID.randomUUID();
        car.model = request.getModel();
        car.brand = request.getBrand();
        car.persist();

        return car;
    }
}