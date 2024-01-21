package com.noorteck.java.day27;

public class BankAcountDemo {

	public static void main(String[] args) {

		bank obj = new bank(100.01, 50, "Ahmed");

		obj.setbalance(100.1);
		obj.setaccountNumber(50);
		obj.setowner("Ahmed");

		obj.deposit(10.2);
		obj.withdraw(20);
		obj.deposit(1000);
		System.out.println(obj.getaccountNumber());
		System.out.println(obj.getbalance());
		System.out.println(obj.getowner());

	}

}
