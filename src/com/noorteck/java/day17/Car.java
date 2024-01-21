package com.noorteck.java.day17;

public class Car {

	String name;
	int year;

	public Car(String modelName , int modelYear) {

		name = modelName;
		year = modelYear;
	}

	public void display() {
		System.out.println("model :" + name);
		System.out.println("Year :" + year);
		
	}
	
	
	public static void main(String[] args) {
		Car obj1= new Car("Toyota",2020);
		Car obj2=new Car("Honda",2010);
		
		obj1.display();
		System.out.println("*************");
		obj2.display();
		
		
	}

}
