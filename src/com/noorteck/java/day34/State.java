package com.noorteck.java.day34;

public class State implements Country {

	@Override
	public void population() {
		System.out.println("8 mil");

	}

	@Override
	public void capital() {
		System.out.println("DC");

	}

	@Override
	public void city() {

		System.out.println("NW");
	}

	@Override
	public int add(int a, int b) {
		int sum = a + b;
		return 0;
	}

}
