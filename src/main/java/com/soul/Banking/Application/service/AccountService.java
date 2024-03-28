package com.soul.Banking.Application.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soul.Banking.Application.Repo.AccountRepo;
import com.soul.Banking.Application.model.Account;

@Service
public class AccountService {

	@Autowired
	private AccountRepo accountRepo;

    public Account createAccount(Account account) {
        return accountRepo.save(account);
    }

    public Optional<Account> getAccount(Long id) {
        return accountRepo.findById(id);
    }

    public Account deposit(Long id, double amount) {
        Account account = getAccount(id).orElseThrow(() -> new RuntimeException("Account not found"));
        account.setBalance(account.getBalance() + amount);
        return accountRepo.save(account);
    }
    
    public Account withdraw(Long id, double amount) {
        Account account = getAccount(id).orElseThrow(() -> new RuntimeException("Account not found"));
        if (account.getBalance() < amount) {
            throw new RuntimeException("Insufficient funds");
        }
        account.setBalance(account.getBalance() - amount);
        return accountRepo.save(account);
    }
}
