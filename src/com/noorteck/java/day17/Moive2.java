package com.noorteck.java.day17;

public class Moive2 {
	
	String Title;
	String directir;
	int releaseyear;
	String language;
	String country;
	String mainActor;
	String category;
	String rating;

	public Moive2(String Title, String directir, int releaseyear, String language, String country, String mainActor, String rating, String category) {

		this.Title = Title;
		this.directir = directir;
		this.releaseyear = releaseyear;
		this.language = language;
		this.country = country;
		this.mainActor = mainActor;
		this.category = category;
		this.rating = rating;
	}

	public static void main(String args[]) {

		Movie s1 = new Movie("m", "m2", 1999, "m3", "m4", "m5", "m6", "m7");

		Movie s2 = new Movie("a", "a2", 2000, "a3", "a4", "a5", "a6", "a7");
		Movie s3 = new Movie("b", "b2", 2001, "b3", "b4", "b5", "b6", "b7");
		System.out.println(s1.Title);
		System.out.println(s1.directir);
		System.out.println(s1.releaseyear);
		System.out.println(s1.language);
		System.out.println(s1.country);
		System.out.println(s1.mainActor);
		System.out.println(s1.category);
		System.out.println(s1.rating);

	}

}

	
	
	
