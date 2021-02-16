package com.kh.practice.chap02.abstractNinterface.model.vo;

public abstract class SmartPhone implements CellPhone, TouchDisplay {
	
	private String maker; // Á¦Á¶»ç
	
	public SmartPhone() {
		// TODO Auto-generated constructor stub
	}
	
	
	protected SmartPhone(String maker) {
		super();
		this.maker = maker;
	}

	public String printInformation() {
		return "SmartPhone [maker=" + maker + "]";
	}
	
	public void setMaker(String maker) {
		
	}
	
	public String getMaker() {
		return "";
	}


}
	
	


