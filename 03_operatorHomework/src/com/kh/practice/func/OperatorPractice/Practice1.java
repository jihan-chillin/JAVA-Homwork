package com.kh.practice.func.OperatorPractice;

import java.util.Scanner;

public class Practice1 {
	// 키보드로 입력 받은 하나의 정수가 양수이면 "양수다", 아니면 "양수가 아니다" 출력
	public void practice1() {
		System.out.println("정수 입력 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(num>0 ? "양수다" : "양수가 아니다.");
	}
	//키보드로 입력 받은 하나의 정수가 양수이면 "양수다", 아닌 경우 중 0이면 "0이다." "음수다" 출력
	public void practice2() {
		System.out.println("정수 입력 : ");
		Scanner sc = new Scanner(System.in);
		int num2 = sc.nextInt();
		System.out.println(num2>0 ? "양수다" : num2 == 0 ? "0이다." : "음수다.");
	}
	// 키보드로 입력받은 하나의 정수가 짝수이면 "짝수다", 아니면 "홀수다"
	public void practice3() {
		System.out.println("정수 입력 : ");
		Scanner sc = new Scanner(System.in);
		int num3 = sc.nextInt();
		System.out.println(num3%2 == 0 ? "짝수다" : "홀수다");
}
	public void practice4() {
		// 인원 수와 사탕 개수를 입력받는다.
		// 1인당 동일하게 나눠가진 사탕 개수와 나워주고 남은 사탕의 개수를 출력해라.
		Scanner sc = new Scanner(System.in);
		System.out.println("인원 수를 입력하시오");
		int people = sc.nextInt();
		System.out.println("사탕 개수를 입력하시오");
		int candy = sc.nextInt();
		System.out.println("1인당 사탕개수 : "+ candy/people);
		System.out.println("남은 사탕개수 : "+ candy%people);
		
	}
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름이 뭔가요?");
		String name = sc.next();
		System.out.println("몇 학년인가요?");
		int grade = sc.nextInt();
		System.out.println("몇 반인가요?");
		int cl = sc.nextInt();
		System.out.println("몇 번인가요?");
		int num = sc.nextInt();
		System.out.println("본인의 성별은? (F/M)");
		char gender = sc.next().charAt(0);
		
		System.out.println("당신의 성적은?");
		double score = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 ", grade, cl, num);
		System.out.println((gender == 'F'?"여학생":"남학생")+"의 성적은 "+score+"이다.");
	
	}
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 나이는?");
		int age = sc.nextInt();
		System.out.println(age>19 ? "성인" : age<=13 ? "어린이" : "청소년");
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("▽ 당신의 국어점수를 입력하시오.");
		int korean = sc.nextInt();
		System.out.println("▽ 당신의 수학점수를 입력하시오.");
		int math = sc.nextInt();
		System.out.println("▽ 당신의 영어점수를 입력하시오.");
		int english = sc.nextInt();
		
		int sum = korean+math+english;
		int avr = (korean+math+english)/3;
		System.out.println("합계 : " + sum );
		System.out.println("평균 : " + avr);
		System.out.println(korean>=40 &&math>=40 && english>=40 ? "합격" : "불합격" );
		}
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요 (- 포함)");
		char gender = sc.next().charAt(7);
		System.out.println(gender == '2' ? "여자" : "남자");
	}
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.println("▽ 첫 번째 정수를 입력하시오.");
		int num1 = sc.nextInt();
		System.out.println("▽ 두 번째 정수를 입력하시오.");
		int num2 = sc.nextInt();
		System.out.println("▽ 세 번째 정수를 입력하시오.");
		int num = sc.nextInt();
		System.out.println(num<=num1||num2<num ? "true" : "false");
	
	}
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("▽ 첫 번째 정수를 입력하시오.");
		int num1 = sc.nextInt();
		System.out.println("▽ 두 번째 정수를 입력하시오.");
		int num2 = sc.nextInt();
		System.out.println("▽ 세 번째 정수를 입력하시오.");
		int num = sc.nextInt();
		System.out.println(num1 == num2&& num2 == num ? "true" : "false");
		
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.println("▽ A의 연봉 : ");
		double num1 = sc.nextDouble();
		double salaryA = num1*0.4 + num1;
		System.out.println("▽ B의 연봉 : ");
		double num2 = sc.nextDouble();
		System.out.println("▽ C의 연봉 : ");
		double num = sc.nextDouble();
		double salaryC = num*0.15 +num;
		
		System.out.printf("연봉 / 연봉+인센티브 : %.0f/%.1f \n", num1, salaryA);
		System.out.println(salaryA>=3000 ? " 연봉 3000이상" : " 연봉 3000 미만");
		System.out.printf("연봉 / 연봉+인센티브 : %.0f/%.1f \n", num2, num2);
		System.out.println(num2>=3000 ? " 연봉 3000이상" : " 연봉 3000 미만");
		System.out.printf("연봉 / 연봉+인센티브 : %.0f/%.1f \n", num, salaryC);
		System.out.println(salaryC>=3000 ? " 연봉 3000이상" : " 연봉 3000 미만");
	}
	

}

