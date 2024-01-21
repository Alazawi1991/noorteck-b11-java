package com.noorteck.java.day12;

public class Exercise1 {
	
	public static void main(String[] args) {
		boolean r1=sleepin(true,false);
		boolean r2=sleepin(true,true);
	    boolean r3=sleepin(false,true);
		boolean r4=sleepin(false,false);
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		
		
		System.out.println("*******************");
		boolean r5=sleepIn2(true,false);
		
		System.out.println(r5);
		
		
	}
	
	
	public static boolean sleepin(boolean isWeekDay, boolean isVacation) {
		boolean result=false;
		
		if(!isWeekDay ||  isVacation==true) {
		
		result=true;}
		
		else {
			result=false;
		}
		
		return result;
		}
	public static boolean sleepIn2(boolean isWeekDay, boolean isVacation) {
	return(!isWeekDay ||  isVacation==true);}
}
