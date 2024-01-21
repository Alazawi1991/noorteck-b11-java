package com.noorteck.java.day30;

public class USCar2 {

	private String make;
	private String model;
	private int year;
	private String color;

	public USCar2(String make) {
		this(make, "n/a", 2024, "n/a");
	}

	public USCar2(String make, String model) {
		this(make, model, 2024, "n/a");
	}

	public USCar2(String make, String model, int year) {
		this(make, model, year, "n/a");
	}

	public USCar2(String make, String model, int year, String color) {

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
		USCar2 obj1 = new USCar2("Honda");
		USCar2 obj2 = new USCar2("Toytoa", "camry");
		USCar2 obj3 = new USCar2("Tesla", "truck", 2023);
		USCar2 obj4 = new USCar2("benz", "xy", 2020, "black");
		obj1.getInfo();
		obj2.getInfo();
		obj3.getInfo();
		obj4.getInfo();
	}

}
/**
 * 
 * this keyword --> it is used when our parameter/local variable is same as the
 * instance variable name. to deff between instance & local/parameter name we
 * use this keyword
 * 
 * 
 * this() --> is used to call constructor
 * 
 * if the class has 2 or more constructor and if we want to call one
 * contstrucotr inside another constructor then we can use this() and pass
 * parameter inside ()
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
