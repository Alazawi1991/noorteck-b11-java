package com.noorteck.java.day17;

public class Book {
	String title;
	String author;
	int PageNum;
	String isbn;
	int publishyear;

	public Book() {
		title = "ahmed";
		PageNum = 11;
		publishyear = 1991;
		isbn = "Book";
		author = "alwahab";

	}

	public static void main(String[] args) {

		Book s1 = new Book();

		System.out.println(s1.title);
		System.out.println(s1.author);
		System.out.println(s1.PageNum);
		System.out.println(s1.isbn);
		System.out.println(s1.publishyear);

	}
}
