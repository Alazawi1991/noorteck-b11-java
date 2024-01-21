package com.noorteck.java.day9;

public class DemoVoidMethod5 {
	public static void main(String args[]) {
		getDayoftheWeek(8);

	}

	public static void getDayoftheWeek(int day) {
		if (day == 1) {

			System.out.println("Monday");
		}

		else if (day == 2) {

			System.out.println("Tuesday");
		}

		else if (day == 3) {

			System.out.println("Wednsday");
		} else if (day == 4) {

			System.out.println("Thursday");
		} else if (day == 5) {

			System.out.println("Friday");
		} else if (day == 6) {

			System.out.println("Saterurday");
		} else if (day == 7) {

			System.out.println("Sunday");
		}

		else if (day >= 8) {

			System.out.println("Provide Numbers between 1-7");
		}

	}

}
