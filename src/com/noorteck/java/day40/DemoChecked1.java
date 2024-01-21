package com.noorteck.java.day40;

public class DemoChecked1 {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Today");
		Thread.sleep(2000);
		System.out.println("is");
		Thread.sleep(2000);
		System.out.println("last");
		Thread.sleep(2000);
		System.out.println("java");
		Thread.sleep(2000);
		System.out.println("session......");

	}

}
/**
CheckedException --> is checked at a compile time

	--> Before we run the program java can tell us that this line can
			cause an issue/exception
			
	--> Java wants us to HANDLE this issue before we can run the program
	
	
How to handle this issue?

	1. use the --> throws keyword
	
	2. use the --> try-catch block



*/