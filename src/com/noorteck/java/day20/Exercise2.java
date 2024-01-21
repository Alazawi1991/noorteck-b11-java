package com.noorteck.java.day20;

public class Exercise2 {
	public static void main(String[] args) {
		boolean r1 = isThreeEqual("day", "Day", "DaY");
		boolean r2 = isThreeEqual("week", "weekend", "monday");
		boolean r3 = isThreeEqual("java", "JAVa", "java");
		boolean r4 = isThreeEqual("javaProgramming", "java Programming", "Programing in java");
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
	}

	static boolean isThreeEqual(String strOne, String strTwo, String strThree) {
		boolean result = false;
		if (strOne.equalsIgnoreCase(strTwo) && strTwo.equalsIgnoreCase(strThree)) {

			result = true;

		}
		return result;

	}

}
