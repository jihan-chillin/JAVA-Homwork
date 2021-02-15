package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {
	
	Circle c = new Circle();
	private double pi = Math.PI;
	
	// calcArea 메소드
	
	public String calcArea(int x, int y, int radius) {
		// 받은 매개변수를 이용하여 필드를 초기화
		
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		return "넓이 : "+c.getX()+","+c.getY()+","+c.getRadius()
		+" / "+(Math.PI*c.getRadius()*c.getRadius());
	}
	
	public String calcCircum (int x, int y , int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		return "둘레 : "+c.getX()+","+c.getY()+","+c.getRadius()
		+" / "+(2*Math.PI*c.getRadius());
	}
	
	

}
