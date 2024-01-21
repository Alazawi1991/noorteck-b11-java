package com.noorteck.java.day18;

public class StudentDetail {
	
	
	// instance variable
		private String name;
		private int overAllGrade;
		private int exam1;
		private int exam2;
		private int exam3;
		private int exam4;
		private int exam5;

		public StudentDetail(String name, int overAllGrade, int exam1, int exam2, int exam3, int exam4, int exam5) {

			this.name = name;
			this.overAllGrade = overAllGrade;
			this.exam1 = exam1;
			this.exam2 = exam2;
			this.exam3 = exam3;
			this.exam4 = exam4;
			this.exam5 = exam5;
		}

		public boolean hasPassed() {
			boolean result = false;

			if (overAllGrade >= 60) {
				result = true;
			}

			return result;
		}

		public char getLetterGrade() {
			char result = ' ';

			if (overAllGrade >= 90) {
				result = 'A';
			} else if (overAllGrade >= 80) {
				result = 'B';
			} else if (overAllGrade >= 70) {
				result = 'C';
			} else if (overAllGrade >= 60) {
				result = 'D';
			} else {
				result = 'F';
			}

			return result;
		}

		public int getAverageExam() {
			int result = 0;

			result = (exam1 + exam2 + exam3 + exam4 + exam5) / 5;

			return result;
		}

		public boolean hasFailed() {
			boolean result = false;

			if (exam1 < 60 || exam2 < 60 || exam3 < 60 || exam4 < 60 || exam5 < 60) {
				result = true;
			}
			return result;
		}

		public boolean passedAll() {
			boolean result = false;

			if (exam1 >= 60 && exam2 >= 60 && exam3 >= 60 && exam4 >= 60 && exam5 >= 60) {
				result = true;
			}

			return result;
		}

		public static void main(String[] args) {

			StudentDetail s1 = new StudentDetail("John", 77, 55, 88, 85, 90, 56);
			StudentDetail s2 = new StudentDetail("Tom", 75, 55, 75, 85, 90, 20);
			StudentDetail s3 = new StudentDetail("Pat", 90, 55, 40, 100, 90, 95);

			char c1 = s1.getLetterGrade();
			char c2 = s2.getLetterGrade();
			char c3 = s3.getLetterGrade();

			System.out.println("S1 Grade: " + c1);
			System.out.println("S2 Grade: " + c2);
			System.out.println("S3 Grade: " + c3);

			int a1 = s1.getAverageExam();
			int a2 = s2.getAverageExam();
			int a3 = s3.getAverageExam();

			System.out.println("S1 Avg: " + a1);
			System.out.println("S2 Avg: " + a2);
			System.out.println("S3 Avg: " + a3);

			boolean b1 = s1.hasFailed();
			boolean b2 = s2.hasFailed();
			boolean b3 = s3.hasFailed();

			System.out.println("S1 Failed?: " + b1);
			System.out.println("S2 Failed?: " + b2);
			System.out.println("S3 Failed?: " + b3);

			boolean h1 = s1.hasPassed();
			boolean h2 = s2.hasPassed();
			boolean h3 = s3.hasPassed();

			System.out.println("S1 Passed?: " + h1);
			System.out.println("S2 Passed?: " + h2);
			System.out.println("S3 Passed?: " + h3);
			
			boolean p1 = s1.passedAll();
			boolean p2 = s2.passedAll();
			boolean p3 = s3.passedAll();
			

			System.out.println("S1 PassedAll?: " + p1);
			System.out.println("S2 PassedAll?: " + p2);
			System.out.println("S3 PassedAll?: " + p3);
		}

	}
	

