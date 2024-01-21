package com.noorteck.java.day16.Package1;

public class samePackagePublic {

	public static void main(String[] args) {
		System.out.println(DemoPublic.city);
		DemoPublic.subtract(2, 2);

		DemoPublic obj = new DemoPublic();
		System.out.println(obj.country);
		obj.add(2, 4);
	}

}
