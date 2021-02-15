package com.kh.practice.point.view;

import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu {
	
	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();
	
	// 기능제공용이기 때문에 기본생성자 만들 필요 없음.
	
	// 메인메뉴
	public void mainMenu() {
		
		while(true) { // 1, 2번 이외의 것들을 false로 인지해서 종료
			
		System.out.println("==== 메뉴 ====");
		System.out.println("1. 원 ");
		System.out.println("2. 사각형메뉴");
		System.out.println("9. 종료");
		System.out.println("입력 : ");
		int cho = sc.nextInt();
		switch(cho) {
		case 1: CircleMenu(); break;
		case 2: RectangleMenu(); break;
		default : System.out.println("프로그램을 종료합니다.");
		}
	
		}
	}
			
				
	// 원메뉴
	public void CircleMenu() {

		while(true) {
			System.out.println("===== 원 메뉴 =====");
			System.out.println("1. 원 둘레");
			System.out.println("2. 월 넓이");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int cho = sc.nextInt();
			switch(cho) {
			case 1: calcCircum(); break;
			case 2: RectArea(); break;
			default : return;
			}
	
		}
		
	}
	
	// 사각형메뉴
	public void RectangleMenu() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("===== 사각형 메뉴 =====");
			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사각형 넓이");
			System.out.println("9. 메인으로");
			int cho = sc.nextInt();
			switch(cho) {
			case 1: RectPerimeter(); break;
			case 2: RectArea(); break;
			
			default : return;
			}
	
		}
	}
	
	// Circum메소드
	public void calcCircum() {
		System.out.println("x좌표 : ");
		int x = sc.nextInt();
		System.out.println("y좌표 : ");
		int y = sc.nextInt();
		System.out.println("반지름 : ");
		int radius = sc.nextInt();
		System.out.println(cc.calcArea(x, y, radius));
	}
	
	// CircleArea메소드
	public void CircleArea() {
		System.out.println("x좌표 : ");
		int x = sc.nextInt();
		System.out.println("y좌표 : ");
		int y = sc.nextInt();
		System.out.println("반지름 : ");
		int radius = sc.nextInt();
		System.out.println(cc.calcArea(x, y, radius));
	}
	
	//Perimeter 메소드
	public void RectPerimeter() {
		System.out.println("x좌표 : ");
		int x = sc.nextInt();
		System.out.println("y좌표 : ");
		int y = sc.nextInt();
		System.out.println("너비 : ");
		int height = sc.nextInt();
		System.out.println("너비 : ");
		int width = sc.nextInt();
		System.out.println(rc.calcPerimeter(x, y, height, width));
	}
	
	// RectArea메소드
	public void RectArea() {
		System.out.println("x좌표 : ");
		int x = sc.nextInt();
		System.out.println("y좌표 : ");
		int y = sc.nextInt();
		System.out.println("너비 : ");
		int height = sc.nextInt();
		System.out.println("너비 : ");
		int width = sc.nextInt();
		System.out.println(rc.calcArea(x, y, height, width));
	}

}
