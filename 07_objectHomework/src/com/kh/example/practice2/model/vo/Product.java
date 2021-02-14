package com.kh.example.practice2.model.vo;

public class Product {
	private String pName;
	private int price;
	private String brand;
	
	// 기본생성자
	public Product() {
		// TODO Auto-generated constructor stub
	}

	// 매개변수 생성자
	public Product(String pName, int price, String brand) {
		super();
		this.pName = pName;
		this.price = price;
		this.brand = brand;
	}

	// getter & setter
	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void information() {
		System.out.println("상품 이름 : "+pName
				+"\n상품 가격 : "+price
				+"\n상품 브랜드 : "+brand);
	}
	
	
	
	
	

}
