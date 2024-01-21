package com.noorteck.java.day37;

import java.util.Stack;

public class DemoStack {

	public static void main(String[] args) {

		Stack<String> bookStack = new Stack<String>();

		bookStack.push("Java");
		bookStack.push("Selenium");
		bookStack.push("SQL");
		bookStack.push("API");
		System.out.println(bookStack.peek());
		System.out.println(bookStack.peek());

		System.out.println(bookStack.peek());

		System.out.println("*************");

		System.out.println(bookStack.pop());
		System.out.println(bookStack.pop());
		System.out.println(bookStack.peek());
	}

}
/***
 * Stack Class
 * 
 * > Inherits Vector Class > based on Last In First Out(LIFO) data structure
 * 
 * 
 * 
 * push() --> adds elements on top of stack
 * 
 * pop() --> returns & removes the element from the top of the stack
 * 
 * 
 * peek() --> returns the element on top of the stack but does not remove
 * the element
 * 
 * 
 */
