package com.noorteck.java.day8;

public class DemoContinue {
	public static void main(String args[]) {

		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
			if (i == 18) {
				break;
			}
		}

		System.out.println("**************");
for (int i=1; i<=10; i++) {
	if (i == 5) {
		
		continue;
	}
	System.out.println(i);
}
	}
}

/**
 * 
 * break Keyword ---------------------------- > break keyword used in switch
 * statement at the end of each case > What happens when we use break keyword in
 * switch statement? > it breaks out from switch statment, control goes out from
 * switch
 * 
 * We can also use break keyword in loops as well
 * 
 * whenever it hits break keyword it stops and exits the loop
 * 
 * continue Keyword
 * 
 */
