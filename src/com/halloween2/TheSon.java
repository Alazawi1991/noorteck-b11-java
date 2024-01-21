package com.halloween2;

public class TheSon extends TheDad// extends needed to be there
{
	private char grade;

	public final boolean IS_JAVA_FUN = true;
	public final String MY_STATE = "VA";

	public void setGrade(char grade) {// ; was wrong

		this.grade = grade;
	}

	public char getGrade() {// sysout replaced with return value
		return grade;
	}

	public void trapZone() {

		char myGrade;

		int myFavNumber = 12;
		System.out.println("My FavNumber" + myFavNumber);

		String teamName = "myteam";
		System.out.println("My Team Name: " + teamName);

		String schoolName = "";// no need for static
		System.out.println("My School Name: " + schoolName);

		grade = 'm';// need to be char
		System.out.println("My Grade: " + grade);

		setAge(12);
		System.out.println("My age " + getAge());

		setCity("USA");// need to be identfied
		System.out.println("Country :" + getCountry());

		// IS_JAVA_FUN=yes;//removed

	}

	public void moreTrap(char grade) {

		this.grade = grade;

		// MY_STATE = "CA"; // can't be changed its final

		setCountry("USA");
		String country = getCountry();

		setCity("R");
		String city = getCity();

		setAge(12);
		int Age = getAge();

		addNum(3, 4);

		display(2,3);

		trapZone();

	}

}
