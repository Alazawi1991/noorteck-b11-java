package com.noorteck.java.day29;

public class C extends B {
	String name = "GrandChild";

	public void getInfo() {

		System.out.println(super.name);
		System.out.println("********");
		getValue();

	}

}
