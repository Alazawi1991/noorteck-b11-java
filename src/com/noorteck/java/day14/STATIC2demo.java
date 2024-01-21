package com.noorteck.java.day14;

public class STATIC2demo {
	
	
	public static void getCountry() {
		
		// How to call {STATIC VARIABLE } from {STATIC METHOD BODY} in {DIFFERENT CLASS}
		STATIC3.country = "USA";

		System.out.println(STATIC3.country);

	}

}
/**
 * To access {STATIC VARIABLE} from {STATIC METHOD BODY} in {DIFFERENT CLASS}
 * 
 * ClassName.staticVariableName;  
 */