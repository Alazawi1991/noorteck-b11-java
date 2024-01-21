package com.noorteck.java.day37;

import java.util.Vector;

public class DemoVector4 {
	public static void main(String[] args) {

		Vector<String> v2 = new Vector<String>(6);

		System.out.println("Capacity: " + v2.capacity());
		System.out.println("size: " + v2.size());

		v2.add("VA");
		v2.add("MD");
		v2.add("VA");
		v2.add("NY");
		v2.add("MO");
		v2.add("CA");

		System.out.println("Capacity: " + v2.capacity());
		System.out.println("size: " + v2.size());

		v2.add("FL");

		System.out.println("Capacity: " + v2.capacity());
		System.out.println("size: " + v2.size());

	}

}
