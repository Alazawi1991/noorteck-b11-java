package com.noorteck.java.day5;

public class Excercies7 {

	public static void main(String args[]) {
		
	
	
	
	String brand="Nike";
	String slogan="";
	boolean isSloganFound=true;
	
	if (brand=="Nike") {
		slogan="Just DO it";	
		
	}
		else if (brand=="Adidas’s") {
			slogan="is Impossible is Nothing";
		
		}
		else if (brand=="Puma") {
			slogan="is Forever Faster";
		
		}
		else if (brand=="=Rebook") {
			slogan="I am what i am.";
		
		}
		else if (brand=="Not Found") {
			
			isSloganFound=false;
			}
		
	
	
	
		if (isSloganFound==true) {
			System.out.println(brand+"'s slogan is "+slogan);
		}
			
			
		else {
			System.out.println(brand+"'s slogan is"+slogan +"This message supposes to give me hard time...");
		}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
