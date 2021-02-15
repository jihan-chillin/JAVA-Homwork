package com.kh.silsub2.point.main;

import java.util.Scanner;

import com.kh.silsub2.point.model.vo.Circle;
import com.kh.silsub2.point.model.vo.Rectangle;



public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// Circle �迭 �ʱ�ȭ
		Circle[] c = new Circle[3];	
		
		
		for(int i = 0 ; i<c.length; i++) {		
			System.out.println("===="+(i+1)+"��° ��====");
			c[i] = new Circle();	// �̰ɽ���� ���� �� �� ����� �� ����.***
			System.out.print("������ : ");
			c[i].setRadius(sc.nextInt());
			System.out.println();
			
		}
		
		for(int i = 0; i<c.length; i++) {
			c[i].draw();
			System.out.println();
		}
		System.out.println();
		
		
		
		
		// Rectangle �迭 �ʱ�ȭ
		Rectangle[] r = new Rectangle[3];	
				
				
		for(int i = 0 ; i<c.length; i++) {		
			System.out.println("===="+(i+1)+"��° �簢�� ====");
			r[i] = new Rectangle();	// �̰ɽ���� ���� �� �� ����� �� ����.***
			System.out.print("���� : ");
			r[i].setWidth(sc.nextInt());
			System.out.print("���� : ");
			r[i].setHeight(sc.nextInt());
			System.out.println();
			
		}
				
		for(int i = 0; i<r.length; i++) {
			r[i].draw();
			System.out.println();
		}
		

	}
}
