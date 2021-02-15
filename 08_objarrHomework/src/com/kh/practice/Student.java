package com.kh.practice;


public class Student {
	
	private String name;
	private String subject;
	private int score;
	
	// 기본생성자
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	// 매개변수있는 생성자
	public Student(String name, String subject, int score) {
		super();
		this.name = name;
		this.subject = subject;
		this.score = score;
	}

	// getter & setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
	// 학생 정보 출력해주는 메소드
	public String inform() {
		
		return "이름 : "+name +"\n 과목 :  "+ subject+"\n 점수 :  "+ score;
	}
	
	

}
