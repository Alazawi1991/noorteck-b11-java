package com.noorteck.java.day17;

public class Laptop {
	String model;
	int ram;
	double price;

	public Laptop(String model, int ram, double price) {
		this.model = model;
		this.ram = ram;
		this.price = price;

	}

	public void display() {

		String model = "Lenova";

		System.out.println("******" + this.model);
		System.out.println("******" + model);

	}

	public static void main(String[] args) {
		Laptop s1 = new Laptop("hp", 500, 22.222);
		System.out.println(s1.model);
		System.out.println(s1.ram);
		System.out.println(s1.price);
		s1.display();
	}

}
