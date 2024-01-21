package com.noorteck.java.day28;

public class DemoEmployee {
	public static void main(String[] args) {

		Employee e = new Employee();

		e.setDepartment("QA");
		System.out.println(e.getDepartment());
		e.setage(44);
		e.setgender('m');
		e.setname("John  Cena");

		System.out.println(e.getage());
		System.out.println(e.getgender());
		System.out.println(e.getname());

	}

}
