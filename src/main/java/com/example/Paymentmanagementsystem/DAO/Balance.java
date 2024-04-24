package com.example.Paymentmanagementsystem.DAO;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Balance {
	@Id
	private int accountId;
	private int balance;
	private String currency;
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public Balance(int accountId, int balance, String currency) {
		super();
		this.accountId = accountId;
		this.balance = balance;
		this.currency = currency;
	}
	public Balance() {
		super();
	}
	
	
}
