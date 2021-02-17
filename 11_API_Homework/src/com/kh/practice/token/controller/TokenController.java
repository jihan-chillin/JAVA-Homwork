package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	
	public TokenController() {
		// TODO Auto-generated constructor stub
	}
	
	public String afterToken(String str) {
		
		// 공백을 토큰으로 처리 -> 문자열 반환
        String replaceStr = str.replace(" ","");
        return replaceStr;
		
	}
	
	public String firstCap(String input) {
		
		// 매개변수로 받아온 input의 첫 번째 글자만 대문자로 바꾼 문자열 반환.
		
		String firstChar = input.substring(0,1); // 첫번째 문자만 자름
        String otherChar = input.substring(1,input.length()); // 나머지 문자 자름
        String totalString = firstChar.toUpperCase() + otherChar;
        return totalString; // 첫번째 문자 대문자로 바꾸고 나머지랑 붙임.
        
		}
	
	public int findChar(String input, char one) {
		
		// 문자열안에 찾을 숫자가 몇개 있는지 개수 반환
        int count =0;
        for(int i =0; i< input.length(); i++) {
            if (one == input.charAt(i)){
                count++;
            }
        }
        return  count;
	}
	
	

}
