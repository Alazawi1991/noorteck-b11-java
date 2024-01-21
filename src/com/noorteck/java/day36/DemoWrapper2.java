package com.noorteck.java.day36;

public class DemoWrapper2 {

	public static void main(String[] args) {

		int age = 11;

		Integer ageObj = Integer.valueOf(age);

		System.out.println(age);
		System.out.println(ageObj);

		System.out.println("*************");

		char gender = 'm';
		Character genderObj = Character.valueOf(gender);

		System.out.println(gender);
		System.out.println(genderObj);

		System.out.println("*************");

		Integer myFavNum = 4444;

		int favNum = Integer.valueOf(myFavNum);

		System.out.println(myFavNum);
		System.out.println(favNum);

		Boolean T = false;
		boolean A = Boolean.valueOf(T);
		System.out.println(T);
		System.out.println(A);

	}

}
