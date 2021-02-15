package com.kh.practice.point.model.vo;

public class Point {
	private int x;
	private int y;
	
	// 기본생성자
	public Point() {
		// TODO Auto-generated constructor stub
	}
	
	//매개변수
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// getter & setter
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	


}
