package com.noorteck.java.day34;

public interface Laptop {

	public abstract void add();

	public static void subtract() {
		System.out.println(2 - 1);

	}

	default void divide(int a, int b) {

		System.out.println(a / b);
	}

}
/**
 * Java 1. 7 & below in INterface we can only have PUBLIC ABSTRACT METHODS
 * 
 */
