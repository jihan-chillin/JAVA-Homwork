package com.kh.practice;

import java.util.Scanner;

public class StudentController {
	
	// Student��ü�迭 ����
	
	Student[] sArr = new Student[5];
	Scanner sc  = new Scanner(System.in);
	
	int CUT_LINE = 60;
	
	
	// 5���� ��ü�迭 �ʱ�ȭ ���ִ� �޼ҵ�
	public StudentController() {
		for(int i = 0; i<sArr.length; i++) {
			sArr[i] = new Student();
			System.out.println((i+1)+"��° �л� ����");
			System.out.println("�� �̸� �Է�");
			sArr[i].setName(sc.next());
			System.out.println("�� ���� �Է�");
			sArr[i].setSubject(sc.next());
			System.out.println("�� ���� �Է�");
			sArr[i].setScore(sc.nextInt());
			System.out.println();
			
		}
	}
	
	// Student��ü�迭 ����ϴ� �޼ҵ�
	public Student[] printStudent() {
	
		for(int i =0; i<sArr.length; i++) {
			System.out.print("�̸� :" + sArr[i].getName()
					+" / ���� : "+sArr[i].getSubject()
					+" / ���� : "+sArr[i].getScore());
			System.out.println();
		}
		
		return sArr;

	}
	
	
	// �������� �޼ҵ�
	public int sumScore() {
		int score = 0;
		
		for(int i = 0; i<sArr.length; i++) {
			
				score += sArr[i].getScore();
			
		}
		
		return score;
		
	}
	
	// ���� ��� �޼ҵ�
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
				System.out.println(sArr[i].getName()+"�л� ���!");
				return flag; 
			}
			else {
				System.out.println(sArr[i].getName()+"�л� ����� ���");
				return !flag;	
			}
		}
		
		return flag;
		
		
	}

	

}
