package com.kh.practice.chap02.abstractNinterface.model.vo;

public interface Phone {
	
	
	public char[] NUMBERPAD = {'1', '2', '3', '4', '5', '6', '7','8', '9','*','0','#'};
	
	public abstract String makeCall();   // 전화거는 추상메소드
	
	public abstract String takeCall();  // 전화받는 추상메소드
		

}
