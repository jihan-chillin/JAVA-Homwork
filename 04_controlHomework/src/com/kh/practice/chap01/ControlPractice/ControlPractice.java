package com.kh.practice.chap01.ControlPractice;

import java.util.Scanner;

public class ControlPractice {

	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\t(보기)에서 메뉴를 선택하시오");
		System.out.println("============== (보기) ==============");
		System.out.println("1. 입력\t2. 수정\t3.조회\t4. 삭제\t7. 종료");
		int menu = sc.nextInt();
		switch(menu) {
		case 1 : System.out.println("입력메뉴입니다."); break;
		case 2 : System.out.println("수정메뉴입니다."); break;
		case 3 : System.out.println("조회메뉴입니다."); break;
		case 4 : System.out.println("삭제메뉴입니다."); break;
		default : System.out.println("프로그램을 종료합니다.");
		}
		
	}
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("▽ 정수를 입력하세요.");
		int num = sc.nextInt();
		if(num>0) {
			if(num % 2 == 0) System.out.println("짝수다");
			else System.out.println("홀수다.");
		}
		else
			System.out.println("음수다.");
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("▽ 국어점수를 입력하시오.");
		double korean = sc.nextDouble();
		System.out.println("▽ 영어점수를 입력하시오.");
		double english = sc.nextDouble();
		System.out.println("▽ 수학점수를 입력하시오.");
		double math = sc.nextDouble();
		
		double sum = korean+english+math;
		double avg = sum/3;
		if(avg>=60 && korean>=40 && english>=40 && math>=40) {
			System.out.println("합계 : "+(int)sum);
			System.out.println("평균 : "+avg);
			System.out.println("축하합니다. 합격입니다!");
		}
		else System.out.println("불합격입니다.");
	}
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 월인가요?");
		int month = sc.nextInt();
		switch(month) {
		case 12 : System.out.println("겨울"); break;
		case 1 : System.out.println("겨울"); break;
		case 2 : System.out.println("겨울"); break;
		
		case 3 : System.out.println("봄"); break;
		case 4 : System.out.println("봄"); break;
		case 5 : System.out.println("봄"); break;
		
		case 6 : System.out.println("여름"); break;
		case 7 : System.out.println("여름"); break;
		case 8 : System.out.println("여름"); break;
		
		case 9 : System.out.println("가을"); break;
		case 10 : System.out.println("가을"); break;
		case 11 : System.out.println("가을"); break;
		
		default : System.out.println(month+"월은 잘못 입력된 달입니다.");
		}
		
	}
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("==== 로그인 ====");
		System.out.println("▽ 아이디를 입력하세요.");
		String id = sc.next();
		System.out.println("▽ 비밀번호를 입력하세요.");
		String password = sc.next();
		
		if(id.equals("kimjihan77") && password.equals("1234")) {
			System.out.println("로그인 성공!");
		}
		else if(id.equals("kimjihan77") && password != "1234") {
			System.out.println("비밀번호가 틀렸습니다.");
		}
		else if(id != "kimjihan77" && password.equals("1234")) {
			System.out.println("비밀번호가 틀렸습니다.");
		}
		else System.out.println("입력하신 아이디와 비밀번호가 존재하지 않습니다.");
	}
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 등급은?");
		System.out.println("1. 관리자\t2. 회원\t3. 비회원");
		int grade = sc.nextInt();
		if(grade == 1) {
			System.out.println("권한을 확인하고자 하는 회원 등급 : 관리자");
			System.out.println("회원관리, 게시글 관리, 게시글 작성, 댓글 작성, 게시글 조회");	
		}
		else if(grade == 2) {
			System.out.println("권한을 확인하고자 하는 회원 등급 : 회원");
			System.out.println("게시글 작성, 댓글 작성, 게시글 조회");
		}
		else {
			System.out.println("권한을 확인하고자 하는 회원 등급 : 비회원");
			System.out.println("게시글 조회");			
		}		
	}
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("==== BMI지수 ====");
		System.out.println("▽ 키(m)를 입력하세요.");
		double height = sc.nextDouble();
		System.out.println("▽ 몸무게(kg)를 입력하세요.");
		double weight = sc.nextDouble();
		
		double bmi = weight/(height*height);
		if(bmi<18.5) {
			System.out.println("저체중입니다.");
		}
		else if(bmi>=18.5 && bmi<23) {
			System.out.println("정상체중입니다.");
		}
		else if(bmi>=23 && bmi<25) {
			System.out.println("과체중입니다.");
		}
		else if(bmi>=25 && bmi<30) {
			System.out.println("비만입니다.");
		}
		else System.out.println("고도비만입니다.");
	}
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 개의 정수를 입력하시오.");
		int num = sc.nextInt();
		int num1 = sc.nextInt();
		if(num>0 && num1>0) {
			System.out.println("연산자를 입력하시오(+, -, *, /, %)");
			char cal = sc.next().charAt(0);
			if(cal == '+') {
				System.out.println(num+num1);
			}
			else if(cal == '-') {
				System.out.println(num-num1);
			}
			else if(cal == '*') {
				System.out.println(num*num1);
			}
			else if(cal == '/') {
				System.out.println(num/num1);
			}
			else System.out.println(num%num1);
		}
		else System.out.println("잘못 입력하셨습니다.");
	}
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.println("▽ 중간고사 점수를 입력하시오.");
		double mid = sc.nextDouble(); 
		System.out.println("▽ 기말고사 점수를 입력하시오.");
		double fin = sc.nextDouble(); 
		System.out.println("▽ 과제 점수를 입력하시오.");
		double task = sc.nextDouble(); 
		System.out.println("▽ 출석 회수를 입력하시오.");
		double attendance = sc.nextDouble(); 
		
		mid *= 0.2; 
		fin *= 0.3;
		task *= 0.3;
	
		double score = mid + fin + task + attendance;
		
		if(score>=70 && attendance>=15) {
			System.out.println("============== 결과 ==============");
			System.out.println("중간고사 점수(20) : " + mid);
			System.out.println("기말고사 점수(30) : " + fin);
			System.out.println("과제 점수\t(30) : " + task);
			System.out.println("출석 점수\t(20) : " + attendance);
			System.out.println("총점 : " + score);
			System.out.println("Pass");
		}
		else if(score<70 && attendance>=15) {
			System.out.println("총점 : " + score);
			System.out.println("============== 결과 ==============");
			System.out.println("중간고사 점수(20) : " + mid);
			System.out.println("기말고사 점수(30) : " + fin);
			System.out.println("과제 점수\t(30) : " + task);
			System.out.println("출석 점수\t(20) : " + attendance);
			System.out.println("총점 : " + score);
			System.out.println("Fail [ 점수 미달 ]");
		}
		else if (attendance<15) {
			System.out.println("============== 결과 ==============");
			System.out.println("Fail [출석 회수 부족 ("+(int)attendance+"/20) ]");
		}
	}
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("============== 보기 ==============");
		System.out.println("1. 메뉴출력\n2. 짝수/홀수\n3. 합격/불합격\n4. 계절\n5. 로그인\n6. 권한 확인\n7. BMI\n8. 계산기\n9. P/F");
		System.out.println("\n실행할 기능을 선택하세요.");
		
		int func = sc.nextInt();
		
		switch(func) {
		case 1: System.out.println("선택 : 메뉴 출력 (실습문제"+func+" 실행)"); break;
		case 2: System.out.println("선택 : 짝수/홀수 (실습문제"+func+" 실행)"); break;
		case 3: System.out.println("선택 : 합격/불합격 (실습문제"+func+" 실행)"); break;
		case 4: System.out.println("선택 : 계절 (실습문제"+func+" 실행)"); break;
		case 5: System.out.println("선택 : 로그인 출력 (실습문제"+func+" 실행)"); break;
		case 6: System.out.println("선택 : 권한 확인 (실습문제"+func+" 실행)"); break;
		case 7: System.out.println("선택 : BMI (실습문제"+func+" 실행)"); break;
		case 8: System.out.println("선택 : 계산기 (실습문제"+func+" 실행)"); break;
		default: System.out.println("선택 : P/F (실습문제"+func+" 실행)"); break;
		}
	}
}

