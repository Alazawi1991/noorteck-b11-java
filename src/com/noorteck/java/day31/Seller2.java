package com.noorteck.java.day31;

public class Seller2 extends  Supplier{

	@Override
	public void price() {
		int myMackPrice=macbook+500;
		int myIphonePrice=iphone+500;
		System.out.println("Cindy mackbook price"+myMackPrice);
		System.out.println("Cindy iphone price"+myIphonePrice);
		System.out.println("****************************");
	}
	
}
