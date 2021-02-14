package com.kh.method1.run;

import com.kh.method1.model.vo.Method1_4;

public class Run1_4 {
	public static void main(String[] args) {
		Method1_4 m = new Method1_4();
		
		m.setStr1("½ºÅ¸¹÷½º");
		m.setStr2("½ºÅ¸¹÷½º");
		System.out.println(m.equality());
		
		m.setStr1("½ºÅ¸¹÷½º");
		m.setStr2("Åõ½æ");
		System.out.println(m.equality());
	}

}
