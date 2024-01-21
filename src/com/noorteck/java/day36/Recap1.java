package com.noorteck.java.day36;

public class Recap1 {
	public static void main(String[] args) {

		String State[] = { "VA", "MD", "NY", "AL", "AZ", "TX", "FL", "NY", "MD" };
		for (int i = 0; i < State.length; i++) {

			System.out.println(State[i]);
		}

		System.out.println("***************");

		int y = 0;

		while (y < State.length) {

			System.out.println(State[y]);

			y++;
		}
		System.out.println("***************");

		int c = 0;
		do {
			System.out.println(State[c]);
			c++;
		} while (c < State.length);

		System.out.println("***************");

	}
}