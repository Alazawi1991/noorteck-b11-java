package com.noorteck.java.day36;

public class Recap2 {
	public static void main(String[] args) {
		String State[] = { "VA", "MD", "NY", "AL", "AZ", "TX", "FL", "NY", "MD" };

		for (int i = State.length - 1; i >= 0; i--) {

			System.out.println(State[i]);
		}
		System.out.println("*****************");

		int y = State.length - 1;
		while (y >= 0) {

			System.out.println(State[y]);
			y--;
		}
		System.out.println("*****************");
		int c = State.length - 1;
		do {
			System.out.println(State[c]);
			c--;

		} while (c >= 0);

		System.out.println("*****************");
	}
}
