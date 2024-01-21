package com.noorteck.java.day24;

public class Exercise5 {
	public static void main(String[] args) {
		char c1[] = { 'a', 'b', 'x', 'd', 'a', 'd', 'e', 'q', 'a' };
		char c2[] = { 'x', 'd', 'a', 'd', 'e', 'q', 'a' };
		char c3[] = { 'e', 'd', 'a', 'd', 'e', 'q', 'a', 'e' };
		char c4[] = { 'a' };

		Exercise5 obj = new Exercise5();
		System.out.println(obj.sameFirstLast(c1));
		System.out.println(obj.sameFirstLast(c2));
		System.out.println(obj.sameFirstLast(c3));
		System.out.println(obj.sameFirstLast(c4));

	}

	protected boolean sameFirstLast(char c[]) {

		if (c.length >1 && c[0] == c[c.length - 1]) {

			return true;

		} else {
			return false;
		}

	}

}
