package com.noorteck.java.day30;

public class DemoOverLoading3 {
	
	public void getInfo(String country,int age,char grade) {
	
		
		System.out.println(country);
		System.out.println(age);
		System.out.println(grade);
		
		
	}
	
public void getInfo(int age,String country,char grade) {
	
		
		System.out.println(country);
		System.out.println(age);
		System.out.println(grade);
		
		
	}
public void getInfo(char grade,int age,String country) {
	
	
	System.out.println(country);
	System.out.println(age);
	System.out.println(grade);
	
	
}
public static void main(String[] args) {
	
	
	DemoOverLoading3 obj= new DemoOverLoading3();
	
	obj.getInfo("usa", 11, 'a');
	obj.getInfo(12, "canda", 'b');
	obj.getInfo('c', 13	, "England");
	
	
	
	
}
	
	
	
	
	
	
}
