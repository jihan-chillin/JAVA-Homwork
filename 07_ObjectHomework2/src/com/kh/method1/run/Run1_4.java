package com.kh.method1.run;

import com.kh.method1.model.vo.Method1_4;

public class Run1_4 {
	public static void main(String[] args) {
		Method1_4 m = new Method1_4();
		
		m.setStr1("��Ÿ����");
		m.setStr2("��Ÿ����");
		System.out.println(m.equality());
		
		m.setStr1("��Ÿ����");
		m.setStr2("����");
		System.out.println(m.equality());
	}

}
