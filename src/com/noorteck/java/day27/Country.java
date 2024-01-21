package com.noorteck.java.day27;

public class Country {
	private String name;
	private int numOfStates;

	public Country(String name, int numOfState) {
		this.name = name;
		this.numOfStates = numOfState;
	}

	public void setName(String name) {

		this.name = name;
	}

	public String getName() {

		return name;
	}

	public void setnumOfState(int numOfStates) {

		this.numOfStates = numOfStates;

	}

	public int getNumOfState() {

		return numOfStates;
	}

}
