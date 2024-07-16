package com.example.techweb.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ROM {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long romId;
    String romName;

    @OneToMany(mappedBy = "rom")
    List<ProductDetail> productDetails;

    // Getters and setters
}

