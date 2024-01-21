package com.noorteck.java.day37;

import java.util.Vector;

public class DemoVector5 {
	public static void main(String[] args) {

		Vector<String> v3 = new Vector<String>(3,5);

		System.out.println("Capacity: " + v3.capacity());
		System.out.println("size: " + v3.size());

		v3.add("VA");
		v3.add("MD");
		v3.add("VA");

		System.out.println("Capacity: " + v3.capacity());
		System.out.println("size: " + v3.size());

		v3.add("FL");

		System.out.println("Capacity: " + v3.capacity());
		System.out.println("size: " + v3.size());
		v3.add("NY");
		v3.add("MO");
		v3.add("CA");
		v3.add("NY");
		v3.add("MO");
		v3.add("MO");
		System.out.println("Capacity: " + v3.capacity());
		System.out.println("size: " + v3.size());
		v3.add("NY");
		v3.add("MO");
		v3.add("CA");
		v3.add("NY");
		System.out.println("Capacity: " + v3.capacity());
		System.out.println("size: " + v3.size());

	}

}
