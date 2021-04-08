package ru.sber.service;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sber.entity.Accounts;
import ru.sber.repository.AccountsRepository;

import java.util.Optional;

@Service
@AllArgsConstructor

public class AccountsService {

    @Autowired
    private AccountsRepository accountsRepository;


    public AccountsService() {

    }

    public Optional<Accounts> findById() {
        return accountsRepository.findById(new Accounts().getId());
    }



}
