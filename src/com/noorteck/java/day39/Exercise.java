package com.noorteck.java.day39;

public class Exercise {

	public static void main(String[] args) {

		// String str = "JavaIsFunAndMoreGifts";
		String str = "Java";
		//String str1 = str.toLowerCase();
		int jcount = 0;
		int acount = 0;
		int vcount = 0;

		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);

			if (c == 'J' || c == 'j') {
				jcount++;
			} else if (c == 'A' || c == 'a') {

				acount++;
			} else if (c == 'V' || c == 'v') {
				vcount++;

			}
		}

		System.out.println("J count :" + jcount);
		System.out.println("A count :" + acount);
		System.out.println("V count :" + vcount);
	}

}

/**
 * come up with a logic witch tell how many each char appears in a aString and
 * ignore the case sensitivity
 */