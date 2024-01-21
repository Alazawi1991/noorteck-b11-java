package com.noorteck.java.day36;

import java.util.LinkedList;

public class DemoLinkList1 {

	public static void main(String[] args) {

		LinkedList<Character> gradeList = new LinkedList<Character>();

		gradeList.add('A');
		gradeList.add('b');
		gradeList.add('c');
		gradeList.add('d');
		gradeList.add('f');
		gradeList.add('f');
		gradeList.add('c');
		gradeList.add('c');
		System.out.println(gradeList);
		System.out.println(gradeList.size());
		System.out.println(gradeList.getFirst());
		System.out.println(gradeList.getLast());
	
	}

}
