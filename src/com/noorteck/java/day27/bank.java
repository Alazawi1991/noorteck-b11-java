package com.noorteck.java.day27;

public class bank {
	private double balance;
	private int accountNumber;
	private String owner;
	double amount;

	public bank(double balance, int accountNumber, String owner) {

		this.balance = balance;
		this.accountNumber = accountNumber;
		this.owner = owner;
	}

	public void setbalance(double balance) {

		this.balance = balance;

	}

	public double getbalance() {

		return balance;
	}

	public void setaccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;

	}

	public int getaccountNumber() {
		return accountNumber;
	}

	public void setowner(String owner) {

		this.owner = owner;

	}

	public String getowner() {
		return owner;
	}

	public void deposit(double amount) {

		balance = amount + balance;
		System.out.println("ammount has been added "+amount+"="+balance);
	}

	public boolean withdraw(double amount) {
		System.out.println("amount has been withdrow "+amount+"="+balance);
		if (balance >= amount) {
			balance = balance - amount;
			return true;
		} else {
			return false;

		}
		
	}

}
