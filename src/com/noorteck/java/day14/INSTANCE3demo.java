package com.noorteck.java.day14;

public class INSTANCE3demo {

	public void getCity() {
		// How to call {INSTANCE VARIABLE } from {NON-STATIC METHOD BODY} in
		// {DIFFERENT CLASS}

		INSTANCE3 obj = new INSTANCE3();

		obj.city = "reston";

		System.out.println(obj.city);

	}

}
/**
 * To access {INSTANCE VARIABLE} from {NON-STATIC METHOD BODY} in {DIFFERENT
 * CLASS}
 * 
 * Part 1. Create ClassObject Part 2. ObjectName.InstanceVariableName
 * 
 * (Object of which class do I need to create on PART 2 We should create object
 * of class where the INSTANCE VARIABLE is declared )
 */