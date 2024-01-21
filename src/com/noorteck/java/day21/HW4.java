package com.noorteck.java.day21;

public class HW4 {

	public static void main(String[] args) {
		HW4 obj = new HW4();

		String r1 = obj.helloTo("Alishan");
		String r2 = obj.helloTo("brian");
		String r3 = obj.helloTo("faraz");

		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);

	}

	String helloTo(String strOne) {

		String result = "";

		result = "Hello ".concat(strOne);

		return result;
	}

}
