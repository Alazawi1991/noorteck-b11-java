package com.noorteck.java.day15;

public class StaticRecapTwo {
	// static method
	public static void getInfo() {

		// TODO call [isJavaFun] variable and assign value = true

		StaticRecapOne.isJavaFun = true;

		// TODO call [totalAmount] variable and assign value = 1111
		StaticRecapOne.totalAmount = 1111;

		// TODO print value of variable [isJavaFun]

		System.out.println(StaticRecapOne.isJavaFun);
		// TODO print value of variable [totalAmount]
		System.out.println(StaticRecapOne.totalAmount);
		// TODO call method [addNum()]
		StaticRecapOne.addNum(10, 5);
	}

	// non-static method
	public void statusUpdate() {

		// TODO call [month] variable and assign value = "January"
		StaticRecapOne obj=new StaticRecapOne();
		obj.month="January";

		// TODO call [iLikeJava] variable and assign value = "Java is life"
		StaticRecapOne obj1=new StaticRecapOne();
		obj1.iLikeJava="Java is life";
		// TODO print value of variable [month]
System.out.println(obj.month);
		// TODO print value of variable [iLikeJava]
System.out.println(obj1.iLikeJava);
		// TODO call method [getCountry()]
StaticRecapOne obj2=new StaticRecapOne();
StaticRecapOne getCountry;}



	public static void main(String[] args) {
		
		 getInfo();
		
	}

		// TODO call method [getInfo()]
	}


