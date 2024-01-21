package com.noorteck.java.day9;

public class Exercise1 {

	public static void main(String[] args) {
		int temperature=51;
		String howIsWeather="";
		String howShouldIDrive="";
		String message="";
		boolean isStatus=true;
		
		
		if (temperature <=30) {
			howIsWeather="freezing";
			
			
			}
		else if (temperature <=50) {
			howIsWeather="cold";}
		
			else if 	(temperature <=90 ) {
				howIsWeather="hot";
				
			}
				else  {
					howIsWeather="error";
					message="value Read Requirement Out loud";
					isStatus=false;
				
				}
		
		if (howIsWeather != "ERROR") {

			switch (howIsWeather) {
			case "FREEZING":
				howShouldIDrive = "Don't drive";
				break;
			case "COLD":
				howShouldIDrive = "Drive with Heater On";
				break;
			case "HOT":
				howShouldIDrive = "Drive with AC On";
				break;
			}

		} else {
			isStatus = false;
		}

		if (isStatus == false) {
			System.out.println("What is the Temperature: " + temperature);
			System.out.println("How is the Weather: " + howIsWeather);
			System.out.println("What is the Message: " + message);
			System.out.println("What is the Status: " + isStatus);
		} else {

			System.out.println("What is the Temperature: " + temperature);
			System.out.println("How is the Weather: " + howIsWeather);
			System.out.println("How should I drive: " + howShouldIDrive);
		
		
		
	
	}
}
}
