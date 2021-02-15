package com.oopmodel.dto;

public class Employee {
	// 사원정보 관리용 클래스
	
	private int empNo;
	private String empName;
	private String dept; // 소속부서
	private String job; // 직업
	private char gender;
	private int age;
	private double bonusPoint;
	private String phone;
	private String adr; // 주소
	private int salary; // 급여
	
	// 기본생성자
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	// 매개변수 생성자
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
	
	
	// 직원들 정보 한꺼번에 출력
	
	public String empInformaion() {
		
		return "이름 : " +empName+", 나이 : " +age
				+", 성별 : "+age+", 핸드폰 번호 : "+phone
				+", 주소 : "+adr+", 사번 : " +empNo
				+ ", 직급 : "+job+", 소속부서 : "+dept
				+", 보너스 포인트 : "+bonusPoint
				+", 급여 : "+salary;	
	}

	
}
