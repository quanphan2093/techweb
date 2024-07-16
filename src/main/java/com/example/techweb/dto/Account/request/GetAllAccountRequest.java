package com.example.techweb.dto.Account.request;

import com.example.techweb.entity.*;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GetAllAccountRequest {
    long accountId;
    String email;
    String password;
    String phoneNumber;
    String fullName;
    boolean isActive;
    LocalDate createdAt;
    LocalDate lastLogin;
    int roleId;
}
