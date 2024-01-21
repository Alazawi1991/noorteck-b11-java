package com.halloween2;

public class TheDad extends TheGrandpa{//s was missing 

	private int age;

	public void  setAge(int age) {
		
		this.age = age;//missing this
		}
	
	public int getAge() {
		return age;//this should return a value 
	}

	public void randomNum() {
		   int [] numbers  = {1,43,65,8,67,23,98,12 ,12,45,7,0,99, 34,11,54};// wrong declration
		
	
		
		for(int i =0; i < numbers.length; i++) {// wrong sentex
			
			System.out.println(numbers[i]);//wrong sentyx
		}	
	}
		public int favNumWho(int a) {
				int result=0;
				result = a;
				return result;
			}
	}

