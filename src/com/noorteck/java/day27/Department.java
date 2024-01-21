package com.noorteck.java.day27;

public class Department {

	private String departmentName;

	private int numOfEmp;

	public void setDepartment(String department) {

		this.departmentName = department;
	}

	public String getDepartment() {
		return departmentName;

	}
public void setNumOfEmp(int numOfEmp) {
	
	this.numOfEmp=numOfEmp;
	}

public int getNumOfEmp() {
	
	return numOfEmp;
}
	
	
}

/**
this keyword is used to refer to the instance variable

	used when we our parameter/local variable name SAME 
	as the instance variable name then to differentiate 
	between them we will use this.InstanceVariableName 

*/