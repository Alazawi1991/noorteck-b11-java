package com.noorteck.java.day32;

public class DemoLaptop {
	public static void main(String[] args) {

		Laptop obj = new Lenova();

		obj.price();
		obj.price();
		// obj.setColor();

		System.out.println(obj.age);
		System.out.println(obj.Country);
		// System.out.println(obj.City);
		// System.out.println(obj.gender);
		Lenova l = new Lenova();
		l.price();
		l.ram();
		l.setColor();
		System.out.println(l.age);
		System.out.println(l.Country);
		System.out.println(l.City);
		System.out.println(l.gender);

	}

}
/**
 * When a Parent REference pointing to Child class object
 * 
 * it will have access to all the methods that child class inherited from parent
 * class Child class overrode methods from parent class
 * 
 * 
 * When a PARENT REFRENCE pointing to CHILD Class object
 * 
 * it will NOT have access to the following:
 * 
 * If a method was not inherited && the method is created inside the child class
 * then PARENT reference will not ACCCESS
 * 
 * 
 * If a variable is declared inside the PARENT Class then PARENT reference that
 * is pointing to the CHILD CLASS object will have access to those variables
 * 
 * 
 * If a variable is DECLARED inside the CHILD CLASS then PARENT reference that
 * is pointing to the CHILD CLASS object WILL NOT have access to those variables
 * 
 * 
 * 
 * When a CHILD REFERENCE pointing to CHILD CLASS OBJECT
 * 
 * It will have access to following:
 * 
 * > Any methods that child class inherited from parent > Any methods that child
 * class overrode from parent > Any method that child class created inside child
 * class > ANy variables that was declared inside parent class > any variables
 * that was declared inisde child class
 * 
 * PRETTY muCH everythign.. anything that is coming parent & created in child
 * class... 
 * 
 * 
 * 
 */