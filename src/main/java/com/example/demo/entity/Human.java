package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
public class Human {
    @Id
    private String name;
    private int age;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "doggo name", referencedColumnName = "name")
    private List<Dog> dogs;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "business number", referencedColumnName = "businessRegistrationNumber")
    private Set<Business> businessList;
}
