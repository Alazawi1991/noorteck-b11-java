package com.noorteck.java.day21;

public class DemoSb5 {
	public static void main(String[] args) {

		StringBuilder sBuilder = new StringBuilder("JavaWorld");

		sBuilder.delete(2, 5);
		System.out.println(sBuilder);

		StringBuffer sBuffer = new StringBuffer("JavaWorld");
		sBuffer.delete(2, 5);
		System.out.println(sBuffer);

	}

}
/**
 * delete()
 * 
 * takes 2 parameters Parameter1: int startIndexPosition Parameter2: int
 * endIndexPosition
 * 
 * It deletes from startIndexPosition (param1) upto endIndexPosition -1 (param2)
 * 
 * 
 * 
 * 
 */