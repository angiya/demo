package com.example.demo.entity;

import jakarta.persistence.*;

public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String make;
    private String model;
    private String year;
    private String dateOfPurchase;
    @ManyToOne
    @JoinColumn(name = "business_id")
    private Business business;
}
