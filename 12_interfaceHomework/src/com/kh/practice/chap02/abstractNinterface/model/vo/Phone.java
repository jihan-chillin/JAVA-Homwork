package com.kh.practice.chap02.abstractNinterface.model.vo;

public interface Phone {
	
	
	public char[] NUMBERPAD = {'1', '2', '3', '4', '5', '6', '7','8', '9','*','0','#'};
	
	public abstract String makeCall();   // ��ȭ�Ŵ� �߻�޼ҵ�
	
	public abstract String takeCall();  // ��ȭ�޴� �߻�޼ҵ�
		

}
