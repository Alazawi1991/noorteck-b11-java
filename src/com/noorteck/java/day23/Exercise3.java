package com.noorteck.java.day23;

public class Exercise3 {

	public static void main(String[] args) {

		int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int sum = 0;

		for (int i = 0; i < num.length; i++) {
			int c = num[i];

			sum = sum + c;
		}
		System.out.println(sum);

	}

}
/**
 * Loop through the num and calculate the sum of all numbers
 * 
 * print the outcome outside the loop  
 */