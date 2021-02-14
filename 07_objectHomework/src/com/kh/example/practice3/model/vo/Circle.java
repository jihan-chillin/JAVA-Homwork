package com.kh.example.practice3.model.vo;

public class Circle {
	
	private double pi = 3.14;
	private int radius =1;
	
	// 기본생성자
	public Circle() {
		// TODO Auto-generated constructor stub
	}

	// 매개변수 생성자
	public Circle(double pi, int radius) {
		super();
		this.pi = pi;
		this.radius = radius;
	}

	// getter setter
	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	// 반지름을 1증가 후 다시 원의 둘레 & 넓이값 출력 
	public void incrementRadius() {
		radius++;
		System.out.println("\n ▽ 반지름을 1 증가 시킨 후의 원의 둘레 & 원의 넓이");
		getAreaOfCircle();
		getSizeOfCircle();
	}
	
	// 원의 넓이 구하는 메소드
	public void getAreaOfCircle() {
		
		double area = radius*radius*pi;
		System.out.println("원의 넓이 : "+area);
	}
	
	// 원의 둘레 구하는 메소드
	public void getSizeOfCircle() {
		
		double size = 2*pi*radius;
		System.out.println("원의 둘레 : "+size);
	}

}
