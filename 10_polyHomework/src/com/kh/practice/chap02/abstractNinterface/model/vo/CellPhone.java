package com.kh.practice.chap02.abstractNinterface.model.vo;

public interface CellPhone extends Phone, Camera{
	
	public abstract String charge();  // 충전방식 추상메소드

}
