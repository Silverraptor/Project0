package com.revature.project.model;

import java.util.List;

public class Account {
	
	private Customer customer; //Customer
	private String id; //Account ID
	private double balance; //Account Balance
	private AccountType accountType; //Account Type
	private List<Transaction> transactions; //Transaction History
	
	public Account(Customer customer, String id, double balance, AccountType accountType,
			List<Transaction> transactions) {
		super();
		this.customer = customer;
		this.id = id;
		this.balance = balance;
		this.accountType = accountType;
		this.transactions = transactions;
	}
	
	

	@Override
	public String toString() {
		return "Account [customer=" + customer + ", id=" + id + ", balance=" + balance + ", accountType=" + accountType
				+ ", transactions=" + transactions + "]";
	}



	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getId() {
		return id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	
	
}
