package com.noorteck.java.day6;

public class DemoSwitchApproach2 {
	
	public static void main(String args[]) {
		
		String day ="Saturday";
		String result="";
		
		switch (day) {
		case "Monday":
		case "Wednesday":
		case"Friday":
		case"sunday":
		
	result ="lecture day";		
		
		break;
		case"Tuesday":
		case"Thursday":
		result="lecture day";
		
		case"Saturday":
		
		result="JavaFunDay";
		break;
		default:
			result="wrong input";
			break;
		}
		
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
	}

}
