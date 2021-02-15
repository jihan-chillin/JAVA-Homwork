package com.kh.practice.point.model.vo;

public class Rectangle extends Point {
	private int width;
	private int height;
	
	
	// 기본생성자
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}


	// 매개변수 생성자
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	
	
	// getter & setter
	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}
	
	// toString 
	public String toString() {
		return "x좌표 : "+getX()+"\ny좌표 : "+ getY()
		+"\n사각형의 너비 : "+width+"\n사각형의 높이 : "+height;
	}

}
