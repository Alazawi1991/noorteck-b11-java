package com.noorteck.java.day19;

public class DemoS2 {
	
	public static void main(String[] args) {
		
	
	String S1 = "yesBreak";
	String S2="yesBreak";

	if(S1==S2)
	{

		System.out.println("1.Equals");

	}else
	{
		System.out.println("2.Not Equals");
	}

	String S3 = new String("NoBreak");
	String S4 = new String("NoBreak");

	if(S3==S4)
	{

		System.out.println("1.Equals");

	}else
	{
		System.out.println("2.Not Equals");
	}
}
}
