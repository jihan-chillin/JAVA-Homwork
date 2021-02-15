package com.oop.controller;

import java.util.Scanner;

import com.oopmodel.dto.Employee;

public class EmpArrayTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 3개의 생성자를 이용해 직원들의 정보 초기화.
	
		Employee e1 = new Employee();
		Employee[] e = new Employee[3];
		
		for(int i = 0; i<e.length ; i++) {
			e[i] = new Employee();
			System.out.print("사번 : ");
			e[i].setEmpNo(sc.nextInt());
			System.out.print("이름 : ");
			e[i].setEmpName(sc.next());
			System.out.print("소속부서 : ");
			e[i].setDept(sc.next());
			System.out.print("직급 : ");
			e[i].setJob(sc.next());
			System.out.print("나이 : ");
			e[i].setAge(sc.nextInt());
			System.out.print("성별 : ");
			e[i].setGender(sc.next().charAt(0));
			System.out.print("급여 : ");
			e[i].setSalary(sc.nextInt());
			System.out.print("보너스포인트 : ");
			e[i].setBonusPoint(sc.nextDouble());
			System.out.print("전화번호 : ");
			e[i].setPhone(sc.next());
			System.out.print("주소 : ");
			e[i].setAdr(sc.next());
			System.out.println("===============\n");
			
		}
		
		// 직원들 정보 출력
		for(int i = 0 ; i<e.length; i++) {
			System.out.println(e[i].empInformaion()); 
			}
		System.out.println("========================");
		
		
		// 직원들의 각각의 보너스가 적용된 1년 연봉 계산
		double[] aSalary = new double[3]; 
		double annualSalary;
		
		for(int i =0; i<e.length; i++) {
			
			annualSalary = (e[i].getSalary()+(e[i].getSalary()*e[i].getBonusPoint()))*12;
			System.out.println(e[i].getEmpName()+"의 연봉 : "+(int)annualSalary);
			aSalary[i] = annualSalary;
		}
		System.out.println("========================");
		
		// 직원들의 연봉평균 
		double sumSalary = 0;
		for(int i =0; i<e.length; i++) {
			sumSalary+=aSalary[i];
		}
		
		double avrSalary = sumSalary / 3.0;
		System.out.println("직원들의 연봉의 평균 : "+ avrSalary);
				
	}

}
