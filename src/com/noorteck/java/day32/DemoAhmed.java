package com.noorteck.java.day32;

public class DemoAhmed {
	public static void main(String[] args) {
		
	
	Ahmed obj;
	System.out.println("************From Ahmed Class**********");
	
	
	obj=new Ahmed();
	obj.speakMode();
	obj.behaveMode();
	obj.topicToTalkList();
	System.out.println("*********************From AStudent**************** ");
	
	obj=new AStudent();
	obj.speakMode();
	obj.behaveMode();
	obj.topicToTalkList();
	System.out.println("*********************From AChild******* ");
	obj=new AChild();
	obj.speakMode();
	obj.behaveMode();
	obj.topicToTalkList();
	System.out.println("*********************From Afreind********************* ");
	obj=new AFriend();
	obj.speakMode();
	obj.behaveMode();
	obj.topicToTalkList();
	System.out.println("*********************From AStudent***************** ");
	obj=new ARealMadridFan();
	obj.speakMode();
	obj.behaveMode();
	obj.topicToTalkList();
	System.out.println("*********************From ARealMadridFan ");
	
	
	
	
	}
}
