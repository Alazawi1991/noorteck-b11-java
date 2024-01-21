package com.noorteck.java.day30;

public class DemoOverLoading2 {

	
	public void getData(String name , int age) {
		
		System.out.println(name);
		System.out.println(age);
		
		}
	
	public void getData(char gender,double temprature) {
		
		System.out.println(gender);
		System.out.println(temprature);
	}
		public void getData(String country,double temp) {
			
			
			System.out.println(country);
			System.out.println(temp);
		}
		public static void main(String[] args) {
			
			DemoOverLoading2 obj=new DemoOverLoading2();
			
			obj.getData("John",11);
			obj.getData('m', 32);
			obj.getData("usa", 15);
			
		}
		
		
	
	
}
