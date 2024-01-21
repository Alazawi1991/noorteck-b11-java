package com.noorteck.java.day14;

public class NON_STATIC_METHOD2 {

	public static void funDay() {
		
		System.out.println("yes.....");
		
	}
	public void getResult() {
		
		//How to call {STATIC METHOD BODY } from {NON-STATIC METHOD BODY} in the {SAME CLASS}	
		
		funDay();
		
		
	}
	
	
}
/**
To access {STATIC METHOD BODY} from  {NON-STATIC METHOD BODY} in the {SAME CLASS}

	--> Call {DIRECTLY BY} the {STATIC METHOD NAME}

*/
