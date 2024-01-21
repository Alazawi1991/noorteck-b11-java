package com.noorteck.java.day16.Package1;

public class SamePackageDefault {

	public static void main(String[] args) {
		System.out.println(DemoDefault.price);
		DemoDefault.subtract(2, 2);

		DemoDefault obj = new DemoDefault();
		System.out.println(obj.country);
		obj.add(2, 2);
	}

}
