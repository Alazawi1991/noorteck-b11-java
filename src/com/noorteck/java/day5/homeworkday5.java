package com.noorteck.java.day5;

public class homeworkday5 {

	public static void main(String args[]) {

		int exam1 = 88, exam2 = 68, exam3 = 92, exam4 = 77, exam5 = 49;

		int examSum = exam1 + exam2 + exam3 + exam4 + exam5;
		
		int examDiff = exam1 - exam2 - exam3 - exam4 - exam5;
		
		double examAvg= examSum/5;
		
		System.out.println("Sum :"+exam1+" + " + exam2+" + " + exam3+" + "  + exam4+" + "  + exam5+"="+examSum);
		System.out.println("Diff:"+exam1+" - " + exam2+" - " + exam3+" - "  + exam4+" - "  + exam5+"="+examDiff);
		System.out.println("Avg :"+exam1+" + " + exam2+" + " + exam3+" + "  + exam4+" + "  + exam5+"/5"+"="+examAvg);
	}

}
