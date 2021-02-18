package com.kh.practice.chap02.abstractNinterface.Controller;

import com.kh.practice.chap02.abstractNinterface.model.vo.GalaxyNote9;
import com.kh.practice.chap02.abstractNinterface.model.vo.SmartPhone;
import com.kh.practice.chap02.abstractNinterface.model.vo.V40;

public class PhoneController {

	
	public String[] method() {
		
		SmartPhone[] p = new SmartPhone[2];
		
		p[0] = new GalaxyNote9();
		p[1] = new V40();
		
		String[] info = new String[2];
		for(int i =0; i<info.length; i++) {
			info[i] = p[i].printInformation();
			System.out.println(info[i]);
			System.out.println();
		}
		
		return info;
		
	}
}
