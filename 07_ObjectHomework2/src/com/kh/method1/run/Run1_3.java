package com.kh.method1.run;

import com.kh.method1.model.vo.Method1_3;

public class Run1_3 {
	public static void main(String[] args) {
		
		Method1_3 m = new Method1_3();
		
		m.setAlpha('a');
		System.out.println(m.alpha());
		
		m.setAlpha('¤¡');
		System.out.println(m.alpha());
	}
}
