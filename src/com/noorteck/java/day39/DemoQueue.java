package com.noorteck.java.day39;

import java.util.LinkedList;
import java.util.Queue;

public class DemoQueue {

	public static void main(String[] args) {

		Queue<String> lane = new LinkedList<String>();

		lane.offer("Jackie");
		lane.offer("Ellen");
		lane.offer("Brian");
		lane.offer("Noor");
		lane.offer("Babur");
		System.out.println(lane);
		System.out.println(lane.peek());

		System.out.println(lane.peek());
		System.out.println(lane.peek());
		System.out.println(lane.peek());
		lane.poll();
		lane.poll();
		lane.poll();
		System.out.println(lane.peek());

	}

}


/**
	
	1.  add/insert element to the queue
		
		a. add()	--> throws Exception	
		b. offer()	--> will not throw an exception, instead return false
	
	
	2. check the head of the queue
		
		a. element()	--> throws Exception if queue is empty
		b. peek()		--> will not throw an exception if queue is empty, instead return null
	
	
	3. remove the head of the queue

		a. remove()		--> throws Exception if there is no head element
		b. pool()		--> will not throw an exception  if there is no head element, instead return null

 */
