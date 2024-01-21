package com.noorteck.java.day20;

public class DemoM13 {
	public static void main(String[] args) {

		String s1 = "JavaProgram";

		System.out.println(s1.startsWith("J"));
		System.out.println(s1.startsWith("Jav"));
		System.out.println(s1.startsWith("JavaPr"));
		System.out.println(s1.startsWith("ava"));
		System.out.println(s1.startsWith("ram"));
		System.out.println(s1.startsWith("Jov"));

		System.out.println("************");

		String s2 = "JavaProgram";
		System.out.println(s2.startsWith("va", 0));
		System.out.println(s2.startsWith("va", 1));
		System.out.println(s2.startsWith("va", 2));
		System.out.println(s2.startsWith("p", 4));
		System.out.println(s2.startsWith("prog", 4));
		System.out.println(s2.startsWith("rog", 4));

	}
}
/**
 * 
 * 1. What is the methodName?
 * 
 * startsWith()
 * 
 * 2. How many Parameters does it?
 * 
 * 1 Param
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
 * startsWith() method checks if the String starts with given suffix if it
 * starts then returns true otherwise false
 * 
 */

/**
 * 
 * 1. What is the methodName?
 * 
 * startsWith()
 * 
 * 2. How many Parameters does it?
 * 
 * 2 Param
 * 
 * 3. If it takes parameter, then what are the dataTypes?
 * 
 * String, int
 * 
 * 4. What is the return type of the method?
 * 
 * boolean
 * 
 * 5. What is the purpose of this method? What does it do?
 * 
 * startsWith() method checks if the String starts with given suffix from the
 * given index position(param2) if it starts then returns true otherwise false
 * 
 */