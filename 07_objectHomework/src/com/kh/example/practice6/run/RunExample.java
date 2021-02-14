package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.*;

public class RunExample {
	
	public static void main(String[] args) {
		Book b = new Book();
		Book b1 =  new Book("낸시파머", 13500, 4);
		Book b2 = new Book("자바의 정석","도우출판사","남궁성",20000,0.2);

		
		//inform() Book객체의 내용을 출력하자.
		b1.inform1();
		b2.inform2();
		
		
	}

}
