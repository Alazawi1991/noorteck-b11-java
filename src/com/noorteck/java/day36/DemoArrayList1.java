package com.noorteck.java.day36;

import java.util.ArrayList;

public class DemoArrayList1 {
	public static void main(String[] args) {

		ArrayList<String> studentList = new ArrayList<String>();

		studentList.add("Zain");
		studentList.add("Ellen");
		studentList.add("Jackie");
		studentList.add("Babur");

		System.out.println(studentList);

		System.out.println(studentList.size());
		studentList.add("Zain");
		studentList.add("Zain");
		studentList.add("Zain");
		System.out.println(studentList);

		System.out.println(studentList.get(5));
		System.out.println(studentList.get(2));
		studentList.remove(3);
		System.out.println(studentList);
		System.out.println(studentList.size());
		studentList.add(1, "kayla");
		System.out.println(studentList);
		studentList.add("brian");
		System.out.println(studentList);
		System.out.println("size: " + studentList.size());
		System.out.println("First Element: " + studentList.get(0));
		System.out.println("Last Element: " + studentList.get(studentList.size() - 1));

	}
}

/***
 * ArrayList
 * 
 * You need to know:
 * 
 * 1. Size of the ArrayList ---> size() 2. First Element in ArrayLIst --->
 * get(0) 3. Last Element in ArrayList --> get(arrayList.size()-1)
 * 
 *    
 */
