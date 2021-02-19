package com.kh.practice.numRange.view;

import java.io.IOException;
import java.util.Scanner;

import com.kh.practice.numRange.controller.NumberController;

public class NumberMenu {
	
	public void menu() {
		
		NumberController nc = new NumberController();
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수 2 : ");
		int num2 = sc.nextInt();
		
		try {
			System.out.print(num1+"은(는)"+num2+"의 배수인가? ");
			System.out.println(nc.checkDouble(num1, num2));
		}
		catch(Exception e) {
			e.printStackTrace();
		}	
	}

}
