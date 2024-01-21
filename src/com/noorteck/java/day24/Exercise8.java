package com.noorteck.java.day24;

public class Exercise8 {
	public static void main(String[] args) {
		int n1[] = { 6, 1, 2, 3 };
		int n2[] = { 13, 2, 3, 4, 6, 1, 2, 3 };
		int n3[] = { 3, 3, 0, 1, 4, 3, 6 };
		int n4[] = { 2, 6, 2 };

		System.out.println(checkNum(n1));
		System.out.println(checkNum(n2));
		System.out.println(checkNum(n3));
		System.out.println(checkNum(n4));
	}

	protected static boolean checkNum(int[] number) {

		boolean outcome = false;
		int counTwo = 0;
		int countFive = 0;
		for (int i = 0; i < number.length; i++) {
			if (number[i] == 2) {
				counTwo++;

				outcome = true;
			} else if (number[i] == 5) {
				countFive++;
			}
			if (counTwo == 2 || countFive == 2) {
				outcome = true;
			}
		}

		return outcome;

	}

}
