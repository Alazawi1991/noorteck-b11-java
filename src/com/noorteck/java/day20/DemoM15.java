package com.noorteck.java.day20;

public class DemoM15 {
	public static void main(String[] args) {
		String s1 = "javaProgram";
		System.out.println(s1.substring(1));
		System.out.println(s1.substring(4));
		System.out.println(s1.substring(7));
		System.out.println(s1.substring(9));
		//System.out.println(s1.substring(1111));// error
		
		
		System.out.println("****************");
		System.out.println(s1.substring(1, 5));
		System.out.println(s1.substring(3, 8));
	}
}
/**
 * String s1 = "JavaProgram";
 * 
 * J = 0 a = 1 v = 2 a = 3 P = 4 r = 5 o = 6 g = 7 r = 8 a = 9 m = 10
 * 
 * 
 */
/**

1. What is the methodName?

	substring()
	
2. How many Parameters does it? 

	1 Param

3. If it takes parameter, then what are the dataTypes?
	
	int

4. What is the return type of the method?

	String

5. What is the purpose of this method? What does it do?

	substring() method returns new string from given index position
	
	if index position does not exists then it will thrown an EXCEPTION(ERROR)

*/



/**

1. What is the methodName?

	substring()
	
2. How many Parameters does it? 

	 2 Param

3. If it takes parameter, then what are the dataTypes?
	
	int startIndex, int endIndex

4. What is the return type of the method?

	String

5. What is the purpose of this method? What does it do?

	substring() method returns new string from given startIndex position
	upto endIndexPosition -1
	
	if index position does not exists then it will thrown an EXCEPTION(ERROR)

*/