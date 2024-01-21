package com.noorteck.java.day14;

public class INSTANCE1 {

	String country;

	public void getInfo() {

		/*
		 * How to call {INSTANCE VARIABLE } from {NON-STATIC METHOD BODY} in
		 * the {SAME CLASS}
		 */

		country = "USA";

		System.out.println(country);

	}

}
/**
 * To access {INSTANCE VARIABLE} from {NON-STATIC METHOD BODY} in the {SAME
 * CLASS}
 * 
 * --> Call {DIRECTLY BY} the {INSTANCE VARIABLE NAME}
 * 
 * 
 * 
 */