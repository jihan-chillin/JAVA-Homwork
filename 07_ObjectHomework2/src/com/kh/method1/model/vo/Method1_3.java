package com.kh.method1.model.vo;

public class Method1_3 {
	private char alpha;
	
	public Method1_3() {
		// TODO Auto-generated constructor stub
	}

	public Method1_3(char alpha) {
		super();
		this.alpha = alpha;
	}

	public char getAlpha() {
		return alpha;
	}

	public void setAlpha(char alpha) {
		this.alpha = alpha;
	}
	
	
	public boolean alpha() {
		boolean flag = true;
		if(alpha>='a'&& alpha<='z' || alpha>='A'&& alpha<='Z') {
			return flag;

		}
		else return !flag;
	}

}
