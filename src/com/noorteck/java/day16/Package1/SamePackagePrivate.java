package com.noorteck.java.day16.Package1;

public class SamePackagePrivate {

	public static void main(String[] args) {
		System.out.println(DemoPrivate.city);
		DemoPrivate.subtract(2, 2);

		Demoprivate obj = new DemoPrivate();
		System.out.println(obj.country);
		obj.add(2, 4);
	}

}
/**
 * Since the access modifier for static & non-static membbers are PRIVATE, we
 * cannot access them OUTSIDE THE CLASS
 * 
 * 
 */