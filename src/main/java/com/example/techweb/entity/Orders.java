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
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long orderId;
    LocalDate saleDate;
    String noteByCustomer;
    String noteBySale;
    String status;
    LocalDate updateAt;

    @ManyToOne
    @JoinColumn(name = "accountId")
    Account account;

    @ManyToOne
    @JoinColumn(name = "addressId")
    Address address;

    @OneToMany(mappedBy = "order")
    List<OrderDetails> orderDetails;

    @OneToMany(mappedBy = "order")
    List<Payment> payments;

    // Getters and setters
}

