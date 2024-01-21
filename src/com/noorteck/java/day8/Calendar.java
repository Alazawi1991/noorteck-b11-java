package com.noorteck.java.day8;

public class Calendar {

	
	
	public static void main(String args[]) {
		
	String amorpm="none";
	int resethouer=0;
		for (int houer=1; houer <=12; houer++) {
			
			if(resethouer==0) {
				amorpm="AM";
			}
			else 
				amorpm="pm";
		
		System.out.println(houer+ amorpm);
	
	if (houer==12) {
		houer=0;
		resethouer++;
	}
	if (resethouer==2){
		break;
	}
	}
			}
	
	}

