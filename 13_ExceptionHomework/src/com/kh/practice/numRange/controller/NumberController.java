package com.kh.practice.numRange.controller;

import com.kh.practice.numRange.exception.NumRangeException;

public class NumberController {

	public NumberController() {
		
	}
	
	public boolean checkDouble(int num1, int num2) throws NumRangeException{
		if((num1>0 && num1<=100)&&(num2>0 && num2<=100)) {
			if(num1%num2 == 0) {
				return true;
			}return false;
		}
		else {
			throw new NumRangeException("1���� 100 ������ ���� �ƴմϴ�."); 
			
		}
	}
}
