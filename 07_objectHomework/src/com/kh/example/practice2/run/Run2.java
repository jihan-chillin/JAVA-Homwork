package com.kh.example.practice2.run;

import com.kh.example.practice2.model.vo.Product;

public class Run2 {
	public static void main (String[] args) {
		
		Product p = new Product();
		p.setpName("오즈위고 트리플블랙");
		p.setPrice(135000);
		p.setBrand("아디다스");
		p.information();
	}
	

}
