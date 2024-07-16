package com.example.techweb.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long brandId;
    String brandName;

    @OneToMany(mappedBy = "brand")
    List<Blog> blogs;

    @OneToMany(mappedBy = "brand")
    List<Product> products;
    // Getters and setters
}

