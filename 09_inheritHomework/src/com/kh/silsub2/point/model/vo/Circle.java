package com.kh.silsub2.point.model.vo;

public class Circle extends Point{
	
	private int radius;
	double pi = Math.PI;
	
	// 기본생성자
	public Circle() {
		// TODO Auto-generated constructor stub
	}

	// 매개변수 생성자
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	// getter setter
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void draw() {
		double area = pi*radius*radius;
		double perimeter = 2*pi*radius;
		
		System.out.printf("원의 면적 : %.1f\n", area);
		System.out.printf("원의 둘레 : %.1f", perimeter);
		
	}
	
	
	
	
	

}
