package com.noorteck.java.day33;

public class RulesForAbstractDemo {

	public abstract final void add();// expected error

	private abstract void divide();// expected error
	
	
	public abstract static multiplay();//expected error

}
/**
	abstract class has a rule for the concrete method
		
		> concrete method MUST override the abstract method
		
		
		abstract method --> must be overridden by the concrete class
		
		final method --> prevents method overriding 
		
		private method --> cannot be overridden & not visible outside the class
		
		static method --> cannot be overridden 
		
		
		
	We CANNOT make the variable an ABSTRACT
	
		> Local variable CANNOT be abstract 
		> Instance variable CANNOT be abstract
		> Static variable CANNOT be abstract
		
		
		Class can be abstract
		Method can be abstract
		variable cannot be abstract
		
*/