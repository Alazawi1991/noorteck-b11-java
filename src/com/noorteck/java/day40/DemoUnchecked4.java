package com.noorteck.java.day40;

public class DemoUnchecked4 {

	public static void main(String[] args) {

		System.out.println("program started....");

		int a = 10;
		int b = 2;
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

		catch (Exception e) {

			System.out.println("exception" + e.getMessage());
			e.printStackTrace();
		}

		System.out.println("progran exercise ended");
		for (int i = 0; i < 100; i++) {

			 System.out.println(i);

		}
	}

}
