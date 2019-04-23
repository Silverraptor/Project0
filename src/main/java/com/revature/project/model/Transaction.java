package com.revature.project.model;

import java.time.LocalDateTime;

public class Transaction {
		
	private double balanceTransfered; //Balance Transfered
	private String originAccountId; //Origin Account ID
	private String targetAccountId; //Target Account ID
	private LocalDateTime transactionDate; //Transaction Date
	private String transactionId;
	
	
	public Transaction(double balanceTransfered, String originAccountId, String targetAccountId,
			LocalDateTime transactionDate, String transactionId) {
		super();
		this.balanceTransfered = balanceTransfered;
		this.originAccountId = originAccountId;
		this.targetAccountId = targetAccountId;
		this.transactionDate = transactionDate;
		this.transactionId = transactionId;
	}

	

	@Override
	public String toString() {
		return "Transaction [balanceTransfered=" + balanceTransfered + ", originAccountId=" + originAccountId
				+ ", targetAccountId=" + targetAccountId + ", transactionDate=" + transactionDate + ", transactionId="
				+ transactionId + "]";
	}



	public double getBalanceTransfered() {
		return balanceTransfered;
	}


	public void setBalanceTransfered(double balanceTransfered) {
		this.balanceTransfered = balanceTransfered;
	}


	public String getOriginAccountId() {
		return originAccountId;
	}


	public void setOriginAccountId(String originAccountId) {
		this.originAccountId = originAccountId;
	}


	public String getTargetAccountId() {
		return targetAccountId;
	}


	public void setTargetAccountId(String targetAccountId) {
		this.targetAccountId = targetAccountId;
	}


	public LocalDateTime getTransactionDate() {
		return transactionDate;
	}


	public void setTransactionDate(LocalDateTime transactionDate) {
		this.transactionDate = transactionDate;
	}


	public String getTransactionId() {
		return transactionId;
	}


	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	
}
