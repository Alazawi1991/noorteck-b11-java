package com.noorteck.java.day16.Package2;

import com.noorteck.java.day16.Package1.DemoPublic;

public class DiffPackagePublic {
	public static void main(String[] args) {
		System.out.println(DemoPublic.city);

		DemoPublic.subtract(2, 2);

		DemoPublic obj = new DemoPublic();
		System.out.println(obj.country);

		obj.add(3, 3);

	}

}
