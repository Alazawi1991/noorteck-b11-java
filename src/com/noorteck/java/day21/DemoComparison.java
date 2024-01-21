package com.noorteck.java.day21;

public class DemoComparison {
	public static void main(String[] args) {

		// 1. StringBuilder Class

		StringBuilder sBuilder = new StringBuilder("Java");

		long startTime1 = System.currentTimeMillis();

		for (int i = 1; i <= 1000000; i++) {
			sBuilder.append(" World");
		}

		long stopTime1 = System.currentTimeMillis();
		long duration1 = stopTime1 - startTime1;

		System.out.println("StringBuilder: [" + duration1 + "] ms");

		// 2. StringBuffer Class

		StringBuffer sBuffer = new StringBuffer("Java");

		long startTime2 = System.currentTimeMillis();

		for (int i = 1; i <= 1000000; i++) {
			sBuffer.append(" World");
		}

		long stopTime2 = System.currentTimeMillis();
		long duration2 = stopTime2 - startTime2;

		System.out.println("StringBuffer: [" + duration2 + "] ms");

		// 3.String Class
		String str = "Java";

		long startTime3 = System.currentTimeMillis();

		for (int i = 1; i <= 1000000; i++) {
			str = str + "World";
		}

		long stopTime3 = System.currentTimeMillis();
		long duration3 = stopTime3 - startTime3;

		System.out.println("String: [" + duration3 + "] ms");

	}
}
