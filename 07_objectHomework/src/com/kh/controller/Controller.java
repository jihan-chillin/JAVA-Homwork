package com.kh.controller;

import java.util.Scanner;

public class Controller {
	public void baseball() {
		// 팀, 이름 번호 포지션, 타율 ,저번시즌 점수 
	}
	public void weding() {
		Scanner sc = new Scanner(System.in);
		System.out.println("▽ 이름 :");
		String name = sc.next();
		System.out.println("▽ 나이 : ");
		int age = sc.nextInt();
		System.out.println("▽ 성별(F/M) : ");
		char gender = sc.next().charAt(0);
		System.out.println("▽ 직업 : ");
		String job = sc.next();
		System.out.println("▽ 취미 : ");
		sc.nextLine();
		String hobby = sc.nextLine();
		
		// 종교
		// 초혼인지 재혼인지
		// 자녀유무
		// 사는 지역
		// 좋아하는 스타일 (1. 취미가 잘 맞는 2. 직업이 동일한 3. 가까이 사는 4. 종교가 같은
	}
	public void furniture() {
		Scanner sc = new Scanner(System.in);
		System.out.println("▽ 찾으시는 가구가 있나요?");
		System.out.println("1. 침대, 2. 책상, 3. 의자, 4. 옷장, 5.기타 소품");
		int choice = sc.nextInt();
		if(choice == 1) {
			System.out.println("▽ 어떤 침대를 찾으시나요");
			System.out.println("1. 퀸사이즈, 2. 싱글, 3. 아기용");
			int choice1 = sc.nextInt();
			
			switch(choice1) {
			case 1: System.out.println("520,000원입니다.");
			case 2: System.out.println("419,000원입니다.");
			case 3: System.out.println("229,000원입니다.");
			}
			
		}
		else if(choice == 2) {
			System.out.println("▽ 원하시는 디자인이 있나요?");
			System.out.println("1. 스칸디나비아 디자인, 2. 원목, 3. 높이 조절가능");
			int choice1 = sc.nextInt();
			
			switch(choice1) {
			case 1: System.out.println("104,000원입니다.");
			case 2: System.out.println("269,000원입니다.");
			case 3: System.out.println("304,000원입니다.");
			}
			
		}
		else if(choice == 3) {
			System.out.println("▽ 의자의 용도가 무엇인가요?");
			System.out.println("1. 책상의자 , 2. , 3. 아기용");
			int choice1 = sc.nextInt();
			
			switch(choice1) {
			case 1: System.out.println("210,000원입니다.");
			case 2: System.out.println("419,000원입니다.");
			case 3: System.out.println("229,000원입니다.");
			}
			
		}
		else if(choice == 4) {
			System.out.println("▽ 어떤 침대를 찾으시나요");
			System.out.println("1. 퀸사이즈, 2. 싱글, 3. 아기용");
			int choice1 = sc.nextInt();
			
			switch(choice1) {
			case 1: System.out.println("520,000원입니다.");
			case 2: System.out.println("419,000원입니다.");
			case 3: System.out.println("229,000원입니다.");
			}
			
		}
		
	}
}
