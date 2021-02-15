package com.kh.practice;

public class StudentMenu {
	
	StudentController ssm = new StudentController();
	
	// 기본생성자
	public StudentMenu() {
	
		System.out.println("======= 학생정보 출력 =======");
		System.out.println(ssm.printStudent());
		System.out.println("======= 학생성적 출력 =======");
		System.out.println(ssm.sumScore());
		System.out.println(ssm.avgScore()[1]);
		System.out.println("======= 성적결과 출력 =======");
		System.out.println(ssm.PassOrNot());
	}

}
