package com.kh.practice.numRange.view;

import java.io.IOException;
import java.util.Scanner;

import com.kh.practice.numRange.controller.NumberController;

public class NumberMenu {
	
	public void menu() {
		
		NumberController nc = new NumberController();
		Scanner sc = new Scanner(System.in);
		System.out.print("���� 1 : ");
		int num1 = sc.nextInt();
		System.out.print("���� 2 : ");
		int num2 = sc.nextInt();
		
		try {
			System.out.print(num1+"��(��)"+num2+"�� ����ΰ�? ");
			System.out.println(nc.checkDouble(num1, num2));
		}
		catch(Exception e) {
			e.printStackTrace();
		}	
	}

}
