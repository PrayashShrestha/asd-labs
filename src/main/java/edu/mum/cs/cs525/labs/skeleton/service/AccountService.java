package edu.mum.cs.cs525.labs.skeleton.service;

import edu.mum.cs.cs525.labs.skeleton.Account;
import edu.mum.cs.cs525.labs.skeleton.strategyPattern.AccountTypeStrategy;

import java.util.Collection;

public interface AccountService {
    Account createAccount(String accountNumber, String customerName, AccountTypeStrategy accountTypeStrategy);
    Account getAccount(String accountNumber);
    Collection<Account> getAllAccounts();
    void deposit (String accountNumber, double amount);
    void withdraw (String accountNumber, double amount);
    void transferFunds(String fromAccountNumber, String toAccountNumber, double amount, String description);
    void addInterest();
}
