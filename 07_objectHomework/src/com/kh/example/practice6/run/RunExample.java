package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.*;

public class RunExample {
	
	public static void main(String[] args) {
		Book b = new Book();
		Book b1 =  new Book("�����ĸ�", 13500, 4);
		Book b2 = new Book("�ڹ��� ����","�������ǻ�","���ü�",20000,0.2);

		
		//inform() Book��ü�� ������ �������.
		b1.inform1();
		b2.inform2();
		
		
	}

}
