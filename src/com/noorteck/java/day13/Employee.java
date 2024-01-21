package com.noorteck.java.day13;

public class Employee {
	String firstName="John";
	int id;
	String country;
	char gender;

	public static void main(String[] args) {
Employee obj= new Employee();

obj.firstName="John";
obj.id=123;
obj.country="usa";
obj.gender='m';


		System.out.println(obj.firstName);
		System.out.println(obj.id);
		System.out.println(obj.country);
		System.out.println(obj.gender);
		
		
		
		
		System.out.println("**************");
		
		
		Employee obj2= new Employee();

		obj2.firstName="tom";
		obj2.id=222;
		obj2.country="usa";
		obj2.gender='m';


				System.out.println(obj2.firstName);
				System.out.println(obj2.id);
				System.out.println(obj2.country);
				System.out.println(obj2.gender);

		
		
		
		
		
		
		
		

	}

}
