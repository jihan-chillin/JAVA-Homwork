package com.oop.controller;

import java.util.Scanner;

import com.oopmodel.dto.Employee;

public class EmpArrayTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 3���� �����ڸ� �̿��� �������� ���� �ʱ�ȭ.
	
		Employee e1 = new Employee();
		Employee[] e = new Employee[3];
		
		for(int i = 0; i<e.length ; i++) {
			e[i] = new Employee();
			System.out.print("��� : ");
			e[i].setEmpNo(sc.nextInt());
			System.out.print("�̸� : ");
			e[i].setEmpName(sc.next());
			System.out.print("�ҼӺμ� : ");
			e[i].setDept(sc.next());
			System.out.print("���� : ");
			e[i].setJob(sc.next());
			System.out.print("���� : ");
			e[i].setAge(sc.nextInt());
			System.out.print("���� : ");
			e[i].setGender(sc.next().charAt(0));
			System.out.print("�޿� : ");
			e[i].setSalary(sc.nextInt());
			System.out.print("���ʽ�����Ʈ : ");
			e[i].setBonusPoint(sc.nextDouble());
			System.out.print("��ȭ��ȣ : ");
			e[i].setPhone(sc.next());
			System.out.print("�ּ� : ");
			e[i].setAdr(sc.next());
			System.out.println("===============\n");
			
		}
		
		// ������ ���� ���
		for(int i = 0 ; i<e.length; i++) {
			System.out.println(e[i].empInformaion()); 
			}
		System.out.println("========================");
		
		
		// �������� ������ ���ʽ��� ����� 1�� ���� ���
		double[] aSalary = new double[3]; 
		double annualSalary;
		
		for(int i =0; i<e.length; i++) {
			
			annualSalary = (e[i].getSalary()+(e[i].getSalary()*e[i].getBonusPoint()))*12;
			System.out.println(e[i].getEmpName()+"�� ���� : "+(int)annualSalary);
			aSalary[i] = annualSalary;
		}
		System.out.println("========================");
		
		// �������� ������� 
		double sumSalary = 0;
		for(int i =0; i<e.length; i++) {
			sumSalary+=aSalary[i];
		}
		
		double avrSalary = sumSalary / 3.0;
		System.out.println("�������� ������ ��� : "+ avrSalary);
				
	}

}
