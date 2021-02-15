package com.kh.silsub2.person.controller;

import java.util.Scanner;

import com.kh.silsub2.person.model.vo.Person;

public class TestPersonArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// PersonŬ������ ���� ��ü�迭 5�� ����
		Person[] p = new Person[5];
		
		// 5����� ������ �Է¹޾� �� ��ü�� �����
		for(int i=0; i<p.length; i++) {
			p[i] = new Person();
			System.out.println("==== "+(i+1)+"��° ��� ====");
			System.out.print("���� : ");
			p[i].setAge(sc.nextInt());
			System.out.print("Ű : ");
			p[i].setHeight(sc.nextInt());
			System.out.print("������ : ");
			p[i].setWeight(sc.nextInt());
			System.out.println();
			
		}
		
		// ���Ȯ��.
		for(int i =0; i<p.length; i++) {
			p[i].printInfo();
		}
		System.out.println();
		
		// 5���� ���� ���, Ű, �������� ��� ���.
		int ageAvg=0;
		int heightAvg=0;
		int weightAvg=0;
		
		for(int i=0; i<p.length; i++) {
			ageAvg += p[i].getAge();
			heightAvg += p[i].getHeight();
			weightAvg += p[i].getWeight();
		}
		
		System.out.println("���� ��� : "+(ageAvg /= 5));
		System.out.println("Ű ��� : "+(heightAvg /= 5));
		System.out.println("������ ��� : "+(weightAvg /= 5));
		
		
		
	}
}
