package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {
	
	Rectangle r = new Rectangle();
	
	// CalcPerimeter 메소드
	public String calcArea(int x, int y, int height, int width) {
		// 받은 매개변수를 이용하여 필드를 초기화
		
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		
		return "넓이 : "+r.getX()+","+r.getY()+","+r.getHeight()
		+","+r.getWidth()+" / "+(r.getHeight()*r.getWidth());
	}
	
	public String calcPerimeter (int x, int y , int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		
		return "넓이 : "+r.getX()+","+r.getY()+","+r.getHeight()
		+","+r.getWidth()+" / "+(2*(r.getHeight()+r.getWidth()));
	}
}	
	


