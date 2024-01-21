package com.noorteck.java.day26;

public class InterViewQuestion {

	public static void main(String[] args) {
		
		
		
		String str="Jackie,Zain,Ellen,Alishan,Vladimir,Ahmed";
		String[] name=str.split(",");
		
		for (int i=name.length-1;i>=0;i--) {
			
			System.out.println(name[i]);
			
			
		}
		
	}
	
	
	
}
