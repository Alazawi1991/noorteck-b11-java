package com.noorteck.java.day40;

public class DemoUnchecked1 {
	public static void main(String[] args) {

		int a = 10;
		int b = 0;
		int result = a + b;

		System.out.println("Addition:" + result);

		int result2 = a / b;

		System.out.println("Division:" + result2);

	}

}
/**
Unchecked Exception/Runtime Exception

	> is not checked at a compile time, instead it is checked at a runtime


*/