package com.noorteck.java.day32;

public class Calculator {

	public void add(int a, int b) {

		System.out.println(a + b);
	}

	public void add(int a, int b, int c) {

		System.out.println(a + b + c);
	}

	public void add(int a, int b, int c, int d) {

		System.out.println(a + b + c + d);
	}

	public static void main(String[] args) {

		Calculator obj = new Calculator();
		obj.add(2, 3);
		obj.add(3, 3, 4);
		obj.add(3, 4, 4, 9);

	}
}

/**
 * CompileTime Polymorphism
 * 
 * > Is resolved at a compile time > Method overloading is an example of
 * CompileTime Polymorphism
 * 
 * > MEthod overloading happens in same class where we have 2 or more methods
 * with the same method name but diff in parameters: Params can be different: 1.
 * the # of params can be diff 2. the datatype of params can be diff 3. the
 * sequence of param datatype can be diff 
 * 
 * 
 * 
 */