package com.noorteck.java.day20;

public class HW3 {

	public static void main(String[] args) {
		String r1 = combineStr("day", "ONE", "work", "Hours");
		String r2 = combineStr("week", "weekend", "monday", "Tuesday");
		String r3 = combineStr("restoN", "vA", "baltiMORE", "Md");
		String r4 = combineStr("java", "is", "fun", "LEARNING");
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
	}

	protected static String combineStr(String strOne, String strTwo, String strThree, String strFour) {

		strOne = strOne.toUpperCase();
		strTwo = strTwo.toLowerCase();
		strThree = strThree.toUpperCase();
		strFour = strFour.toLowerCase();
		String result = strOne.concat(strTwo).concat(strThree).concat(strFour);
		return result;
	}

}
