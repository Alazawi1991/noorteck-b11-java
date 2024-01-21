package com.noorteck.java.day14;

public class DepartmentDemo {
public static void main(String[] args) {
	Deparment obj1 = new Deparment();
	
	
	
	System.out.println(obj1.num);
	System.out.println(obj1.favNum);
	System.out.println(obj1.age);
	System.out.println(obj1.accountNum);
	System.out.println(obj1.price);
	System.out.println(obj1.temp);
	System.out.println(obj1.isJavaFun);
	System.out.println(obj1.gender);
	System.out.println(obj1.name);
	/***

	DataType:		DefaultValue:
-------------------------------------

	byte			--> 0
	short			--> 0
	int				--> 0
	long			--> 0
	double			--> 0.0
	float			--> 0.0
	boolean			--> false
	char			--> ' ' (Empty Space/White Space/Blank
	String			--> null




*/
	
	
	System.out.println("***************");
Deparment obj2 = new Deparment();
	
	
	
	System.out.println(obj2.num);
	System.out.println(obj2.favNum);
	System.out.println(obj2.age);
	System.out.println(obj2.accountNum);
	System.out.println(obj2.price);
	System.out.println(obj2.temp);
	System.out.println(obj2.isJavaFun);
	System.out.println(obj2.gender);
	System.out.println(obj2.name);
	//local variable
	/**
	 * Since local variable does not have a default value
	 *  We MUST MUST MUST initialize FIRST then we can use 
	 *  that variable, 
	 *  
	 *  If we do not initialize and try to use the local variable
	 *  then JAVA will complain
	 * 
	 */
	System.out.println("***************");
	int myAge=1;
	System.out.println(myAge);
	int a=2;
	int b=3;
	int result=a+b;
	/**
	 * in this example we cannot use a or b because
	 * 	variable a and variable b is local variable
	 * and we didnot initialize so we cannot use
	 */
}	
}