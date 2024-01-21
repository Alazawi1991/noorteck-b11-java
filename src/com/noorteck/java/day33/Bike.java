package com.noorteck.java.day33;

//Regular Class-->Concrete Class 
public class Bike extends Vehicle {

	@Override
	public void drive() {
		System.out.println("Using Handles...");

	}

	@Override
	public void setColor(String color) {
		System.out.println("Bike color" + color);

	}

}
