package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {
	
	Rectangle r = new Rectangle();
	
	// CalcPerimeter �޼ҵ�
	public String calcArea(int x, int y, int height, int width) {
		// ���� �Ű������� �̿��Ͽ� �ʵ带 �ʱ�ȭ
		
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		
		return "���� : "+r.getX()+","+r.getY()+","+r.getHeight()
		+","+r.getWidth()+" / "+(r.getHeight()*r.getWidth());
	}
	
	public String calcPerimeter (int x, int y , int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		
		return "���� : "+r.getX()+","+r.getY()+","+r.getHeight()
		+","+r.getWidth()+" / "+(2*(r.getHeight()+r.getWidth()));
	}
}	
	


