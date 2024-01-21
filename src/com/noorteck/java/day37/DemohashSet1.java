package com.noorteck.java.day37;

import java.util.HashSet;

public class DemohashSet1 {

	public static void main(String[] args) {

		HashSet<String> Stateset = new HashSet<String>();

		Stateset.add("Va");
		Stateset.add("MA");
		Stateset.add("NY");
		Stateset.add("TX");
		Stateset.add("NC");
		Stateset.add("SC");
		Stateset.add("AL");
		Stateset.add("MO");
		Stateset.add("CA");
		System.out.println(Stateset);
		Stateset.add("Va");
		Stateset.add("VA");
		Stateset.add("VA");
		Stateset.add("NY");
		System.out.println(Stateset);

		Stateset.add(null);
		Stateset.add(null);
		Stateset.add(null);

		System.out.println(Stateset);

	}

}
/**
 * HashSet
 * 
 * >
 * 
 * Inherits Set interface> stored in java.util package> does not maintian
 * insertion order> only unique elements, no duplicate
 * 
 * elements(value) > if added element that is already in the set then it will
 * simply override > allows only 1 NULL value
 * 
 * 
 * 
 */
