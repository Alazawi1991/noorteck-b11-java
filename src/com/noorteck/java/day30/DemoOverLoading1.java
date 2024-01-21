package com.noorteck.java.day30;

public class DemoOverLoading1 {
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
		DemoOverLoading1 obj = new DemoOverLoading1();

		obj.add(2, 1);
		obj.add(3, 1, 11);
		obj.add(4, 2, 5, 7);

	}

}
/**
 * Method Overloading is when we have 2 or more methods with the same name but
 * differnt parameters in SAME ClASS
 * 
 * Parameters Can be different: 1. Number of Parameter 2. Data type of
 * parameters 3. Sequence of Data type diff
 * 
 */