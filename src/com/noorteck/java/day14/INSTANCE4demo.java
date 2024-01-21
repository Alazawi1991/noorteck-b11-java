package com.noorteck.java.day14;

public class INSTANCE4demo {

	public void getAgeInfo() {

		// How to call {NON-STATIC METHOD} from {NON-STATIC METHOD BODY} in
		// {DIFFERENT CLASS}F
		INSTANCE4 obj = new INSTANCE4();

		obj.age();

	}

}
/**
 * To access {NON-STATIC METHOD} from {NON-STATIC METHOD BODY} in {DIFFERENT
 * CLASS}
 * 
 * Part 1. Create ClassObject Part 2. ObjectName.methodName()
 * 
 * (Object of which class do I need to create on PART 2 We should create object
 * of class where the NON-STATIC METHOD is declared )
 * 
 */
