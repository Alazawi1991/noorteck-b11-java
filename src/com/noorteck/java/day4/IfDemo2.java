package com.noorteck.java.day4;

public class IfDemo2 {

	public static void main(String args[]) {

		/**
		 * else block ------------
		 * 
		 * if (boolean_expression ) {
		 * 
		 * code
		 * 
		 * } else {
		 * 
		 * code
		 * 
		 * }
		 * 
		 * 
		 * When boolean_expression is TRUE then it will execute if_body When
		 * boolean_expression is FALSE then it will execute else_body
		 * 
		 * 
		 */

		int n1 = 10, n2 = 20;
		if (n1 > n2) {
			System.out.println("n1 is greater then n2");
		} else {

			System.out.println("n1 is NOT greater then n2");
		}

		int number = 234;

		if (number > 0) {
			System.out.println("number is positive");
		} else {
			System.out.println("is negtive number");
		}

	}

}
