package com.noorteck.java.day23;

public class Exercise2 {
	public static void main(String[] args) {

		String state[] = { "VA", "TX", "FL", "NY", "VA", "CA", "MO",

				"ID", "MS", "ME", "NY", "TN", "UT", "MO",

				"HI", "MN", "PA", "NY", "ND", "WA", "NY",

				"GA", "CO", "MD", "VA", "SD", "NM", "DE" };

		int va = 0;
		int ny = 0;
		for (int i = 0; i < state.length; i++) {

			if (state[i].equals("VA")) {
				va++;
			} else if (state[i].equals("NY")) {

				ny++;
			}
		}
		System.out.println("va=" + va);
		System.out.println("ny=" + ny);

	}

}
