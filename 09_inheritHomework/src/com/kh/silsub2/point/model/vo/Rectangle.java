package com.kh.silsub2.point.model.vo;

public class Rectangle extends Point{
	
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

	
	// getter setter
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
	
	public void draw() {
		
		int area = width*height;
		int perimeter = 2*(width+height);
		
		System.out.printf("�簢���� ���� : %d\n", area);
		System.out.printf("�簢���� �ѷ� : %d", perimeter);
		
	}
	
	
	
	
	

}
