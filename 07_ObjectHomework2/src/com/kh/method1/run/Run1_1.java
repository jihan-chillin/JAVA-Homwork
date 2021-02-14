package com.kh.method1.run;

import com.kh.method1.model.vo.Method1_1;

public class Run1_1 {
	public static void main(String[] args) {
		
		// 1. 문자열 두개 전달 받고 결합해서 리턴해주는 거 
				Method1_1 m = new Method1_1();
				
				m.setStr1("오늘은 ");
				m.setStr2("화요일");
				System.out.println(m.StringCombination());
		
	}
	
}
