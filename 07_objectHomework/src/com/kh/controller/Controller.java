package com.kh.controller;

import java.util.Scanner;

public class Controller {
	public void baseball() {
		// ��, �̸� ��ȣ ������, Ÿ�� ,�������� ���� 
	}
	public void weding() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� �̸� :");
		String name = sc.next();
		System.out.println("�� ���� : ");
		int age = sc.nextInt();
		System.out.println("�� ����(F/M) : ");
		char gender = sc.next().charAt(0);
		System.out.println("�� ���� : ");
		String job = sc.next();
		System.out.println("�� ��� : ");
		sc.nextLine();
		String hobby = sc.nextLine();
		
		// ����
		// ��ȥ���� ��ȥ����
		// �ڳ�����
		// ��� ����
		// �����ϴ� ��Ÿ�� (1. ��̰� �� �´� 2. ������ ������ 3. ������ ��� 4. ������ ����
	}
	public void furniture() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ã���ô� ������ �ֳ���?");
		System.out.println("1. ħ��, 2. å��, 3. ����, 4. ����, 5.��Ÿ ��ǰ");
		int choice = sc.nextInt();
		if(choice == 1) {
			System.out.println("�� � ħ�븦 ã���ó���");
			System.out.println("1. ��������, 2. �̱�, 3. �Ʊ��");
			int choice1 = sc.nextInt();
			
			switch(choice1) {
			case 1: System.out.println("520,000���Դϴ�.");
			case 2: System.out.println("419,000���Դϴ�.");
			case 3: System.out.println("229,000���Դϴ�.");
			}
			
		}
		else if(choice == 2) {
			System.out.println("�� ���Ͻô� �������� �ֳ���?");
			System.out.println("1. ��ĭ�𳪺�� ������, 2. ����, 3. ���� ��������");
			int choice1 = sc.nextInt();
			
			switch(choice1) {
			case 1: System.out.println("104,000���Դϴ�.");
			case 2: System.out.println("269,000���Դϴ�.");
			case 3: System.out.println("304,000���Դϴ�.");
			}
			
		}
		else if(choice == 3) {
			System.out.println("�� ������ �뵵�� �����ΰ���?");
			System.out.println("1. å������ , 2. , 3. �Ʊ��");
			int choice1 = sc.nextInt();
			
			switch(choice1) {
			case 1: System.out.println("210,000���Դϴ�.");
			case 2: System.out.println("419,000���Դϴ�.");
			case 3: System.out.println("229,000���Դϴ�.");
			}
			
		}
		else if(choice == 4) {
			System.out.println("�� � ħ�븦 ã���ó���");
			System.out.println("1. ��������, 2. �̱�, 3. �Ʊ��");
			int choice1 = sc.nextInt();
			
			switch(choice1) {
			case 1: System.out.println("520,000���Դϴ�.");
			case 2: System.out.println("419,000���Դϴ�.");
			case 3: System.out.println("229,000���Դϴ�.");
			}
			
		}
		
	}
}
