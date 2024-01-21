package com.noorteck.java.day29;

public class Lenova extends Laptop {
	double price = 500.00;

	public void getPrice() {

		System.out.println("Child class price :" + price);
		System.out.println("Perent class price:" + super.price);
	}

	public void color() {
		System.out.println("grey");

	}

	public void getColor() {
		color();

		super.color();

	}

}
/**
 * If both Parent & Child Class has variable with the SAME NAME then to refer to
 * the PARENT variable we will use Super keyword super keyword is used to refer
 * to the iMMEDIATE PARENT 
 * 
 */