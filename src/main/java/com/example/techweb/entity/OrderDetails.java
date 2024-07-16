package com.example.techweb.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long orderDetailId;
    int quantity;
    double unitPrice;
    LocalDate createdAt;

    @ManyToOne
    @JoinColumn(name = "orderId")
    Orders order;

    @ManyToOne
    @JoinColumn(name = "productDetailId")
    ProductDetail productDetail;

    // Getters and setters
}

