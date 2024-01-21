package com.noorteck.java.day38;

import java.util.TreeMap;

public class DemoTreeMap1 {
	public static void main(String[] args) {

		TreeMap<String, String> stateMap = new TreeMap<String, String>();

		stateMap.put("VA", "Virgina");
		stateMap.put("CA", "Californa");
		stateMap.put("FL", "Florida");
		stateMap.put("NY", "New York");
		stateMap.put("AZ", "Arizona");
		stateMap.put("AL", "Alaska");

		System.out.println(stateMap);

		stateMap.put("MD", "XYZ");
		System.out.println(stateMap);
		stateMap.put("SC", null);
		stateMap.put("NC", null);
		stateMap.put("NY", null);
		System.out.println(stateMap);
		stateMap.put(null, "Test");
		System.out.println("This Line will not work");
	}
}