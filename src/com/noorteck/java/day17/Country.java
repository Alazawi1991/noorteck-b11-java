package com.noorteck.java.day17;

public class Country {

	String countryName;
	String capital;

	public static void main(String[] args) {
		Country obj = new Country();

		System.out.println(obj.countryName);
		System.out.println(obj.capital);

		obj.countryName = "USA";
		obj.capital = "DC";

		System.out.println(obj.countryName);
		System.out.println(obj.capital);

	}

}
