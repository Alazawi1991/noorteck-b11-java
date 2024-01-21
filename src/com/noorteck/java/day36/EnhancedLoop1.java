package com.noorteck.java.day36;

public class EnhancedLoop1 {
	public static void main(String[] args) {

		String State[] = { "VA", "MD", "NY", "AL", "AZ", "TX", "FL", "NY", "MD" };

		for (String s : State) {

			System.out.println(s);

		}
		char gradeArr[] = { 'A', 'B', 'C', 'D', 'F' };

		for (char grade : gradeArr) {
			System.out.println(grade);
		}
		int favNunArr[] = { 1, 2, 3, 44, 11, 22 };

		for (int fav : favNunArr) {

			System.out.println(fav);
		}
		boolean StateArry[] = { true, false, false, true };
		for (boolean State1 : StateArry) {

			System.out.println(State1);
		}
		double priceArry[] = { 11.1, 22.2, 33.3, 44.4, 55.5 };
		for (double price : priceArry) {
			System.out.println(price);
		}
	}
}
/***
 * Enhanced For Loop
 * 
 * > It was introduced in Java 1.5 > Some of the data structures are not INDEX
 * based in Java so we have to use Enhanced for loop > In Collection Framework,
 * we have different type of Data Structure and we will use Enhance for loop to
 * iterate through those collections
 * 
 * > It only loops/iterates FORWARD DIRECTION > It cannot loop/iterate BACKWARD
 * DIRECTION
 * 
 * 
 * Enhanced For Loop Syntax:
 * 
 * for (dataTypeOfArray variableName : arrayName){
 * 
 * body }
 * 
 * 
 * 
 * 
 */