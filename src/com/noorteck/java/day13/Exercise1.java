package com.noorteck.java.day13;

public class Exercise1 {

	public static void main(String[] args) {
		boolean r1 = inRange(13, 55);
		boolean r2 = inRange(55, 13);
		boolean r3 = inRange(55, 55);
		boolean r4 = inRange(13, 13);
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);

	}

	public static boolean inRange(int numOne, int numTwo) {

		boolean result = false;

		boolean isNumOneWithInRange = (numOne >= 10 && numOne <= 20);
		boolean isNumTwohInRange = (numTwo >= 10 && numTwo <= 20);
		if (isNumOneWithInRange == true && isNumTwohInRange == false) {
			result = true;
		} else if (isNumOneWithInRange == false && isNumTwohInRange == true) {
			result = true;
		}

		return result;

	}

}
