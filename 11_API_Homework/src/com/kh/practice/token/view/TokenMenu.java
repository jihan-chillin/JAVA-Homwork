package com.kh.practice.token.view;

import java.util.Scanner;

import com.kh.practice.token.controller.TokenController;

public class TokenMenu {
	
	Scanner sc = new Scanner(System.in);
	TokenController tc = new TokenController();
	
	public void mainMenu() {
	
		while(true) {
			System.out.println("1. ���� ���ڿ�");
			System.out.println("2. �Է� ���ڿ�");
			System.out.println("3. ���α׷� ������");
			System.out.print("��ȣ : ");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1 : tokenMenu(); break;
			case 2 : inputMenu(); break;
			case 3 : System.out.println("���α׷��� �����մϴ�"); return;
			}
		}
		
	}
	
	public void tokenMenu() {
		String str = "J a v a P r o g r a m";
		// ��ū ó�� �� ����, ��ū ó�� �� ������ ���.
		int count = 0;
		
		System.out.println("��ū ó�� �� : "+str);
		for(int i = 0; i<str.length() ; i++) {
			count++;
		}
		System.out.println("��ū ó�� �� ������ ���� : "+count);
		// TokenController�� afterToken()�� ��ȯ���� ������
		// ��ū ó�� �� ���ڿ� ó�� ���� ����, ��� �빮�ڷ� ��ȯ�Ѱ��� ���
		
		int count2 = 0; 
		System.out.println("��ū ó�� �� : "+tc.afterToken(str));
		for(int i = 0; i<tc.afterToken(str).length() ; i++) {
			count2++;
		}
		System.out.println("��ū ó�� �� ������ ���� : "+count2);
	}
	
	public void inputMenu() {
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		sc.nextLine();
		String input = sc.nextLine();
		System.out.println(tc.firstCap(input));
		
		
		System.out.print("ã�� ���ڸ� �Է��ϼ��� : ");
		char one = sc.next().charAt(0);
		System.out.println(tc.findChar(input, one));
		
	}

}
