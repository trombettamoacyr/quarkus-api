package org.com.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class UserEntity extends PanacheEntityBase {

    @Id
    public UUID id = UUID.randomUUID();

    public String name;

    public String email;
}
