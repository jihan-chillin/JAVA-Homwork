package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {
	
	Circle c = new Circle();
	private double pi = Math.PI;
	
	// calcArea �޼ҵ�
	
	public String calcArea(int x, int y, int radius) {
		// ���� �Ű������� �̿��Ͽ� �ʵ带 �ʱ�ȭ
		
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		return "���� : "+c.getX()+","+c.getY()+","+c.getRadius()
		+" / "+(Math.PI*c.getRadius()*c.getRadius());
	}
	
	public String calcCircum (int x, int y , int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		return "�ѷ� : "+c.getX()+","+c.getY()+","+c.getRadius()
		+" / "+(2*Math.PI*c.getRadius());
	}
	
	

}
