package com.noorteck.java.day37;

import java.util.LinkedHashSet;

public class DemoLinkedHasSet {

	public static void main(String[] args) {

		LinkedHashSet<String> stateset = new LinkedHashSet<String>();

		stateset.add("Va");
		stateset.add("MA");
		stateset.add("NY");
		stateset.add("TX");
		stateset.add("NC");
		stateset.add("SC");
		stateset.add("AL");
		System.out.println(stateset);
		stateset.add("Va");
		stateset.add("Va");
		stateset.add("Va");
		System.out.println(stateset);
		stateset.add(null);
		stateset.add(null);
		System.out.println(stateset);
	}
}
