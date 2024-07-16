package com.example.techweb.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long productDetailId;
    String image;
    double price;
    int unitInStock;
    int unitInOrder;
    String status;
    LocalDate createdAt;
    LocalDate lastUpdate;

    @ManyToOne
    @JoinColumn(name = "productId")
    Product product;

    @ManyToOne
    @JoinColumn(name = "colorId")
    Color color;

    @ManyToOne
    @JoinColumn(name = "ramId")
    RAM ram;

    @ManyToOne
    @JoinColumn(name = "romId")
    ROM rom;

    @OneToMany(mappedBy = "productDetail")
    List<OrderDetails> orderDetails;

    @OneToMany(mappedBy = "productDetail")
    List<Cart> carts;

    // Getters and setters
}

