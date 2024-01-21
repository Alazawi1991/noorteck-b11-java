package com.noorteck.java.day12;

public class Exercise5 {

public static void main(String[] args) {
	
	
	boolean r1=positiveNegative(10, 2, false);
	boolean r2=positiveNegative(10, 10, true);
	boolean r3=positiveNegative(10, 10, false);
	boolean r4=positiveNegative(-10, -10, true);
	boolean r5=positiveNegative(-10, 10, false);
	boolean r6=positiveNegative(10, -10, false);
	boolean r7=positiveNegative(-10, 10, true);
	boolean r8=positiveNegative(10, -10, true);
	
	System.out.println(r1);
	System.out.println(r2);
	System.out.println(r3);
	System.out.println(r4);
	System.out.println(r5);
	System.out.println(r6);
	System.out.println(r7);
	System.out.println(r8);
	
}	



public static boolean positiveNegative(int numOne , int numTwo , boolean isSatus) {
	
	boolean result=true;
	
	
	if((numOne<0 && numTwo>0)&& isSatus==false) {
		
		
		
		result=true;
		return result;}
		
		else if ((numOne>0 && numTwo<0) && isSatus==false){
			
			result=true;
			
			return result;}
else if ((numOne<0 && numTwo<0) && isSatus==true){
			
			result=true;
			
			return result;}
			
		
			
			else {
				
				result=false;
				return result;}
			
			
		
	
}
		
		
	
}
	
	

