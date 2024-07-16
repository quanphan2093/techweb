package com.example.techweb.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "Account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long accountId;
    @Column(nullable = false, name = "email")
    String email;

    @Column(nullable = false, name = "password")
    String password;

    @Column(name="phoneNumber")
    String phoneNumber;

    @Column(name = "fullName")
    String fullName;

    @Column(name = "isActive")
    boolean isActive;

    @Column(name = "createdAt")
    LocalDate createdAt;

    @Column(name = "lastLogin")
    LocalDate lastLogin;

    @ManyToOne
    @JoinColumn(name = "roleId")
    private Role role;

    @OneToMany(mappedBy = "account")
    List<Blog> blogs;

    @OneToMany(mappedBy = "account")
    List<Cart> carts;

    @OneToMany(mappedBy = "account")
    List<Orders> orders;

    @OneToMany(mappedBy = "account")
    List<Feedback> feedbacks;
}
