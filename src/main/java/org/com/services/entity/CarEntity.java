package org.com.services.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "Car")
public class CarEntity extends PanacheEntityBase {

    @Id
    public UUID id;

    @Column
    public String model;

    @Column
    public String brand;
}