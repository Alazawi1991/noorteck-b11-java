package com.noorteck.java.day16.Package2;

import com.noorteck.java.day16.Package1.DemoPrivate;

public class DiffPackagePrivate {
	public static void main(String[] args) {
		System.out.println(DemoPrivate.city);

		DemoPrivate.subtract(2, 2);

		DemoPrivate obj = new DemoPrivate();
		System.out.println(obj.country);

		obj.add(3, 3);

	}

}
