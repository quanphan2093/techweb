package com.example.techweb.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long blogId;
    String title;
    String briefInfo;
    String content;
    String image;
    LocalDate publicDate;
    String status;

    @ManyToOne
    @JoinColumn(name = "categoryId")
    Category category;

    @ManyToOne
    @JoinColumn(name="brandId")
    Brand brand;

    @ManyToOne
    @JoinColumn(name = "accountId")
    Account account;

    Boolean isActive;

    // Getters and setters
}

