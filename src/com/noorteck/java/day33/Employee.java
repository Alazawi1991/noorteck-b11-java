package com.noorteck.java.day33;

public abstract class Employee {
	public int age;
	public static String City;
	public final int YEAR = 2020;

	public Employee() {
		System.out.println("Constructor with no parms");

	}

	public Employee(String name, int id) {
		System.out.println(name);
		System.out.println(id);

	}

}
/**
 * Abstract class can have > Default Constructor > Parameterized COnstructor
 * 
 * 
 * Variables: What type of variables can we have in an abstract class
 * 
 * > All TYPES (Whatever we can have in concrete class, we can have in abstract
 * class as well
 * 
 * We can have: > instance variable (make it final/non-final) > static variable
 * (make it final/non-final) > local variable (make it final/non-final)
 * 
 * 
 * 
 * MEthod: What type of methods can we have in an abstract class
 * 
 * We can have:
 * 
 * > abstract method > concrete method > final method > static method > private
 * method
 * 
 * Whatever the COncrete class can have, the Abstract class can have that as
 * well. PLUSt the abstract method  
 */