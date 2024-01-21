package com.noorteck.java.day39;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class DemoIteraor2 {

	public static void main(String[] args) {

		ArrayList<String> StudentList = new ArrayList<String>();

		StudentList.add("Ahmed");
		StudentList.add("Cindy");
		StudentList.add("Zain");
		StudentList.add("Alishan");
		StudentList.add("Jackie");

		Iterator<String> it = StudentList.iterator();

		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());

		System.out.println("****************");

		HashSet<Character> gradeSet = new HashSet<Character>();
		gradeSet.add('A');
		gradeSet.add('B');
		gradeSet.add('C');
		gradeSet.add('D');
		Iterator<Character> it2 = gradeSet.iterator();
		while (it2.hasNext()) {

			System.out.println(it2.next());
		}

	}

}
