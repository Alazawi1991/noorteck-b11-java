package com.noorteck.java.day12;

public class Exercise2 {
	public static void main(String[] args) {

		boolean n1 = monkeyTrouble(true, false);
		boolean n2 = monkeyTrouble(false, false);
		System.out.println(n1);
		System.out.println(n2);
	}

	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		boolean result = true;

		if (!aSmile == bSmile) {
			result = true;
			return result;
		} else {

			result = false;
			return result;
		}

	}

	/*
	 * public static boolean monkeyTrouble1(boolean aSmile, boolean bSmile) {
	 * 
	 * return (!aSmile || bSmile == true);}
	 */

}
