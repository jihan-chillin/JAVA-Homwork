package com.kh.practice;


public class Student {
	
	private String name;
	private String subject;
	private int score;
	
	// �⺻������
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	// �Ű������ִ� ������
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
	
	
	// �л� ���� ������ִ� �޼ҵ�
	public String inform() {
		
		return "�̸� : "+name +"\n ���� :  "+ subject+"\n ���� :  "+ score;
	}
	
	

}
