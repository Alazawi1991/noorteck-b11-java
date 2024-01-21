package com.noorteck.java.day20;

public class HW2 {
	public static void main(String[] args) {
		HW2 obj = new HW2();

		String r1 = obj.toLower("espn");
		String r2 = obj.toLower("SOCCER");
		String r3 = obj.toLower("STRING CLASS");
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
	}

	protected String toLower(String strOne) {

		String result = strOne.toLowerCase();

		return result;

	}

}
