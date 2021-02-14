package com.kh.example.practice4.run;

import com.kh.example.practice4.model.vo.Student;

public class Run4 {
	public static void main(String[] args) {
		
		Student s = new Student();
		s.setName("±Ë¡ˆ«—");
		s.setGender('ø©');
		s.setGrade(2);
		s.setClassroom(6);
		s.setHeight(162.5);
		
		s.information();
		
	}
}
