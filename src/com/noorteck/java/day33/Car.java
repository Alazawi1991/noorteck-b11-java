package com.noorteck.java.day33;

//Concrete Class
public class Car extends Vehicle {

	@Override
	public void drive() {
		System.out.println("Using Steering Wheels...");

	}

	@Override
	public void setColor(String color) {
		System.out.println("Bike color" + color);

	}

}
