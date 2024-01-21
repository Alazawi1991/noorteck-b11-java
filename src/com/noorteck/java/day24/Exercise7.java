package com.noorteck.java.day24;

public class Exercise7 {
	public static void main(String[] args) {

		int n1[] = { 6, 1, 2, 3 };
		int n2[] = { 13, 3 };
		int n3[] = { 0, 1, 4 };
		int n4[] = { 6 };
		Exercise7 obj=new Exercise7();
		int[] r1=obj.getDouble(n1);
		int[] r2=obj.getDouble(n2);
		int[] r3 = obj.getDouble(n3);
		int[] r4 = obj.getDouble(n4);
		
		obj.printArry(r1);
		obj.printArry(r2);
		obj.printArry(r3);
		obj.printArry(r4);
		
	}
void printArry(int num[]) {
	System.out.println("**********");
	for (int i=0;i<num.length;i++)
	
		System.out.println(num[i]);
}
	private int [] getDouble(int number[]) {
	
	int result []=new int [number.length*2];
result[result.length-1]=number[number.length-1];	
	return result ;
	}
	
}
