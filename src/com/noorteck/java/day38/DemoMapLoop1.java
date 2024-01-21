package com.noorteck.java.day38;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class DemoMapLoop1 {
	public static void main(String[] args) {

		LinkedHashMap<String, String> stateMap = new LinkedHashMap<String, String>();

		stateMap.put("VA", "Virgina");
		stateMap.put("CA", "Californa");
		stateMap.put("FL", "Florida");
		stateMap.put("NY", "New York");
		stateMap.put("AZ", "Arizona");
		stateMap.put("AL", "Alaska");

		System.out.println(stateMap.keySet());

		System.out.println(stateMap.values());

		System.out.println(stateMap.entrySet());

		for (String x : stateMap.keySet()) {
			System.out.println(x);
		}
			for (String y : stateMap.values()) {
				System.out.println(y);
			}
				for (Entry<String, String> F : stateMap.entrySet()) {
					System.out.println(F);}

		}
	

}
