package com.noorteck.java.day38;

import java.util.HashMap;

public class DemoHashMap1 {

	public static void main(String[] args) {

		HashMap<Integer, String> coutseMap = new HashMap<Integer, String>();

		coutseMap.put(100, "Java");
		coutseMap.put(200, "Selenium");
		coutseMap.put(300, "SQL");
		coutseMap.put(400, "API");
		coutseMap.put(500, "Jenkins");

		System.out.println(coutseMap);
		System.out.println("size of map: " + coutseMap.size());

		coutseMap.put(600, "SQL");
		coutseMap.put(700, "API");

		System.out.println(coutseMap);
		coutseMap.put(100, "JAVA with coffee");
		System.out.println(coutseMap);

		coutseMap.put(1111, null);
		coutseMap.put(2222, null);
		coutseMap.put(33333, null);

		System.out.println(coutseMap);
		coutseMap.put(null, "Break");
		coutseMap.put(null, "Lunch");
		coutseMap.put(null, "Diner");

		System.out.println(coutseMap);

	}

}
