package com.uni;

import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] arr = new Student[3];
		
		// Student 정보 저장하기 
		for(int i = 0 ; i<arr.length; i++) {		
			System.out.println("===="+(i+1)+"번째 학생정보====");
			arr[i] = new Student();	// 이걸써줘야 다음 행 껄 사용할 수 있음.***
			System.out.print("이름 : ");
			arr[i].setName(sc.next());
			System.out.print("나이 : ");
			arr[i].setAge(sc.nextInt());
			System.out.print("키 : ");
			arr[i].setHeight(sc.nextInt());
			System.out.print("몸무게 : ");
			arr[i].setWeight(sc.nextInt());
			System.out.print("과목 : ");
			arr[i].setMajor(sc.next());
			System.out.print("학번 : ");
			arr[i].setNumber(sc.next());
			
		}
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i].printInformation());
			
		}
	}

}
