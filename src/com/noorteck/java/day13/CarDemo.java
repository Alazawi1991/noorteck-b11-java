package com.noorteck.java.day13;

public class CarDemo {
public static void main(String[] args) {
	
	car c1=new car();
	c1.year=2020;
	c1.model="bmw";
	System.out.println(c1.year);
	System.out.println(c1.model);
	c1.setColor("black");
	c1.setPrice(2200.00);
}
}
