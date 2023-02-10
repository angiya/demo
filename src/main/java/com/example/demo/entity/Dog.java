package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Dog {
    @Id
    private String name;
    private Breed breed;
    @OneToOne(mappedBy = "human")
    private Human human;
}
