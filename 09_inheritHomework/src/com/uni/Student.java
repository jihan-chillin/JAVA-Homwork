package com.uni;

public class Student extends Human {
	
	private String number;
	private String major;
	
	// �⺻������
	public Student() {
		// TODO Auto-generated constructor stub
	}

	// �Ű����� ������
	public Student(String name, int age, int height, int weight, String number, String major) {
		super(name, age, height, weight);
		this.number = number;
		this.major = major;
	}

	// getter setter
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	public String printInformation() {
		return name+" "+age+" "+height+" "+weight+" "+number+" "+major;
	}
	
	

}
