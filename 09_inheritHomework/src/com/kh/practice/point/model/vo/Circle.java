package com.kh.practice.point.model.vo;

public class Circle extends Point{
	
	private int radius;
	
	// 기본생성자
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	
	
	// 매개변수 생성자
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	
	//getter setter
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public String toString() {
		return "x좌표 : "+getX()+"\ny좌표 : "+ getY()+"원의 반지름 : "+radius;
	}
	
	
	
	
	

}
