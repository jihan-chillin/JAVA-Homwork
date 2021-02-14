package com.kh.example.practice6.model.vo;

public class Book {
	
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	public Book() {};
	
	
	public Book(String author,int price, double discountRate) {
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
	}
	
	public Book(String title, String publisher, String author, int price, double discountRate) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
	}
	
	public void inform1() {
		System.out.println(author+" "+price+" "+discountRate);
		
	}
	
	public void inform2() {
		System.out.println(title+" "+publisher+" "+author+" "+price+" "+discountRate);
	}

}
