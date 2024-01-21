package com.noorteck.java.day14;

public class STATIC_METHOD2 {
	public void getInfo() {
		
		
		System.out.println("Data.....");}
		
public static void display() {
	//How to call {NON-STATIC METHOD } from {STATIC METHOD BODY} in the {SAME CLASS}
	STATIC_METHOD2 obj= new STATIC_METHOD2();
			
			obj.getInfo();
	
}
	

		
	}
/**
To access {NON-STATIC METHOD} from  {STATIC METHOD BODY} in the {SAME CLASS}

 		Part 1. Create ClassObject
		 Part 2. ObjectName.nonStaticMethodName();
		 	 
*/

	
	
	

