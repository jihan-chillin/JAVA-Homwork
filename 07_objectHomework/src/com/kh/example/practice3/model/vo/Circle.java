package com.kh.example.practice3.model.vo;

public class Circle {
	
	private double pi = 3.14;
	private int radius =1;
	
	// �⺻������
	public Circle() {
		// TODO Auto-generated constructor stub
	}

	// �Ű����� ������
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
	
	// �������� 1���� �� �ٽ� ���� �ѷ� & ���̰� ��� 
	public void incrementRadius() {
		radius++;
		System.out.println("\n �� �������� 1 ���� ��Ų ���� ���� �ѷ� & ���� ����");
		getAreaOfCircle();
		getSizeOfCircle();
	}
	
	// ���� ���� ���ϴ� �޼ҵ�
	public void getAreaOfCircle() {
		
		double area = radius*radius*pi;
		System.out.println("���� ���� : "+area);
	}
	
	// ���� �ѷ� ���ϴ� �޼ҵ�
	public void getSizeOfCircle() {
		
		double size = 2*pi*radius;
		System.out.println("���� �ѷ� : "+size);
	}

}
