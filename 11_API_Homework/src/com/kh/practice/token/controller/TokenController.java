package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	
	public TokenController() {
		// TODO Auto-generated constructor stub
	}
	
	public String afterToken(String str) {
		
		// ������ ��ū���� ó�� -> ���ڿ� ��ȯ
        String replaceStr = str.replace(" ","");
        return replaceStr;
		
	}
	
	public String firstCap(String input) {
		
		// �Ű������� �޾ƿ� input�� ù ��° ���ڸ� �빮�ڷ� �ٲ� ���ڿ� ��ȯ.
		
		String firstChar = input.substring(0,1); // ù��° ���ڸ� �ڸ�
        String otherChar = input.substring(1,input.length()); // ������ ���� �ڸ�
        String totalString = firstChar.toUpperCase() + otherChar;
        return totalString; // ù��° ���� �빮�ڷ� �ٲٰ� �������� ����.
        
		}
	
	public int findChar(String input, char one) {
		
		// ���ڿ��ȿ� ã�� ���ڰ� � �ִ��� ���� ��ȯ
        int count =0;
        for(int i =0; i< input.length(); i++) {
            if (one == input.charAt(i)){
                count++;
            }
        }
        return  count;
	}
	
	

}
