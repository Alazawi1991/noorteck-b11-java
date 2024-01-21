package com.noorteck.java.day34;

public class Location implements City, Village {

	@Override
	public void population() {
		System.out.println("123");

		
		
		
	}
	public int getInfo(int a, String str) {
		int result=0;
		return result;}
	@Override
	public boolean getInfo(int a, String str) {
	 boolean result=false;
		return false;
	}

}
/**
 * What if both parent interface has exact same abstract method?
 * 
 * Now, does the child class needs to implement both ??
 * 
 * Child class needs to implement only 1 abstract method...
 * 
 * If both parents have exact same method: Same method name, Same return type
 * Same param THen child class needs to provide implementation ONLY for 1 method
 * 
 * -------------------------------
 * 
 * What if the method name, param is SAME but the return type is diff???
 * 
 * > IT WILL NOT WORK, java will give an ERROR
 * 
 * 
 * 
 */