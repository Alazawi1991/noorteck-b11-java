package com.noorteck.java.day40;

public class DemoUnchecked3 {

	public static void main(String[] args) {

		System.out.println("program started....");

		int a = 10;
		int b = 0;
		String arr[] = { "Java", "Selenium", "SQL" };
		String str = null;

		try {
			int results = a / b;

			System.out.println("divistion: " + results);
			System.out.println(arr[0]);
			System.out.println(arr[1]);
			// System.out.println(arr[44]);

			System.out.println(str.length());
		}

		 catch (ArithmeticException e) {

			System.out.println("Connot divided number by zero...");
			e.printStackTrace();

		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Index # Dose not exict");
			e.printStackTrace();
		} catch (NullPointerException e) {

			System.out.println("String is null");
			e.printStackTrace();
		}
		System.out.println("progran exercise ended");
		for (int i = 0; i < 100; i++) {

			// System.out.println(i);

		}
		}

}
