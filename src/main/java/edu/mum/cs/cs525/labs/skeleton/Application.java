package edu.mum.cs.cs525.labs.skeleton;

import edu.mum.cs.cs525.labs.skeleton.decoratorPattern.P1Decorator;
import edu.mum.cs.cs525.labs.skeleton.decoratorPattern.P2Decorator;
import edu.mum.cs.cs525.labs.skeleton.decoratorPattern.P3Decorator;
import edu.mum.cs.cs525.labs.skeleton.entity.AccountEntry;
import edu.mum.cs.cs525.labs.skeleton.entity.Customer;
import edu.mum.cs.cs525.labs.skeleton.service.AccountService;
import edu.mum.cs.cs525.labs.skeleton.service.AccountServiceImpl;
import edu.mum.cs.cs525.labs.skeleton.strategyPattern.AccountTypeStrategy;
import edu.mum.cs.cs525.labs.skeleton.strategyPattern.CheckingAccountStrategy;
import edu.mum.cs.cs525.labs.skeleton.strategyPattern.SavingAccountStrategy;

public class Application {
	public static void main(String[] args) {
		AccountService accountService = new AccountServiceImpl();

		AccountTypeStrategy savingAccountStrategytrategy = new SavingAccountStrategy();
		savingAccountStrategytrategy = new P1Decorator(savingAccountStrategytrategy);
		savingAccountStrategytrategy = new P2Decorator(savingAccountStrategytrategy);
		savingAccountStrategytrategy = new P3Decorator(savingAccountStrategytrategy);

		AccountTypeStrategy checkingAccountStrategytrategy = new CheckingAccountStrategy();
		checkingAccountStrategytrategy = new P1Decorator(checkingAccountStrategytrategy);
		checkingAccountStrategytrategy = new P2Decorator(checkingAccountStrategytrategy);
		checkingAccountStrategytrategy = new P3Decorator(checkingAccountStrategytrategy);

		// create 2 accounts;
		accountService.createAccount("1263862", "Frank Brown", savingAccountStrategytrategy);
		accountService.createAccount("4253892", "John Doe", checkingAccountStrategytrategy);
		// use account 1;
		accountService.deposit("1263862", 240);
		accountService.deposit("1263862", 529);
		accountService.withdraw("1263862", 230);
		// use account 2;
		accountService.deposit("4253892", 12450);
		accountService.transferFunds("4253892", "1263862", 100, "payment of invoice 10232");
		// show balances

		accountService.addInterest();
		for (Account account : accountService.getAllAccounts()) {
			Customer customer = account.getCustomer();
			System.out.println("Statement for Account: " + account.getAccountNumber());
			System.out.println("Account Holder: " + customer.getName());
			
			System.out.println("-Date-------------------------" 
					+ "-Description------------------" 
					+ "-Amount-------------");
			
			for (AccountEntry entry : account.getEntryList()) {
				System.out.printf("%30s%30s%20.2f\n", 
						entry.getDate().toString(), 
						entry.getDescription(),
						entry.getAmount());
			}
			
			System.out.println("----------------------------------------" + "----------------------------------------");
			System.out.printf("%30s%30s%20.2f\n\n", "", "Current Balance:", account.getBalance());
		}
	}

}
