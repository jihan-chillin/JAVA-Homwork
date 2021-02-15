package com.oopmodel.dto;

public class Employee {
	// ������� ������ Ŭ����
	
	private int empNo;
	private String empName;
	private String dept; // �ҼӺμ�
	private String job; // ����
	private char gender;
	private int age;
	private double bonusPoint;
	private String phone;
	private String adr; // �ּ�
	private int salary; // �޿�
	
	// �⺻������
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	// �Ű����� ������
	public Employee(int empNo, String empName, String dept, String job, char gender, int age, double bonusPoint,
			String phone, String adr, int salary) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.dept = dept;
		this.job = job;
		this.gender = gender;
		this.age = age;
		this.bonusPoint = bonusPoint;
		this.phone = phone;
		this.adr = adr;
		this.salary = salary;
	}

	// getter setter
	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAdr() {
		return adr;
	}

	public void setAdr(String adr) {
		this.adr = adr;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	// ������ ���� �Ѳ����� ���
	
	public String empInformaion() {
		
		return "�̸� : " +empName+", ���� : " +age
				+", ���� : "+age+", �ڵ��� ��ȣ : "+phone
				+", �ּ� : "+adr+", ��� : " +empNo
				+ ", ���� : "+job+", �ҼӺμ� : "+dept
				+", ���ʽ� ����Ʈ : "+bonusPoint
				+", �޿� : "+salary;	
	}

	
}
