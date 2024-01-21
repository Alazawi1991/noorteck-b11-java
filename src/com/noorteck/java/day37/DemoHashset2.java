package com.noorteck.java.day37;

import java.util.HashSet;

public class DemoHashset2 {
	public static void main(String[] args) {

		HashSet<String> Stateset = new HashSet<String>();

		Stateset.add("Va");
		Stateset.add("MA");
		Stateset.add("NY");
		Stateset.add("TX");
		Stateset.add("NC");
		Stateset.add("SC");
		Stateset.add("AL");
		for (String state : Stateset) {

			System.out.println(state);

		}
	}

}

//1. TODO	--> Using FOOR LOOP, Loop through stateSet and print 1 value at a time
//can't be done
// 2. TODO --> Using WHILE LOOP, Loop through stateSet and print 1 value at a
// time
//Can't be done 
// 3. TODO --> Using DO_WHILE LOOP, Loop through stateSet and print 1 value at a
// time
//Can't be done 
// 4. TODO --> Using ENHANCED FOR LOOP, Loop through stateSet and print
// 1 value at a time
