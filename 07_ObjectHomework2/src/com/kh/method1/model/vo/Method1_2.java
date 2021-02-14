package com.kh.method1.model.vo;

public class Method1_2 {
	private int num;
	private int num1;
	
	 
	public Method1_2() {
		// TODO Auto-generated constructor stub
	}


	public Method1_2(int num, int num1) {
		super();
		this.num = num;
		this.num1 = num1;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public int getNum1() {
		return num1;
	}


	public void setNum1(int num1) {
		this.num1 = num1;
	}
	
	// 첫 번째 수 ~ 두 번째 수 까지 합 리턴 매소드
	public int sum() {
		int sum = 0;
		if(num<num1) {
			for(int i =num; i<=num1; i++) {
				sum+=i;
			}
			return sum;
		}
		
		return 0;
	}

}
