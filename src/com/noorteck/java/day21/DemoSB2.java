package com.noorteck.java.day21;

public class DemoSB2 {

	public static void main(String[] args) {
		StringBuilder sBuilder = new StringBuilder("Java");

		sBuilder.reverse();
		System.out.println(sBuilder);

		StringBuffer sBuffer = new StringBuffer("Program");
		sBuffer.reverse();
		System.out.println(sBuffer);

	}

}
/**
 * 
 * reverse() --> it reverse the string     
 */