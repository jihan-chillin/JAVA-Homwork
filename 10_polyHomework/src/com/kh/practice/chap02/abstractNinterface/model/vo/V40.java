package com.kh.practice.chap02.abstractNinterface.model.vo;

public class V40 extends SmartPhone implements NotePen{

	public V40() {
		// TODO Auto-generated constructor stub
		setMaker("LG");
	}
	
	@Override
	public String makeCall() {
		return "��ȣ ������ ��ȭ��ư�� ����.";
	}
	
	@Override
	public String takeCall() {
		return"���� ��ư�� ����";
	}
	
	@Override
	public String picture() {
		return"1200, 1600�� Ʈ���� ī�޶�";
	}
	
	@Override
	public String charge() {
		return"�������, ��� ���� ����";
	}
	
	@Override
	public String touch() {
		return"������";
	}
	
	@Override
	public boolean bluetoothPen() {
		return false;
	}
	
	@Override
	public String printInformation() {
		// TODO Auto-generated method stub
		String printinfo = 
				"V40�� "+getMaker()+"���� ��������� ������ ������ ����.\n"
				+makeCall() + "\n"
				+takeCall()+ "\n"
				+picture()+ "\n"
				+charge()+ "\n"
				+touch() + "\n"
				+"������� �� ž�� ���� : "+bluetoothPen();

				return printinfo;
	}
}
