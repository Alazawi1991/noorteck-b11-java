package com.noorteck.java.day18;

public class BankAcount {


	// instance variable
	int accountNumber;
	String accountHolderName;
	double balance;

	// constructor
	public BankAcount(int accountNumber, String accountHolderName, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}

	// deposit
	public void deposit(double amount) {

		balance = balance + amount;
	}

	// withdraw
	public void withdraw(double amount) {

		if (amount > balance) {
			System.out.println("Cannot withdraw not enough $$$$");
		} else {
			balance = balance - amount;

		}

	}

	// checkbalance
	public double checkBalance() {
		return balance;
	}

	public static void main(String[] args) {

		BankAcount checking = new BankAcount(12345, "John", 500.00);

		System.out.println("Current Balance: $" + checking.balance);

		checking.deposit(200);
		checking.deposit(100);
		checking.deposit(500);
		checking.deposit(500);

		System.out.println("New balance after deposit: $" + checking.checkBalance());

		checking.withdraw(5000);

		System.out.println("New balance after withdraw: $" + checking.checkBalance());

		checking.withdraw(500);
		System.out.println("New balance after withdraw: $" + checking.checkBalance());
}
}