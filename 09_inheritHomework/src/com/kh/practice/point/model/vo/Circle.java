package com.kh.practice.point.model.vo;

public class Circle extends Point{
	
	private int radius;
	
	// �⺻������
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	
	
	// �Ű����� ������
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
		return "x��ǥ : "+getX()+"\ny��ǥ : "+ getY()+"���� ������ : "+radius;
	}
	
	
	
	
	

}
