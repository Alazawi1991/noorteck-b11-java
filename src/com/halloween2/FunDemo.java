package com.halloween2;

public class FunDemo {

	public static void main(String[] args) {

		// The Grandpa Object
		TheGrandpa grandpaObj = new TheGrandpa();

		grandpaObj.setCountry("USA");
		System.out.println(grandpaObj.getCountry());

		grandpaObj.addNum(2, 5);
		grandpaObj.display(2, 5);

		TheDad dadObj1 = new TheDad();
		dadObj1.setAge(66);
		System.out.println(dadObj1.getAge());

		// TheDad object

		TheDad dadObj = new TheDad();

		dadObj.setAge(12);
		dadObj.setAge(33);
		System.out.println(dadObj.getAge());
		int result = dadObj.favNumWho(7);
		dadObj.setCountry("Canada");
		System.out.println(dadObj.getCountry());

		// TheSon object
		TheSon sonObj = new TheSon();

		sonObj.setGrade('A');

		char resultGrade = sonObj.getGrade();
		System.out.println(resultGrade);

		sonObj.addNum(3, 5);

		sonObj.setCity("Reston");

		System.out.println(sonObj.getCity());

		sonObj.trapZone();

		sonObj.moreTrap('n');

		System.out.println("Yes :)");
	}
}
