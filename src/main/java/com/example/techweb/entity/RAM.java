package com.example.techweb.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RAM {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long ramId;
    String ramName;

    @OneToMany(mappedBy = "ram")
    List<ProductDetail> productDetails;

    // Getters and setters
}

