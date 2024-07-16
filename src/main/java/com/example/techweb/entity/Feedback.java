package com.example.techweb.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long feedbackId;
    int vote;
    String content;
    String image;
    LocalDate createdAt;

    @ManyToOne
    @JoinColumn(name = "accountId")
    Account account;

    @ManyToOne
    @JoinColumn(name = "productId")
    Product product;

    // Getters and setters
}

