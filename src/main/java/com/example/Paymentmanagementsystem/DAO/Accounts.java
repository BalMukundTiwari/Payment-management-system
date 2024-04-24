package com.example.Paymentmanagementsystem.DAO;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Accounts {
	@Id
	private int accountId;
	private int bankId;
	private int balance;
	private String currency;
	private String userName;
	
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public int getBankId() {
		return bankId;
	}
	public void setBankId(int bankId) {
		this.bankId = bankId;
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Accounts(int accountId, int bankId, int balance, String currency, String userName) {
		super();
		this.accountId = accountId;
		this.bankId = bankId;
		this.balance = balance;
		this.currency = currency;
		this.userName = userName;
	}
	public Accounts() {
		super();
	}
	
	

}
