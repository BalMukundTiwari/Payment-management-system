package com.example.Paymentmanagementsystem.DAO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Transactions {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int transactionId;
	private int senderAccountId;
	private int receiverAccountid;
	private int amount;
	private String status;

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public int getSenderAccountId() {
		return senderAccountId;
	}

	public void setSenderAccountId(int senderAccountId) {
		this.senderAccountId = senderAccountId;
	}

	public int getReceiverAccountid() {
		return receiverAccountid;
	}

	public void setReceiverAccountid(int receiverAccountid) {
		this.receiverAccountid = receiverAccountid;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Transactions(int transactionId, int senderAccountId, int receiverAccountid, int amount, String status) {
		super();
		this.transactionId = transactionId;
		this.senderAccountId = senderAccountId;
		this.receiverAccountid = receiverAccountid;
		this.amount = amount;
		this.status = status;
	}

	public Transactions() {
		super();
	}

}
