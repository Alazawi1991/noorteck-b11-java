package com.noorteck.java.day30;

public class Dell extends Computer {
	public Dell() {
	super(999,99,"win11");
	
	System.out.println("Dell constroctor");
	
	
	}
}
/**
It is complaining because, java realizes that the Parent Class (Computer) has a parameterized constructor
	so in this case, java telling us we MUST EXPLICITLY call the parent constructor using super() and pass those 
	parameters 
*/