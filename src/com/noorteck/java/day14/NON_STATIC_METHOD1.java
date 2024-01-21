package com.noorteck.java.day14;

public class NON_STATIC_METHOD1 {

	public static int count;

	public void getCount() {
		// How to call {STATIC VARIABLE } from {NON-STATIC METHOD BODY} in
		// the {SAME CLASS}
		count = 11;

		System.out.println(count);

	}

}
/**
 * To access {STATIC VARIABLE} from {NON-STATIC METHOD BODY} in the {SAME CLASS}
 * 
 * --> Call {DIRECTLY BY} the {STATIC VARIABLE NAME}
 * 
 */
