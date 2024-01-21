package com.noorteck.java.day14;

public class NON_STATIC_METHOD3demo {

	public void getName() {
		// How to call {STATIC VARIABLE } from {NON-STATIC METHOD BODY} in
		// {DIFFERENT CLASS}
		NON_STATIC_METHOD3.name = "John";

		System.out.println(NON_STATIC_METHOD3.name);

	}

}
/**
 * To access {STATIC VARIABLE} from {NON-STATIC METHOD BODY} in {DIFFERENT
 * CLASS} ClassName.staticVariableName
 * 
 */
