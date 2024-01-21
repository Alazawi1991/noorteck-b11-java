package com.noorteck.java.day21;

public class DemoSB1 {

	public static void main(String[] args) {

		StringBuilder sBuilder = new StringBuilder("John");
		System.out.println(sBuilder);
		sBuilder.append("Cena");
		System.out.println(sBuilder);

		StringBuffer sBuffer = new StringBuffer("Java");
		System.out.println(sBuffer);
		sBuffer.append("Program");
		System.out.println(sBuffer);
		
	
	}

}
/**
 * append() --> similar to the concat() method or + operator 
 */