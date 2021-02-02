package com.kh.practice.chap02.loopPracitce;

import java.util.Scanner;

public class LoopPractice {
	public void practice15() {
		// 1. 숫자 한 개 입력받기
		// 2. 소수인지 판별하기 
		// 3. 입력한 수가 2보다 작은 경우 "잘못 입력하셨습니다" 출력
		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("▽ 숫자 한 개를 입력하십시오");
		int prime = sc.nextInt();
		
		if(prime<2) { System.out.println("잘못 입력하셨습니다.");}
		else {
			for(int i=2; i<=prime; i++) {
				
				if(prime%i == 0) {
					count++;
				}
			}
			
			if(count == 1) {
				System.out.println("소수입니다.");
			}
			else System.out.println("소수가 아닙니다.");
		}
	}
	public void practice16() {
		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("▽ 숫자 한 개를 입력하십시오");
		int prime = sc.nextInt();
		
		if(prime>=2) {
			for(int i = 2 ; i<=prime ; i++) {
				if(prime%i == 0) count++;
			}
			if (count == 1) {
				System.out.println("소수입니다.");
			}
			else System.out.println("소수가 아닙니다.");
		}
		else { System.out.println("잘못 입력하셨습니다."); practice16();}
			
		}
	
	public void practice17() {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int[] primeNumbers = new int[100];
		System.out.println("▽ 숫자 한 개를 입력하십시오");
		int prime = sc.nextInt();
		
		for(int i = 2 ; i<=prime; i++) {
			for(int j = 2; j<=i; j++) {
				if(i%j == 0 ) { count++; }
			}
			if(count == 1) {
				System.out.println(i);
		}
	}
}
	public void practice18() {
		Scanner sc  = new Scanner(System.in);
		System.out.println("▽ 자연수 하나를 입력하세요");
		int num = sc.nextInt();
		int count =0;
		
		for(int i=1; i<=num; i++) {
			if(i%2 == 0 || i%3 ==0) {
				System.out.print(i+" ");
			}
			if(i%2 == 0 && i%3 ==0) {
				count++;
			}
		}
		System.out.println();
		System.out.println("count : "+count);
	}
	public void practice19() {
		Scanner sc = new Scanner(System.in);
		System.out.println("▽ 숫자를 입력하시오.");
		int num = sc.nextInt();
		
		for(int i =1; i<=num; i++) {
			for(int j =num ; j>=1; j--) {
				if(j>i) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	public void practice20() {
		Scanner sc = new Scanner(System.in);
		System.out.println("▽ 정수를 입력하시오");
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				if(j<=i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(int k =1; k<num; k++) {
			for(int l=k; l<num; l++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
	public void practice21() {
		Scanner sc = new Scanner(System.in);
		System.out.println("▽ 정수를 입력하시오");
		int num = sc.nextInt();
		
		for(int i =0; i<num; i++) {
			for(int j =1; j<num-i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<i*2+1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void practice22() {
		Scanner sc = new Scanner(System.in);
		System.out.println("▽ 정수를 입력하시오");
		int num = sc.nextInt();
		
		for(int i =0; i<num; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		for(int j=1; j<num-1; j++) {
			for(int k=1; k<=num; k++) {
				if(k == 1 || k == num) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i =0; i<num; i++) {
			System.out.print("*");
		
		}
	}
}
