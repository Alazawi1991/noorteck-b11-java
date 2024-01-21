package com.noorteck.java.day17;

public class Batch11Students {
	String firstName;
	String lastName;
	String city;

	public Batch11Students(String fn,String ln,String c) {
		firstName=fn;
		lastName=ln;
		city=c;
	}
	
	
	
	public void display() {

		System.out.println("FirstName :" + firstName);
		System.out.println("LastName :" + lastName);
		System.out.println("City :" + city);
	}

	public static void main(String args[]) {

		Batch11Students s1 = new Batch11Students("Ellen","Smith","Valrico");
		Batch11Students s2 = new Batch11Students("Kayla","Ahlert","st.pete");
		Batch11Students s3 = new Batch11Students("Jackie","Chapman",null);
		
		/* s1.firstName = "Ellen";
		 s1.lastName = "Smith";
		s1.city = "Valrico";

		s2.firstName = "Kayla";
		s2.lastName = "Ahlert";
		s2.city = "st.pete";

		s3.firstName = "Jackie";
		s3.lastName = "Chapman";
		s3.city = null;*/

		s1.display();
		s2.display();
		s3.display();
	}

}
