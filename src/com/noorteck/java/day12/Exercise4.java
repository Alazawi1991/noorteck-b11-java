package com.noorteck.java.day12;

public class Exercise4 {

	public static void main(String[] args) {

		int n1 = difference21(10);
		int n2 = difference21(20);
		int n3 = difference21(25);
		int n4 = difference21(50);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);

	}

	public static int difference21(int num) {
		int result = 0;
		if (num < 21) {

			result = num - 21;
			return result;
		} else if (num > 21) {

			result = (num -21)* 2;
			
			
		}
		return result;
	}

}
