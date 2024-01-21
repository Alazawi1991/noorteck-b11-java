package com.noorteck.java.day17;

public class Student {

	int id;
	String firstName;
	String lastName;

	public Student() {
		System.out.println("This is comign from constructor");
	}

	public static void main(String[] args) {
		Student s1 = new Student();
	}

}
