package com.noorteck.java.day13;

public class Exersice3 {
	public static void main(String[] args) {
		int r1 = getSML(4, 2, 8, "SMALLEST");
		int r2 = getSML(44, 2, 8, "MEDIUM");
		int r3 = getSML(4, 332, 8, "LARGEST");
		int r4 = getSML(44, 332, 8, "JAVA");

		System.out.println(r1);// 2
		System.out.println(r2);// 8
		System.out.println(r3);// 332
		System.out.println(r4);// 404

	}

	public static int getSML(int n1, int n2, int n3, String str) {
		int result = 0;

		// I will assume n1 is smallest, n1 is medium, n1 is largest
		int smallest = n1;
		int medium = n1;
		int largest = n1;

		// logic to find smallest & largest
		if (n2 < smallest) {
			smallest = n2;
		} else if (n2 > largest) {
			largest = n2;
		}

		if (n3 < smallest) {
			smallest = n3;
		} else if (n3 > largest) {
			largest = n3;
		}

		// find the medium
		if (n1 != smallest && n1 != largest) {
			medium = n1;
		} else if (n2 != smallest && n2 != largest) {
			medium = n2;
		} else {
			medium = n3;
		}

		switch (str) {
		case "SMALLEST":
			result = smallest;
			break;
		case "MEDIUM":
			result = medium;
			break;
		case "LARGEST":
			result = largest;
			break;
		default:
			result = 404;

		}

		return result;
	}
}