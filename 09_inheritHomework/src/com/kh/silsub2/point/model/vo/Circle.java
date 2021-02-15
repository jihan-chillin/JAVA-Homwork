package com.kh.silsub2.point.model.vo;

public class Circle extends Point{
	
	private int radius;
	double pi = Math.PI;
	
	// �⺻������
	public Circle() {
		// TODO Auto-generated constructor stub
	}

	// �Ű����� ������
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
		
		System.out.printf("���� ���� : %.1f\n", area);
		System.out.printf("���� �ѷ� : %.1f", perimeter);
		
	}
	
	
	
	
	

}
