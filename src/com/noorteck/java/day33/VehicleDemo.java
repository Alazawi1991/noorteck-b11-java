package com.noorteck.java.day33;

//Concrete Class
public class VehicleDemo {
	public static void main(String[] args) {
		Vehicle obj;
		obj = new Car();
		obj.drive();
		obj.setColor("red");
		obj.year();
		obj = new Bike();
		obj.drive();
		obj.setColor("blue");
		obj.year();
	}
}
