package edu.mum.cs.cs525.labs.skeleton;

import edu.mum.cs.cs525.labs.skeleton.command.Command;
import edu.mum.cs.cs525.labs.skeleton.command.DepositCommand;
import edu.mum.cs.cs525.labs.skeleton.command.TransferCommand;
import edu.mum.cs.cs525.labs.skeleton.entity.AccountEntry;
import edu.mum.cs.cs525.labs.skeleton.entity.Customer;
import edu.mum.cs.cs525.labs.skeleton.service.AccountService;
import edu.mum.cs.cs525.labs.skeleton.service.AccountServiceImpl;

public class Application {
	public static void main(String[] args) {
		AccountService accountService = new AccountServiceImpl();

		// create 2 accounts;
		accountService.createAccount("1263862", "Frank Brown");
		accountService.createAccount("4253892", "John Doe");
		// use account 1;
//		accountService.deposit("1263862", 240);
		Command deposit = new DepositCommand(accountService,"1263862", 240);
		deposit.execute();
		deposit = new DepositCommand(accountService,"1263862", 529);
		deposit.execute();
		deposit = new DepositCommand(accountService,"1263862", 230);
		deposit.execute();

		// use account 2;
		accountService.deposit("4253892", 12450);
		deposit = new DepositCommand(accountService,"4253892", 12450);
		deposit.execute();

		Command transferFund = new TransferCommand(accountService, "4253892", "1263862", 100, "payment of invoice 10232");
		transferFund.execute();
		transferFund.undo();
		// show balances

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
