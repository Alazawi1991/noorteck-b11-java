package com.noorteck.java.day16.Package1;

public class SamePackageProtacted {
	public static void main(String[] args) {
		System.out.println(DemoProtacted.count);
		DemoProtacted.add(2, 2);

		DemoProtacted obj = new DemoProtacted();
		System.out.println(obj.gender);
		obj.subtract(2, 2);

	}
}