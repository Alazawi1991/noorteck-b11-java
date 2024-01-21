package com.noorteck.java.day14;

public class STATIC_METHOD3demo {

	public static void getCity() {
		// How to call {NON-STATIC METHOD } from {STATIC METHOD BODY} in
		// {DIFFERENT CLASS}
		STATIC_METHOD3 obj = new STATIC_METHOD3();
	}

	public static void getOutcome() {
		// How to call {INSTANCE VARIABLE } from {STATIC METHOD BODY} in
		// {DIFFERENT CLASS}
		STATIC_METHOD3 obj = new STATIC_METHOD3();

		obj.getScore();

	}

}
/**
 * To access {INSTANCE VARIABLE} from {STATIC METHOD BODY} in {DIFFERENT CLASS}
 * 
 * Part 1. Create ClassObject Part 2. ObjectName.instanceVariableName;
 * 
 */

/**
 * To access {NON-STATIC METHOD} from {STATIC METHOD BODY} in {DIFFERENT CLASS}
 * 
 * Part 1. Create ClassObject Part 2. ObjectName.instanceVariableName;  
 */