package com.noorteck.java.day15;

public class StaticRecapOne {
	public static boolean isJavaFun;
	String month;
	public static int totalAmount;
	String iLikeJava;

	String country;
	int age;
	char gender;
	public static double temperature;

	public void setCountry() {

		// TODO call [country] variable and assign value = "USA";

		// TODO print the value of variable [country]
		country = "usa";
		System.out.println(country);
	}

	public void getCountry() {

		// call method [setCountry()]

		// call variable [gender] and assign value 'f'

		// print the [gender] variable

		// call variable[age] and assign value 11

		// print variable [age]
		setCountry();
		gender = 'f';
		System.out.println(gender);
		age = 10;
		System.out.println(age);

	}

	public static void addNum(int a, int b) {
		int result = a + b;
		System.out.println(result);

		// TODO call [temperature] variable and assign value = 55.55;

		// TODO print the value of variable [temperature]
		temperature = 55.55;
		System.out.println(temperature);
	}

	public static void divNum(int a, int b) {

		// TODO call method[addNum()]
		addNum(10,5);

		System.out.println(a / b);

	}

}
