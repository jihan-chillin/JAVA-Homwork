package com.kh.method1.model.vo;

public class Method1_1 {

	// 문자열 두개를 전달받고 두 문자열을 결합하고 리턴해주는 메소드
	
	private String str1;
	private String str2;
	
	public Method1_1() {
		// TODO Auto-generated constructor stub
	}

	public Method1_1(String str1, String str2) {
		super();
		this.str1 = str1;
		this.str2 = str2;
	}

	public String getStr1() {
		return str1;
	}

	public void setStr1(String str1) {
		this.str1 = str1;
	}

	public String getStr2() {
		return str2;
	}

	public void setStr2(String str2) {
		this.str2 = str2;
	}
	
	public String StringCombination() {
		
		return str1 + str2;
	}
}
