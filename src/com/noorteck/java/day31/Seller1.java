package com.noorteck.java.day31;

public class Seller1 extends  Supplier{

	@Override
	public void price() {
		int myMackPrice=macbook+400;
		int myIphonePrice=iphone+300;
		System.out.println("Ahmed mackbook price"+myMackPrice);
		System.out.println("AHmed iphone price"+myIphonePrice);
		System.out.println("****************************");
	}
	
}
