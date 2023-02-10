package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
public class Human {
    @Id
    private String name;
    private int age;
    private List<Dog> dogs;
    private List<Business> houses;
}
