package com.kh.practice;

import java.util.Scanner;

public class StudentController {
	
	// Student객체배열 생성
	
	Student[] sArr = new Student[5];
	Scanner sc  = new Scanner(System.in);
	
	int CUT_LINE = 60;
	
	
	// 5개의 객체배열 초기화 해주는 메소드
	public StudentController() {
		for(int i = 0; i<sArr.length; i++) {
			sArr[i] = new Student();
			System.out.println((i+1)+"번째 학생 정보");
			System.out.println("▽ 이름 입력");
			sArr[i].setName(sc.next());
			System.out.println("▽ 과목 입력");
			sArr[i].setSubject(sc.next());
			System.out.println("▽ 점수 입력");
			sArr[i].setScore(sc.nextInt());
			System.out.println();
			
		}
	}
	
	// Student객체배열 출력하는 메소드
	public Student[] printStudent() {
	
		for(int i =0; i<sArr.length; i++) {
			System.out.print("이름 :" + sArr[i].getName()
					+" / 과목 : "+sArr[i].getSubject()
					+" / 점수 : "+sArr[i].getScore());
			System.out.println();
		}
		
		return sArr;

	}
	
	
	// 점수총합 메소드
	public int sumScore() {
		int score = 0;
		
		for(int i = 0; i<sArr.length; i++) {
			
				score += sArr[i].getScore();
			
		}
		
		return score;
		
	}
	
	// 점수 평균 메소드
	public double[] avgScore() {
		
		double[] avr = new double[5];
		
		avr[0] = sumScore();
		avr[1] = sumScore() / 3.0;
		
		return avr;
		
	}
	
	public boolean PassOrNot() {
		boolean flag = true;
		
		for(int i =0; i<sArr.length ; i++) {
			if(sArr[i].getScore()>=60) {
				System.out.println(sArr[i].getName()+"학생 통과!");
				return flag; 
			}
			else {
				System.out.println(sArr[i].getName()+"학생 재시험 대상");
				return !flag;	
			}
		}
		
		return flag;
		
		
	}

	

}
