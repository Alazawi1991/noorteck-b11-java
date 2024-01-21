package com.noorteck.java.day29;

public class DemoFinalVariable1 {

	String counrty = "USa";

	static String city = "Reston";

	final String SPORT = "Soccer";
	static final String GRADE_LEVEL = "freshman";

	public static void main(String[] args) {

		DemoFinalVariable1 obj = new DemoFinalVariable1();

		obj.counrty = "usa";
		obj.counrty = "mexico";
		obj.counrty = "england";
		obj.counrty = "canada";

		city = "ashburn";
		city = "herndon";
		city = "sterling";
		city = "aldie";

		obj.SPORT = "basketball";
		obj.SPORT = "football";

		GRADE_LEVEL = "sophmore";
		GRADE_LEVEL = "junior";
		GRADE_LEVEL = "senior";

	}
}
