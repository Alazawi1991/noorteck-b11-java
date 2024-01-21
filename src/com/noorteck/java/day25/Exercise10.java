package com.noorteck.java.day25;

public class Exercise10 {

	public static void main(String[] args) {
		Exercise10 obj = new Exercise10();
		int num[] = { 2, 4, 6, 8 ,-34,999,12,2,12,65,4};

		obj.getMaxMin(num);

	}

	void getMaxMin(int num[]) {

		int max = num[0];
		int min = num[0];
		for (int i = 0; i < num.length; i++) {

			if (num[i] > max) {
				max = num[i];

			} else if (num[i] < min) {

				min = num[i];
			}

		}

		System.out.println("max " + max);
		System.out.println("min " + min);
	}

}
