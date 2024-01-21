package com.noorteck.java.day40;

public class DemoUnchecked2 {

	public static void main(String[] args) {

		System.out.println("program started....");

		int a = 10;
		int b = 0;

		try {
			int results = a / b;

			System.out.println("divistion: " + results);

		} catch (ArithmeticException e) {

			System.out.println("Connot divided number by zero...");
			e.printStackTrace();

		}
		System.out.println("progran execytuib ended");
		for (int i = 0; i < 100; i++) {

			System.out.println(i);

		}
	}

}
