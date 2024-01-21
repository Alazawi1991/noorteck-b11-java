package com.noorteck.java.day21;

public class HW5 {

	public static void main(String[] args) {

		char r1 = getCharacter("java teaning", 2);
		char r2 = getCharacter("java teaning", 5);
		char r3 = getCharacter("java teaning", 8);
		char r4 = getCharacter("java teaning", 22);
		char r5 = getCharacter("java teaning", 13);
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r5);
	}

	public static char getCharacter(String strOne, int indexNum) {

		char result = ' ';
		if (indexNum > strOne.length()) {
			result = '?';
		} else {
			result = strOne.charAt(indexNum);
		}
		return result;

	}

}
