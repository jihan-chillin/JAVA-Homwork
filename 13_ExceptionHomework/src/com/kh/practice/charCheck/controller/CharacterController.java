package com.kh.practice.charCheck.controller;

import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterController {

	public CharacterController() {
		// TODO Auto-generated constructor stub
	}
	
	public int countAlpha(String s) throws CharCheckException {
		int count=0;
		
		for(int i =0; i<s.length(); i++) {
			if((s.charAt(i)>='a'&&s.charAt(i)<='z')||(s.charAt(i)>='A'&&s.charAt(i)<='Z')) {
				char ch = s.charAt(i);
				count++;
			}
			else if(s.charAt(i) == ' ') {
				throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다.");
			}
		}
		System.out.print(s+"에 포함된 영문자 개수 : ");
		return count;		
	}
}
