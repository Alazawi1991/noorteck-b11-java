package com.noorteck.java.day16.Package2;

import com.noorteck.java.day16.Package1.DemoPrivate;

public class DiffPackageDefault {
	public static void main(String[] args) {
			System.out.println(DemoDefault.price);

			DemoDefault.add(2, 2);

			DemoDefault obj = new DemoDefault();
			System.out.println(obj.country);

			obj.subtract(2, 2);
}
