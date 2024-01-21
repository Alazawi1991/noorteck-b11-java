package com.noorteck.java.day6;

public class DemoSwitch4 {
	public static void main(String args[]) {

		String day = "Saturday";
		String result = "";

		switch (day) {
		
		case "Monday":

			result = "Lecture day";
			break;

		case "Tuesday":

			result = "Tutoring session";
			break;
		case "Wednesday":

			result = "lecture day";
			break;

		case "Thursday":

			result = "Tutoring session";
			break;
		case "Friday":

			result = "Lecture day";
			break;

		case "Saturday":

			result = "JAav funDay";
			break;
		case "sunday":
			result = "Lecture day";
			break;
		
default:
result="wromg input";
		}
System.out.println(result);
	}
}
