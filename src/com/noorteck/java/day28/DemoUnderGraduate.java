package com.noorteck.java.day28;

public class DemoUnderGraduate {
	public static void main(String[] args) {

		Undergraduate u = new Undergraduate();

		u.setGradelevel("Junior");

		System.out.println(u.getGradeLevel());

		u.setid(3333);
		u.setmajor("bio");

		System.out.println(u.getid());
		System.out.println(u.getmajor());

		u.setname("Tom");
		u.setage(2);
		u.setgender('m');

		System.out.println(u.getname());
		System.out.println(u.getage());
		System.out.println(u.getgender());

	}
}
