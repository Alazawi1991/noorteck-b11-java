package com.halloween2;

public class TheGrandpa {// must be public otherwise we can't access it

	private String country;

	private String city;

	public void setCountry(String country){// remove ; and String fix
	
		this.country = country;
	
	}

	public String getCountry() {
		return country;
	}

	protected void setCity(String city)// ; was wrong
	{
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void display(int a,int b) {

		System.out.println("Country: " + country);
		System.out.println("City: " + city);
		addNum(11, 4);
	}

	public int addNum(int a, int b) {

		int result;// must be int

		result = a + b;

		return result;
	}

}
