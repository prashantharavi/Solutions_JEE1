package com.htc.training;

public class BankAccount {

	String accountNo;
	String accountName;
	double balance;

	public BankAccount() {
		accountNo = "";
		accountName = "";
		balance = 0;
	}

	public BankAccount(String accountNo, String accountName, double balance) {
		super();
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.balance = balance;
	}

	public BankAccount(String accountNo, String accountName) {
		super();
		this.accountNo = accountNo;
		this.accountName = accountName;

	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
