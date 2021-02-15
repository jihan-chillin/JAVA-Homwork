package com.kh.practice.point.view;

import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu {
	
	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();
	
	// ����������̱� ������ �⺻������ ���� �ʿ� ����.
	
	// ���θ޴�
	public void mainMenu() {
		
		while(true) { // 1, 2�� �̿��� �͵��� false�� �����ؼ� ����
			
		System.out.println("==== �޴� ====");
		System.out.println("1. �� ");
		System.out.println("2. �簢���޴�");
		System.out.println("9. ����");
		System.out.println("�Է� : ");
		int cho = sc.nextInt();
		switch(cho) {
		case 1: CircleMenu(); break;
		case 2: RectangleMenu(); break;
		default : System.out.println("���α׷��� �����մϴ�.");
		}
	
		}
	}
			
				
	// ���޴�
	public void CircleMenu() {

		while(true) {
			System.out.println("===== �� �޴� =====");
			System.out.println("1. �� �ѷ�");
			System.out.println("2. �� ����");
			System.out.println("9. ������");
			System.out.print("�޴� ��ȣ : ");
			int cho = sc.nextInt();
			switch(cho) {
			case 1: calcCircum(); break;
			case 2: RectArea(); break;
			default : return;
			}
	
		}
		
	}
	
	// �簢���޴�
	public void RectangleMenu() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("===== �簢�� �޴� =====");
			System.out.println("1. �簢�� �ѷ�");
			System.out.println("2. �簢�� ����");
			System.out.println("9. ��������");
			int cho = sc.nextInt();
			switch(cho) {
			case 1: RectPerimeter(); break;
			case 2: RectArea(); break;
			
			default : return;
			}
	
		}
	}
	
	// Circum�޼ҵ�
	public void calcCircum() {
		System.out.println("x��ǥ : ");
		int x = sc.nextInt();
		System.out.println("y��ǥ : ");
		int y = sc.nextInt();
		System.out.println("������ : ");
		int radius = sc.nextInt();
		System.out.println(cc.calcArea(x, y, radius));
	}
	
	// CircleArea�޼ҵ�
	public void CircleArea() {
		System.out.println("x��ǥ : ");
		int x = sc.nextInt();
		System.out.println("y��ǥ : ");
		int y = sc.nextInt();
		System.out.println("������ : ");
		int radius = sc.nextInt();
		System.out.println(cc.calcArea(x, y, radius));
	}
	
	//Perimeter �޼ҵ�
	public void RectPerimeter() {
		System.out.println("x��ǥ : ");
		int x = sc.nextInt();
		System.out.println("y��ǥ : ");
		int y = sc.nextInt();
		System.out.println("�ʺ� : ");
		int height = sc.nextInt();
		System.out.println("�ʺ� : ");
		int width = sc.nextInt();
		System.out.println(rc.calcPerimeter(x, y, height, width));
	}
	
	// RectArea�޼ҵ�
	public void RectArea() {
		System.out.println("x��ǥ : ");
		int x = sc.nextInt();
		System.out.println("y��ǥ : ");
		int y = sc.nextInt();
		System.out.println("�ʺ� : ");
		int height = sc.nextInt();
		System.out.println("�ʺ� : ");
		int width = sc.nextInt();
		System.out.println(rc.calcArea(x, y, height, width));
	}

}
