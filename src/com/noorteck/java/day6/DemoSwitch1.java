package com.noorteck.java.day6;

public class DemoSwitch1 {
public static void main(String args[]) {
	
	String season="January";
	
	switch(season) {
	case "fall":
		System.out.println("Recovery from hot weather");
		break;
	case "winter":
		System.out.println("Too Cold");
		break;
	case"spring":
		
		System.out.println("Recover from cold weather");
		break;
	case"summer":
		System.out.println("Too hot");
		break;
	
	default:
		System.out.println("invalid season...");
	}
	
	
	
	
	
	
}
}
