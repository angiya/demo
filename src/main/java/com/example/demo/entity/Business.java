package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Business {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String businessRegistrationNumber;
    private String name;

    @OneToMany
    private List<Location> locations;

    @OneToMany
    private List<Computer> computers;

    @OneToMany
    private List<Vehicle> vehicles;
}
