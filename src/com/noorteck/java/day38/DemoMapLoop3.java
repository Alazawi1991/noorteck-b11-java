package com.noorteck.java.day38;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DemoMapLoop3 {

	public static void main(String[] args) {

		LinkedHashMap<String, Integer> gradeMap = new LinkedHashMap<String, Integer>();

		gradeMap.put("Ahmed", 80);
		gradeMap.put("Jackie", 90);
		gradeMap.put("Ehsan", 100);
		gradeMap.put("Alishan", 70);
		gradeMap.put("Zain", 60);
		gradeMap.put("Noor", 50);
		gradeMap.put("Kayla", 40);
		gradeMap.put("Babur", 30);

		for (Entry<String, Integer> c : gradeMap.entrySet()) {

			String Name = c.getKey();
			Integer grade = c.getValue();
			if (grade >= 85) {

				System.out.println(Name + " : " + grade);

			}
		}
		System.out.println("***************");
		int tottal = 0;
		for (Integer avrage : gradeMap.values()) {

			tottal = tottal + avrage;
		}
		int sum = 0;
		sum = tottal / gradeMap.size();
		System.out.println(sum);

	}

}
