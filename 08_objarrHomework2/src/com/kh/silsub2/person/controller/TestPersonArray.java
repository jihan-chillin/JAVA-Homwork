package com.kh.silsub2.person.controller;

import java.util.Scanner;

import com.kh.silsub2.person.model.vo.Person;

public class TestPersonArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Person클래스에 대한 객체배열 5개 선언
		Person[] p = new Person[5];
		
		// 5사람의 정보를 입력받아 각 객체에 기록함
		for(int i=0; i<p.length; i++) {
			p[i] = new Person();
			System.out.println("==== "+(i+1)+"번째 사람 ====");
			System.out.print("나이 : ");
			p[i].setAge(sc.nextInt());
			System.out.print("키 : ");
			p[i].setHeight(sc.nextInt());
			System.out.print("몸무게 : ");
			p[i].setWeight(sc.nextInt());
			System.out.println();
			
		}
		
		// 출력확인.
		for(int i =0; i<p.length; i++) {
			p[i].printInfo();
		}
		System.out.println();
		
		// 5명의 나이 평균, 키, 몸무게의 평균 출력.
		int ageAvg=0;
		int heightAvg=0;
		int weightAvg=0;
		
		for(int i=0; i<p.length; i++) {
			ageAvg += p[i].getAge();
			heightAvg += p[i].getHeight();
			weightAvg += p[i].getWeight();
		}
		
		System.out.println("나이 평균 : "+(ageAvg /= 5));
		System.out.println("키 평균 : "+(heightAvg /= 5));
		System.out.println("몸무게 평균 : "+(weightAvg /= 5));
		
		
		
	}
}
