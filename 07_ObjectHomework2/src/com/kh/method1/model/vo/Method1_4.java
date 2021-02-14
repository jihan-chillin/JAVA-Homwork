package com.kh.method1.model.vo;

public class Method1_4 {
	
	private String str1;
	private String str2;
	
	public Method1_4() {
		// TODO Auto-generated constructor stub
	}

	public Method1_4(String str1, String str2) {
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
	
	public boolean equality() {
		
		boolean flag = true;
		
		if(str1.equals(str2)) {
			return flag;
		}
		else return !flag;
	}

}
