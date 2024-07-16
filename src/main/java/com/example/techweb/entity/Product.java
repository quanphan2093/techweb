package com.example.techweb.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long productId;
    String productName;
    String description;
    LocalDate createdAt;
    boolean isActive;

    @ManyToOne
    @JoinColumn(name = "categoryId")
    Category category;

    @ManyToOne
    @JoinColumn(name = "brandId")
    Brand brand;

    @OneToMany(mappedBy = "product")
    List<ProductDetail> productDetails;

    @OneToMany(mappedBy = "product")
    List<Feedback> feedbacks;
}

