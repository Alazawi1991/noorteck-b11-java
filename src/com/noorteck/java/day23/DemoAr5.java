package com.noorteck.java.day23;

public class DemoAr5 {

	public static void main(String[] args) {

		String state[] = { "CA", "FL", "AZ", "MO", "VA", "NY", "VA", "NY", "NY" };
		System.out.println(state[0]);
		System.out.println(state[1]);
		System.out.println(state[2]);
		System.out.println(state[3]);
		System.out.println(state[4]);
		System.out.println(state[5]);
		System.out.println(state[6]);
		System.out.println(state[7]);
		System.out.println(state[8]);
		System.out.println("Arry length:" + state.length);
		System.out.println("****************");

		for (int i = 0; i < state.length; i++) {
			System.out.println(state[i]);
		}
		System.out.println("****************");
		int j = 0;
		while (j < state.length) {
			System.out.println(state[j]);
			j++;
		}
		System.out.println("****************");

		
		int y=0;
		do {
			System.out.println(state[y]);
			y++;}
			while (y<state.length);
		
	}

}
