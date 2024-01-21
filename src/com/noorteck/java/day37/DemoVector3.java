package com.noorteck.java.day37;

import java.util.Vector;

public class DemoVector3 {
	public static void main(String[] args) {

		Vector<String> v1 = new Vector<String>();

		System.out.println("Capacity: " + v1.capacity());
		System.out.println("size: " + v1.size());

		v1.add("VA");
		v1.add("MD");
		v1.add("VA");
		v1.add("NY");
		v1.add("MO");
		v1.add("CA");

		System.out.println("Capacity: " + v1.capacity());
		System.out.println("size: " + v1.size());
		v1.add("FL");
		v1.add("AZ");
		v1.add("NC");
		v1.add("SC");

		System.out.println("Capacity: " + v1.capacity());
		System.out.println("size: " + v1.size());

		v1.add("Al");

		System.out.println("Capacity: " + v1.capacity());
		System.out.println("size: " + v1.size());
	}
}
