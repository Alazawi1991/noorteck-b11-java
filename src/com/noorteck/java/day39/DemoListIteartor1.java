package com.noorteck.java.day39;

import java.util.ArrayList;
import java.util.ListIterator;

public class DemoListIteartor1 {
	public static void main(String[] args) {

		ArrayList<String> StudentList = new ArrayList<String>();

		StudentList.add("Ahmed");
		StudentList.add("Cindy");
		StudentList.add("Zain");
		StudentList.add("Alishan");
		StudentList.add("Jackie");

		ListIterator<String> lit = StudentList.listIterator();

		while (lit.hasNext()) {

			System.out.println(lit.next());
		}
		System.out.println("****************");

		while (lit.hasPrevious()) {

			System.out.println(lit.previous());
		}

	}

}


/**hasNext() --> It checks if the next index position has a VALUE, if it does then return TRUE if it does not return valse


next()  --> returns the values for the next index position then moves the cursor to the waiting area


hasPrevious() --> It checks if the previous index position has a VALUE, if it does then return TRUE if it does not return valse

previous()  --> returns the values for the previous index position then moves the cursor to the waiting area*/