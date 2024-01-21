package com.noorteck.java.day25;

public class InterViewQuastion {
	public static void main(String[] args) {
		
		InterViewQuastion obj=new InterViewQuastion();
		
		
		boolean r1=obj.isPalindrome("");
		boolean r2=obj.isPalindrome("");
		boolean r3=obj.isPalindrome("");
		boolean r4=obj.isPalindrome("");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		
		
		protected boolean isPalindrome(String str) {
			boolean result=false;
			
			String reverse='';
			
			for (int i=str.length()-1;i>0;i--) {
				
				
				char c=str.charAt(i);
				reverse=reverse+c;
				
				
			}
		}
	}
	

}
