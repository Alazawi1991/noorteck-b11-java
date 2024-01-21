package com.noorteck.java.day11;

public class DemoNonVoid4 {
	public static void main(String[] args) {
		String resultOne = getNumber(10);
		String resultTwo = getNumber(-10);
		String resultThree = getNumber(0);
		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);

	}

	public static String getNumber(int number) {

		String result = "";
		if (number < 0) {
			result = "posititve";

			return result;
		}

		else if (number > 0) {
			result = "negitive";
			return result;
		}

		else {
			result = "zero";
			return result;

		}
	}

}