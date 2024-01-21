package com.noorteck.java.day28;

public class DemoStudent {

	public static void main(String[] args) {

		Student obj = new Student();

		obj.setname("John");
		obj.setage(11);
		obj.setgender('m');

		obj.setid(123);
		obj.setmajor("CS");

		System.out.println(obj.getname());
		System.out.println(obj.getage());
		System.out.println(obj.getgender());
		System.out.println(obj.getid());
		System.out.println(obj.getmajor());

	}

}
