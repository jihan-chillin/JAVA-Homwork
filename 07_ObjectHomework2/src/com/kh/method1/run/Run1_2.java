package com.kh.method1.run;

import com.kh.method1.model.vo.Method1_2;

public class Run1_2 {
	public static void main(String[] args) {
		
		Method1_2 m = new Method1_2();
		
		m.setNum(2);
		m.setNum1(6);
		System.out.println(m.sum());
		
		m.setNum(5);
		m.setNum1(2);
		System.out.println(m.sum());
	}

}
