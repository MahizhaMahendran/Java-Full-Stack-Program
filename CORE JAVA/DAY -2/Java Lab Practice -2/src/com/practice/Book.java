package com.practice;

public class Book {
	String title;
	String author;
	String isbn;     
	Book(String title, String author, String isbn){
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}
	void display() {
		System.out.println("Title : " + title);
		System.out.println("Author : " + author);
		System.out.println("ISBN : " + isbn);
		
	}

	public static void main(String[] args) {
		Book book = new Book("ACCIDENTS DO NOT HAPPEN", "Dr Sankar Rajeev", "978-81-933904-8-1");
		book.display();
		
	}
	
}
