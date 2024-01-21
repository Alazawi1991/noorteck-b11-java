package com.noorteck.java.day23;

public class DemoAr4 {

	public static void main(String[] args) {

		String state[] = { "ca", "FL", "AZ", "MO", "va", "ny", "va", "ny", "ny" };

		System.out.println("Arry Length:" + state.length);
		System.out.println("First Element:" + state[0]);
		System.out.println("Last Element:" + state[state.length - 1]);
		int arryLength = state.length - 1;
		System.out.println("last element:" + state[arryLength]);
		System.out.println("last element index#:" + (state.length - 1));

		String firstName = "John";

		System.out.println("String obj Length:" + firstName.length());
		/**
		 * If we are working with String Class then to get the length we will use the
		 * length() --> (method)
		 */

		/**
		 * But if we are working with ARRAY then to get the length we need to use length
		 * --> (variable)  
		 */
		System.out.println("Arrray Length :" + state.length);

	}

}
/***
 * Whenever we work with ARRAY
 * 
 * it is IMPORTANT to KNOW following:
 * 
 * 1. What is the length of the ARRAY --> length 2. Where is the FIRST element
 * in an ARRAY --> index zero 3. Where is the LAST element in an ARRAY -->
 * length - 1
 * 
 * 
 * 
 * 
 */