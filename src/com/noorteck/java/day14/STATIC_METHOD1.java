package com.noorteck.java.day14;

public class STATIC_METHOD1 {

	
	
	String country;
	
	
	
	
	
	public static void getCountry() {
		
		STATIC_METHOD1 obj=new STATIC_METHOD1();
		
		obj.country="usa";
		System.out.println(obj.country);
		
		
	}
	
}
/**
To access {INSTANCE VARIABLE} from  {NON-STATIC METHOD BODY} in the {SAME CLASS}

 		Part 1. Create ClassObject
		 Part 2. ObjectName.InstanceVariableName
		 	 
	 

*/
		//How to call {INSTANCE VARIABLE } from {STATIC METHOD BODY} in the {SAME CLASS}