package com.noorteck.java.day20;

public class DemoM10 {

	public static void main(String[] args) {
		String s1 = "JavaProgram";
		System.out.println(s1.charAt(1));
		System.out.println(s1.charAt(2));
		System.out.println(s1.charAt(3));
		System.out.println(s1.charAt(4));

		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(-111));
		System.out.println(s1.charAt(1234));

	}

}
/**
 * 
 * 1. What is the methodName?
 * 
 * charAt()
 * 
 * 2. How many Parameters does it?
 * 
 * 1 Param
 * 
 * 3. If it takes parameter, then what are the dataTypes?
 * 
 * int index
 * 
 * 4. What is the return type of the method?
 * 
 * char
 * 
 * 5. What is the purpose of this method? What does it do?
 * 
 * charAt() takes index position as argument then it returns that character
 * 
 * 
 * What if the idnex we are passing does exists is not in the String it will
 * return Exception/ERROR
 * 
 * (IndexOutOfBoundsException)
 * 
 */