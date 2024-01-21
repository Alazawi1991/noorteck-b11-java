package com.noorteck.java.day5;

public class Excercies3 {

	public static void main(String args[]) {
		
		
		int temperature= 15;
		String season="";
		String whatAnIThinking="";
		
		if (temperature<0 || temperature>20) {
			season="winter";
			whatAnIThinking="Too cold can;t wait for summer";
		}
		else if (temperature<21 || temperature>40) {
		
			season="fall";
		whatAnIThinking="Confused recovering from cold";
	}
		
		else if (temperature<41 || temperature>60) {
			
			season="Spring";
		whatAnIThinking="More Confused thinking about winter";
	}
		else if (temperature<61 || temperature>100) {
			
			season="summer";
		whatAnIThinking=" Too hot can't wait for summer";
	}
		else if (temperature<101 || temperature>1000000) {
			
			season="Wrong Data";
		whatAnIThinking="Java & COffee";
	}
		System.out.println(temperature);
		System.out.println(season);
		System.out.println(whatAnIThinking);
}
}