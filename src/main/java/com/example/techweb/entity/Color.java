package com.example.techweb.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE) public class Color {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long colorId;
    String colorName;

    @OneToMany(mappedBy = "color")
    List<ProductDetail> productDetails;

    // Getters and setters
}

