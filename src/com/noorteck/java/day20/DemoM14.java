package com.noorteck.java.day20;

public class DemoM14 {
	public static void main(String[] args) {
		String s1 = "Javaxyz";
		String s2 = "SundayMonday";
		String s3 = "TodayisFunDayWithJava";
		System.out.println("S1 Length:"+s1.length());
		System.out.println("S2 Length:"+s2.length());
		System.out.println("S3 Length:"+s3.length());
		System.out.println("*****************");
		System.out.println("S1 Character:"+s1.charAt(0));
		System.out.println("S2 Character:"+s2.charAt(0));
		System.out.println("S3 Character:"+s3.charAt(0));
		System.out.println("*****************");
		
		System.out.println("S1 Character:"+s1.charAt(0));
		System.out.println("S2 Character:"+s2.charAt(0));
		System.out.println("S3 Character:"+s3.charAt(0));
		
		int lastCharIndexPositionS4=s1.length()-1;
		int lastCharIndexPositionS5=s2.length()-1;
		int lastCharIndexPositionS6=s3.length()-1;
		System.out.println("S1 Character:"+s1.charAt(lastCharIndexPositionS4));
		System.out.println("S2 Character:"+s2.charAt(lastCharIndexPositionS5));
		System.out.println("S3 Character:"+s3.charAt(lastCharIndexPositionS5));
	}
}
/**
 * 1. YOu need to know how to get the Length of the String
 * 
 * 2. YOu need to know how to get the first character in the String
 * 
 * 3. You need to know how to get the last character in the String
 * 
 * 
 * 
 * String s1 = "Javaxyz";
 * 
 * a. length --> 7 b. J c. z
 * 
 */