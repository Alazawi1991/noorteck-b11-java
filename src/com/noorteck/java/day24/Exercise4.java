package com.noorteck.java.day24;

public class Exercise4 {

	public static void main(String[] args) {
		int n1[] = { 6, 1, 2, 3 };
		int n2[] = { 13, 6, 1, 2, 3 };
		int n3[] = { 0, 1, 4, 3, 6 };
		int n4[] = { 0, 6, 0 };

		System.out.println(isFirstLast(n1));
		System.out.println(isFirstLast(n2));
		System.out.println(isFirstLast(n3));
		System.out.println(isFirstLast(n4));
	}

	static boolean isFirstLast(int number[]) {

		boolean a = false;

		if (number[0] == 6 || number[number.length - 1] == 6) {
			a = true;

		} else {
			a = false;
		}

		return a;

	}
}
