package com.kh.practice.token.view;

import java.util.Scanner;

import com.kh.practice.token.controller.TokenController;

public class TokenMenu {
	
	Scanner sc = new Scanner(System.in);
	TokenController tc = new TokenController();
	
	public void mainMenu() {
	
		while(true) {
			System.out.println("1. 지정 문자열");
			System.out.println("2. 입력 문자열");
			System.out.println("3. 프로그램 끝내기");
			System.out.print("번호 : ");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1 : tokenMenu(); break;
			case 2 : inputMenu(); break;
			case 3 : System.out.println("프로그램을 종료합니다"); return;
			}
		}
		
	}
	
	public void tokenMenu() {
		String str = "J a v a P r o g r a m";
		// 토큰 처리 전 글자, 토큰 처리 전 개수를 출력.
		int count = 0;
		
		System.out.println("토큰 처리 전 : "+str);
		for(int i = 0; i<str.length() ; i++) {
			count++;
		}
		System.out.println("토큰 처리 전 문자의 개수 : "+count);
		// TokenController의 afterToken()의 반환값을 가지고
		// 토큰 처리 후 글자와 처리 후의 개수, 모두 대문자로 변환한것을 출력
		
		int count2 = 0; 
		System.out.println("토큰 처리 후 : "+tc.afterToken(str));
		for(int i = 0; i<tc.afterToken(str).length() ; i++) {
			count2++;
		}
		System.out.println("토큰 처리 후 문자의 개수 : "+count2);
	}
	
	public void inputMenu() {
		System.out.print("문자열을 입력하세요 : ");
		sc.nextLine();
		String input = sc.nextLine();
		System.out.println(tc.firstCap(input));
		
		
		System.out.print("찾을 문자를 입력하세요 : ");
		char one = sc.next().charAt(0);
		System.out.println(tc.findChar(input, one));
		
	}

}
