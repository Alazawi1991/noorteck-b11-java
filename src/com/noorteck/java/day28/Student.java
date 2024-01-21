package com.noorteck.java.day28;

public class Student extends Person {

	private int id;

	private String major;

	public void setid(int id) {

		this.id = id;
	}

	public int getid() {
		return id;
	}

	public void setmajor(String major) {
		this.major = major;
	}

	public String getmajor() {
		return major;
	}
}
