package com.noorteck.java.day8;

public class HurricaneForLoopApproch2 {


	public static void main(String args[]) {

		int category =0;
		for (int i = 100; i <= 200; i++) {
			 
			if (i >= 101 && i <= 103) {
				category = 1;
			} else if (i >= 115 && i <= 118) {
				category = 2;
			} else if (i >= 130 && i <= 136) {
				category = 3;
			} else if ( i>= 154 && i<= 155) {
				category = 4;
			} else if(i>=190 && i<=194){
				category = 5;
			}else {
				//TODO You have to add the magic code here...(1 line code)
			continue;
			
			}
			
			System.out.println("Category " + category + ": Windspeed: " + i);
		}
}
}