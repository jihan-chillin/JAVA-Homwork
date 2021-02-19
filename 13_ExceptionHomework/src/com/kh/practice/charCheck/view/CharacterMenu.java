package com.kh.practice.charCheck.view;

import java.util.Scanner;

import com.kh.practice.charCheck.controller.CharacterController;
import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterMenu {
	
	public void menu() {
		CharacterController cc = new CharacterController();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("¹®ÀÚ¿­ : ");
		String str = sc.nextLine();
		
		try {
			System.out.println(cc.countAlpha(str));
		}catch(CharCheckException e) {
			e.printStackTrace();
		}
	}

}
