package com.example.techweb.service;

import com.example.techweb.entity.Account;
import com.example.techweb.repository.AccountRepository;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class AccountService {
    AccountRepository accountRepository;

    public List<Account> getAllAccount(){
        return accountRepository.findAll();
    }
}
