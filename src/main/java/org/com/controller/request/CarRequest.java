package org.com.controller.request;

public class CarRequest {

    private final String model;

    private final String brand;

    public CarRequest(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }
}