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
public class Human {
    @Id
    private String name;
    private int age;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "doggo name", referencedColumnName = "name")
    private List<Dog> dogs;
    @OneToOne(fetch = FetchType.LAZY)
    private Business business;
}
