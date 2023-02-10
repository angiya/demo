package com.example.demo.entity;

import jakarta.persistence.*;

public class Vehicle {
    @Id
    private String numberPlate;
    private String make;
    private String model;
    private String year;
    private String dateOfPurchase;
    @ManyToOne
    @JoinColumn(name = "business_id")
    private Business business;
}
