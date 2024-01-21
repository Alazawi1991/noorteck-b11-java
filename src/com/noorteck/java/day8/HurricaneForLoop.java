package com.noorteck.java.day8;

public class HurricaneForLoop {
	
	public static void main(String args[]) {
		
		/*for (int i=100; i<=200;i++) {
			switch (i) {
			case 101-103:
				System.out.println("catagory1"+"windspeed: "+i);
			break;
			
			case 115-118:
				
			System.out.println("catagory2"+"windspeed: "+i);
			break;

			case 130-136:
				
			System.out.println("catagory3"+"windspeed: "+i);
			break;

			case 154-155:
				
			System.out.println("catagory4"+"windspeed: "+i);
			break;

			case 190-194:
				
			System.out.println("catagory5"+"windspeed: "+i);
			break;

			
			default:
				
				break;
			}
			}**/
			
			
			for (int i=100; i<=200; i++) {
				if (i>=100 && i<=103) {
					System.out.println("catagory1"+"windspeed: "+i);
				}
				else if (i>=115 && i<=118) {
					System.out.println("catagory2"+"windspeed: "+i);
				}
				else if (i>=130 && i<=136) {
					System.out.println("catagory3"+"windspeed: "+i);
				}
				else if (i>=154 && i<=155) {
					System.out.println("catagory4"+"windspeed: "+i);
				}
				else if (i>=190 && i<=194) {
					System.out.println("catagory5"+"windspeed: "+i);}
				
	
			
			}
	}
}