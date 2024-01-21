package com.noorteck.java.day39;

import java.util.ArrayList;
import java.util.Iterator;

public class DemoIteraor1 {
	public static void main(String[] args) {
		
		
		ArrayList<String>StudentList= new ArrayList<String>();
		
		StudentList.add("Ahmed");
		StudentList.add("Cindy");
		StudentList.add("Zain");
		StudentList.add("Alishan");
		StudentList.add("Jackie");

		Iterator<String> it=StudentList.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
			
		}
		
	}
	
	
	

}
