package com.noorteck.java.day30;

public class USCar {

	private String make;
	private String model;
	private int year;
	private String color;

	public USCar(String make) {

		this.make = make;
		model = "n/a";
		color = "n/a";
		year = 2024;
	}

	public USCar(String make, String model) {

		this.make = make;
		this.model = model;
		color = "n/a";
		year = 2024;
	}

	public USCar(String make, String model, int year) {

		this.make = make;
		this.model = model;
		color = "n/a";
		this.year = year;
	}

	public USCar(String make, String model, int year, String color) {

		this.make = make;
		this.model = model;
		this.color = color;
		this.year = year;
	}

	public void getInfo() {

		System.out.println("make :" + make);
		System.out.println("model :" + model);
		System.out.println("year :" + year);
		System.out.println("color :" + color);
		System.out.println("******************");
	}

	public static void main(String[] args) {
		USCar obj1 = new USCar("Honda");
		USCar obj2 = new USCar("Toytoa", "camry");
		USCar obj3 = new USCar("Tesla", "truck", 2023);
		USCar obj4 = new USCar("benz", "xy", 2020, "black");
		obj1.getInfo();
		obj2.getInfo();
		obj3.getInfo();
		obj4.getInfo();
	}

}
