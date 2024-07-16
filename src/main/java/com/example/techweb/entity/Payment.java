package com.example.techweb.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long paymentId;
    LocalDate paymentDate;
    double amount;
    String paymentMethod;
    String status;
    String transactionId;

    @ManyToOne
    @JoinColumn(name = "orderId")
    Orders order;

    // Getters and setters
}

