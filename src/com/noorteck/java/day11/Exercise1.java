package com.noorteck.java.day11;

public class Exercise1 {

	public static void main(String[] args) {
		getResult(10, 5);
	}

	public static void getResult(int numOne, int NumTwo) {
		int result = 0;
		if (numOne < NumTwo) {
			result = numOne - NumTwo;
			System.out.println(numOne + "-" + NumTwo + "=" + result);
		} else if (numOne > NumTwo) {
			result = numOne + NumTwo;
			System.out.println(numOne + "+" + NumTwo + "=" + result);
		} else if (numOne == NumTwo) {
			result = numOne * NumTwo;
			System.out.println(numOne + "*" + NumTwo + "=" + result);
		}

	}

}
