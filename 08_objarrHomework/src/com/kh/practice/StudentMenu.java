package com.kh.practice;

public class StudentMenu {
	
	StudentController ssm = new StudentController();
	
	// �⺻������
	public StudentMenu() {
	
		System.out.println("======= �л����� ��� =======");
		System.out.println(ssm.printStudent());
		System.out.println("======= �л����� ��� =======");
		System.out.println(ssm.sumScore());
		System.out.println(ssm.avgScore()[1]);
		System.out.println("======= ������� ��� =======");
		System.out.println(ssm.PassOrNot());
	}

}
