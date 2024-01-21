package com.noorteck.java.day12;

public class Exercise3 {

	public static void main(String[] args) {

		int n1 = getOutcome(5, 2);
		int n2 = getOutcome(5, 20);
		int n3 = getOutcome(20, 20);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);

	}

	public static int getOutcome(int numOne, int numTwo) {
		int result = 0;
		if (numOne > numTwo) {

			result = numOne - numTwo;
			return result;
		} else if (numOne < numTwo) {

			result = numOne + numTwo;
			return result;
		} else if (numOne == numTwo) {

			result = numOne + numTwo;

			result = result * 2;
		}
		return result;

	}

}
