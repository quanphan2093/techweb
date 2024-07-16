package com.example.techweb.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long addressId;
    String phoneNumber;
    String fullName;
    String address;

    @OneToMany(mappedBy = "address")
    List<Orders> orders;

    // Getters and setters
}

