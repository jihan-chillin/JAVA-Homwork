package com.kh.practice.point.model.vo;

public class Rectangle extends Point {
	private int width;
	private int height;
	
	
	// �⺻������
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}


	// �Ű����� ������
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
		return "x��ǥ : "+getX()+"\ny��ǥ : "+ getY()
		+"\n�簢���� �ʺ� : "+width+"\n�簢���� ���� : "+height;
	}

}
