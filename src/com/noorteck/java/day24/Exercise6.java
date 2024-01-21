package com.noorteck.java.day24;

public class Exercise6 {

	public static void main(String[] args) {
		int n1[] = { 6, 1, 2, 3 };
		int n2[] = { 13, 6, 1, 2, 3 };
		int n3[] = { 0, 1, 4, 3, 6 };
		int n4[] = { 0, 6, 0 };

		Exercise6 obj = new Exercise6();

		int[] r1 = obj.getfirstLast(n1);
		int[] r2 = obj.getfirstLast(n2);
		int[] r3 = obj.getfirstLast(n3);
		int[] r4 = obj.getfirstLast(n4);
		for (int i = 0; i < r1.length; i++) {
			System.out.println(r1[i]);
		}
		System.out.println("********");
		for (int i = 0; i < r2.length; i++) {
			System.out.println(r2[i]);
		}
		System.out.println("********");

		for (int i = 0; i < r3.length; i++) {
			System.out.println(r3[i]);
		}
		System.out.println("********");

		for (int i = 0; i < r4.length; i++) {
			System.out.println(r4[i]);
		}
		System.out.println("new way");

		obj.printArray(r1);
		obj.printArray(r2);
		obj.printArray(r3);
		obj.printArray(r4);

	}

	void printArray(int num[]) {
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

	}

	int[] getfirstLast(int number[]) {

		int result[] = { number[0], number[number.length - 1] };

		return result;

	}

}
