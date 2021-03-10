package ru.sber.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sber.entity.Accounts;
import ru.sber.repository.AccountsRepository;

import java.util.List;

@Service
public class AccountsService {

    @Autowired
    private AccountsRepository accountsRepository;

    public AccountsService(AccountsRepository accountsRepository) {
        this.accountsRepository = accountsRepository;
    }

    public AccountsService() {

    }

    //public void createAccounts(Accounts accounts) {
//        accountsRepository.save(accounts);
//    }

//    public List<Accounts> findAll() {
//        return accountsRepository.findAll();
//    }

    public List<Accounts> findById() {
        return (List<Accounts>) accountsRepository.findById();//.orElse(null);
    }

//    public List<Accounts> findByPan(String pan) {
//        return accountsRepository.findByPan();
//}

//    public void findWhereId2(){
//        return
//    }

}
