package com.noorteck.java.day38;

import java.util.HashMap;

public class DemoHashMap2 {
	public static void main(String[] args) {
		HashMap<String, String> stateMap = new HashMap<String, String>();
		stateMap.put("va", "Virgina");
		stateMap.put("NY", "New Year");

		HashMap<Integer, Character> gradeMap = new HashMap<Integer, Character>();
		gradeMap.put(90, 'A');
		gradeMap.put(80, 'B');

		HashMap<String, Double> priceMap = new HashMap<String, Double>();
		priceMap.put("Iphone", 2500.00);
		priceMap.put("mac", 3500.00);

		System.out.println(stateMap.get("NY"));
		System.out.println(gradeMap.get(80));
		System.out.println(priceMap.get("mac"));

	}

}
