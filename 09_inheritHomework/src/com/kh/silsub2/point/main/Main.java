package com.kh.silsub2.point.main;

import java.util.Scanner;

import com.kh.silsub2.point.model.vo.Circle;
import com.kh.silsub2.point.model.vo.Rectangle;



public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// Circle 배열 초기화
		Circle[] c = new Circle[3];	
		
		
		for(int i = 0 ; i<c.length; i++) {		
			System.out.println("===="+(i+1)+"번째 원====");
			c[i] = new Circle();	// 이걸써줘야 다음 행 껄 사용할 수 있음.***
			System.out.print("반지름 : ");
			c[i].setRadius(sc.nextInt());
			System.out.println();
			
		}
		
		for(int i = 0; i<c.length; i++) {
			c[i].draw();
			System.out.println();
		}
		System.out.println();
		
		
		
		
		// Rectangle 배열 초기화
		Rectangle[] r = new Rectangle[3];	
				
				
		for(int i = 0 ; i<c.length; i++) {		
			System.out.println("===="+(i+1)+"번째 사각형 ====");
			r[i] = new Rectangle();	// 이걸써줘야 다음 행 껄 사용할 수 있음.***
			System.out.print("가로 : ");
			r[i].setWidth(sc.nextInt());
			System.out.print("세로 : ");
			r[i].setHeight(sc.nextInt());
			System.out.println();
			
		}
				
		for(int i = 0; i<r.length; i++) {
			r[i].draw();
			System.out.println();
		}
		

	}
}
