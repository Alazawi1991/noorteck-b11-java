package com.noorteck.java.day19;

public class DemoM1 {

	public static void main(String[] args) {

		String s1 = "Java";
		String s2 = "Java";

		String s3 = new String("JAVA");
		String s4 = new String("JAVA");
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));

		if (s1.equals(s2)) {
			System.out.println("Equals....");
		} else {
			System.out.println("Not Equals");
		}
		System.out.println("******************");
		if (s3.endsWith(s4)) {
			System.out.println("Equals....");
		} else {
			System.out.println("Not Equals....");

		}

	}
}

/**
 * 
 * 
 * 1. What is the methodName?
 * 
 * equals()
 * 
 * 2. How many Parameters does it?
 * 
 * 1 parameter
 * 
 * 3. If it takes parameter, then what are the dataTypes?
 * 
 * String
 * 
 * 4. What is the return type of the method?
 * 
 * boolean
 * 
 * 5. What is the purpose of this method? What does it do?
 * 
 * if compares 2 string values, and returns true they are equal otherwise false
 * 
 */
