package com.example.techweb.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long categoryId;
    String categoryName;

    @OneToMany(mappedBy = "category")
    List<Blog> blogs;

    @OneToMany(mappedBy = "category")
    List<Product> products;

    // Getters and setters
}

