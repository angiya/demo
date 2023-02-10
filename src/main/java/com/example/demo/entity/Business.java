package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Business {
    @Id
    private String businessRegistrationNumber;
    private String name;

    @OneToMany(mappedBy = "business")
    private List<Location> locations;

    @OneToMany(mappedBy = "business")
    private List<Computer> computers;

    @OneToMany(mappedBy = "business")
    private List<Vehicle> vehicles;
}
