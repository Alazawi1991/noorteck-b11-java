package com.noorteck.java.day5;

public class Excercies6 {

	public static void main(String args[]) {
		
		
		char group ='a';
		String team1 ="";
		String team2 ="";
		String team3 ="";
		String team4 ="";
		boolean isGroupExist = true ;
		String message="NONE";
		
		if (group=='a') {
			message ="*********** group A ************";
			team1="Netherlands";
			team2="Senegal";
			team3="Ecuador";
			team4="Qater";
			}
		else if (group=='b') {
			
		message ="*********** group B ************";
		team1="England";
		team2="United State";
		team3="Iran";
		team4="Wales";
		}
		else if (group=='c') {
		message ="*********** group c ************";
		team1="Argentina";
		team2="Poland";
		team3="Mexico";
		team4="Saudi Arabia";
}
		
		else if (group=='d') {
			message ="*********** group d ************";
			team1="France";
			team2="Australia";
			team3="Tunisia";
			team4="Denmark";
		}
		else if (group=='e') {
			message ="*********** group e ************";
			team1="Japan";
			team2="Spain";
			team3="Germany";
			team4="Costa Rica";
		}
			else if (group=='f') {
				message ="*********** group f ************";
				team1="Morocco";
				team2="Croatia";
				team3="Belgium";
				team4="Canda";
			
				
				}
			else if (group=='g') {
				message ="*********** group g ************";
				team1="Brazil";
				team2="Switzerland";
				team3="Cameroon";
				team4="Serbia";
			}
			else if (group=='h') {
				message ="*********** group h ************";
				team1="Portugal";
				team2="South Korea";
				team3="Uruguay";
				team4="Ghana";
			
				
				}
			else { isGroupExist=false;
			message=("Group"+group+"is not part of World Cup Table");
			System.out.println("Is group"+group+"Exists+isGroupExist");
			
			}
		System.out.println(message);
		System.out.println(team1);
		System.out.println(team2);
		System.out.println(team3);
		System.out.println(team4);
	}
}
