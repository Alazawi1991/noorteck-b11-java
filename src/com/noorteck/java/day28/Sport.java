package com.noorteck.java.day28;

public class Sport {

	public int age;
	int count;
	protected boolean isStatus;

	private String password;

}
/**
if the access modifier is private for variable & method
	then CHILD will not have access to the private members


Access Modifier:

	1. public:  accessible from same package &  different package
	2. private: accessible from same class, 
				but cannot access outside the class 
					(does not matter if it is in same package or diff package) 
	3. default:  Accessible form same package, but cannot access from diff package
	4. protected: Accessible from same package, but cannot access form diff package
						BUT there is a way, we can access if we have IS-A Relationship between class 
	5.  

*/