package edu.mum.cs.cs525.labs.skeleton;

import edu.mum.cs.cs525.labs.skeleton.constant.NotificationType;
import edu.mum.cs.cs525.labs.skeleton.entity.AccountEntry;
import edu.mum.cs.cs525.labs.skeleton.entity.Customer;
import edu.mum.cs.cs525.labs.skeleton.observer.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Account implements NotificationObservable {
	private Customer customer;

	private String accountNumber;

	private List<AccountEntry> entryList = new ArrayList<AccountEntry>();
	private List<NotificationObserver> notificationObserverList = new ArrayList<>();

	public Account(String accountNumber)  {
		setupAndRegisterObservers();
		this.accountNumber = accountNumber;
		notifyObservers(NotificationType.CREATED, "Account with "+this.accountNumber+ " created");
	}

	public String getAccountNumber() {
		notifyObservers(NotificationType.FETCHED, "Fetched account: "+this.accountNumber);
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
		notifyObservers(NotificationType.UPDATED, "Updated account: "+this.accountNumber);
	}

	public double getBalance() {
		double balance = 0;
		for (AccountEntry entry : entryList) {
			balance += entry.getAmount();
		}
		notifyObservers(NotificationType.FETCHED, "Fetched Balance, Account: "+this.accountNumber);
		return balance;
	}

	public void deposit(double amount) {
		AccountEntry entry = new AccountEntry(amount, "deposit", "", "");
		entryList.add(entry);
		notifyObservers(NotificationType.DEPOSITED, "Amount Deposited, Account: "+this.accountNumber);
	}

	public void withdraw(double amount) {
		AccountEntry entry = new AccountEntry(-amount, "withdraw", "", "");
		entryList.add(entry);
		notifyObservers(NotificationType.WITHDRAW, "Withdraw Balance, Account: "+this.accountNumber);
	}

	private void addEntry(AccountEntry entry) {
		notifyObservers(NotificationType.NEW_ENTRY, "New Transaction, Account: "+this.accountNumber);
		entryList.add(entry);
	}

	public void transferFunds(Account toAccount, double amount, String description) {
		AccountEntry fromEntry = new AccountEntry(-amount, description, toAccount.getAccountNumber(),
				toAccount.getCustomer().getName());
		AccountEntry toEntry = new AccountEntry(amount, description, toAccount.getAccountNumber(),
				toAccount.getCustomer().getName());
		
		entryList.add(fromEntry);
		notifyObservers(NotificationType.TRANSFER_FUNDS, "Fund Transfer, Account: "+this.accountNumber);

		toAccount.addEntry(toEntry);
	}

	public Customer getCustomer() {
		notifyObservers(NotificationType.FETCH_CUSTOMER, "Customer Details fetched,  Account: "+this.accountNumber);
		return customer;
	}

	public void setCustomer(Customer customer) {
		notifyObservers(NotificationType.UPDATED, "Customer Updated,  Account: "+this.accountNumber);
		this.customer = customer;
	}

	public Collection<AccountEntry> getEntryList() {
		return entryList;
	}

	@Override
	public void registerObserver(NotificationObserver notificationObserver) {
		notificationObserverList.add(notificationObserver);
	}

	@Override
	public void removeObserver(NotificationObserver notificationObserver) {
		notificationObserverList.remove(notificationObserver);
	}

	@Override
	public void notifyObservers(NotificationType notificationType, String message) {
		notificationObserverList.forEach(observer -> observer.update(notificationType, message));
	}

	private void setupAndRegisterObservers() {
		NotificationObserver emailObserver = EmailNotificationObserver.getEmailNotificationObserver();
		NotificationObserver smsObserver = SMSNotificationObserver.getSMSNotificationObserver();
		NotificationObserver logObserver = LogNotificationObserver.getNotificationObserver();
		this.registerObserver(emailObserver);
		this.registerObserver(smsObserver);
		this.registerObserver(logObserver);
	}
}
