package com.noorteck.java.day33;

public abstract class Vehicle {

	public abstract void drive();

	public abstract void setColor(String color);

	public void year() {
		System.out.println("year 2020");
	}
}
/**
 * 
 * In Java ABSTRACTION achieved through:
 * 
 * > abstract class > interface
 * 
 * How do we create an abstract class? >we need to add abstract keyword after
 * access modifier
 * 
 * If a class is not abstract, then we can call this Regular Class/Concrete
 * Class
 * 
 * Abstract Class
 * 
 * > It is used to achieve abstraction > We can have > abstract method --> A
 * method without a method body > & Concrete Method(non-abstract method)--> A
 * method with method body
 * 
 * > We cannot create an INSTANCE/object of an abstract class because abstract
 * class has an abstract method which does not have method body
 * 
 * Concrete Class:
 * 
 * > CANNOT have an abstract method > Can have concrete method
 * 
 * 
 * 
 * 
 * If a Concrete INHERITS an (ABSTRAC CLASS/INTERFACE) then a Concrete Class
 * made a contract with (ABSTRAC CLASS/INTERFACE). In the contract it states
 * that CONCRETE CLASS MUST provide implementation (MUST OVERRIDE) the ABSTRACT
 * METHODS
 * 
 * 
 * 
 * 
 */