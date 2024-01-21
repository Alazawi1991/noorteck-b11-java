package com.noorteck.java.day31;

public class TheSon extends TheDad {

	@Override
	public void password() {

		System.out.println("chnage to : 123abc");

	}

	@Override
	private void bankAccount() {
		
		
		System.out.println("123456 bank");
	}
	@Override
	public static void add(int a  , int b) {
		
		System.out.println(a+b);
		
		
	}
	
}
/**
 * password() is final in parent class we cannot override final method 
 * 
 */