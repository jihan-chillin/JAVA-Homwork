package com.uni;

import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] arr = new Student[3];
		
		// Student ���� �����ϱ� 
		for(int i = 0 ; i<arr.length; i++) {		
			System.out.println("===="+(i+1)+"��° �л�����====");
			arr[i] = new Student();	// �̰ɽ���� ���� �� �� ����� �� ����.***
			System.out.print("�̸� : ");
			arr[i].setName(sc.next());
			System.out.print("���� : ");
			arr[i].setAge(sc.nextInt());
			System.out.print("Ű : ");
			arr[i].setHeight(sc.nextInt());
			System.out.print("������ : ");
			arr[i].setWeight(sc.nextInt());
			System.out.print("���� : ");
			arr[i].setMajor(sc.next());
			System.out.print("�й� : ");
			arr[i].setNumber(sc.next());
			
		}
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i].printInformation());
			
		}
	}

}
