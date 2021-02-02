package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	public void practice1() {
		// 1. 한 개의 값 입력받기.
		// 2. 1부터 입력받은 값까지의 숫자들 모두 출력하기 
		Scanner sc = new Scanner(System.in);
		System.out.println("▽ 1 이상의 숫자를 입력해주세요.");
		int num = sc.nextInt();
		
		for(int i =1 ; i<=num ; i++) {
			System.out.print(i+" ");
		}
	}
	public void practice2() {
		// 1. 한 개의 값 입력받기.
		// 2. 1 미만의 값을 입력 받을 경우 "
		//    "1 이상의 숫자를 입력해주세요" 출력 + 다시 사용자가 값을 입력할 수 있도록.
		// 3. 1부터 입력받은 값까지의 숫자들 모두 출력하기.
		Scanner sc = new Scanner(System.in);
		System.out.println("▽ 1 이상의 숫자를 입력해주세요.");
		int num = sc.nextInt();
		
		if (num>0) {
			for(int i = 1; i <= num; i++) {
				System.out.print(i+" ");
			}
		}
		else {practice2();}
		
	}
	
	public void practice3() {
		// 1. 한 개의 값을 입력받아 그 값부터 1까지 거꾸로 출력한다.
		Scanner sc = new Scanner(System.in);
		System.out.println("▽ 1 이상의 숫자를 입력해주세요.");
		int num = sc.nextInt();
		
		for(int i = num ; i>=1 ; i--) {
			System.out.print(i+" ");
		}	
	}
	public void practice4() {
		// 1. 한 개의 값을 입력받아 그 값부터 1까지 거꾸로 출력한다.
		// 2. 입력받은 값이 1 미만일 경우엔 
		//	  " 1 이상의 숫자를 입력해주세요." 출력 후 1번 과정 되풀이
			
				Scanner sc = new Scanner(System.in);
				System.out.println("▽ 1 이상의 숫자를 입력해주세요.");
				int num = sc.nextInt();
				
				if (num>0) {
					for(int i = num ; i>=1 ; i--) {
					System.out.print(i+" ");
					} 
				}
				else practice4();
	}
	public void practice5() {
		// 1. 1부터 입력받은 수까지의 정수합을 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("▽ 정수 하나를 입력하세요 ");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i=1; i<=num; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	public void practice6() {
		// 1. 두개의 값을 입력받아 그 사이의 숫자를 모두 출력/
		// 2. 1미만의 숫자가 입력됐다면, "1이상의 숫자를 입력해주세요" 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("▽ 첫 번째 숫자");
		int num1 = sc.nextInt();
		System.out.println("▽ 두 번째 숫자");
		int num2 = sc.nextInt();
		
		if(num1>0 && num2>0 && num1<num2) {
			for(int i = num1 ; i<=num2 ; i++) {
				System.out.print(i+" ");
			}
		}
		else if(num1>0 && num2>0 && num2<num1) {
			for(int i = num2 ; i<=num1 ; i++) {
				System.out.print(i+" ");
			}
		}
		else System.out.println("1 이상의 숫자를 입력해주세요.");
	}
	public void practice7() {
		// 1. 두개의 값을 입력받아 그 사이의 숫자를 모두 출력/
		// 2. 1미만의 숫자가 입력됐다면, 
		//    "1이상의 숫자를 입력해주세요" 출력 + 1번 과정 반복
		
		Scanner sc = new Scanner(System.in);
		System.out.println("▽ 첫 번째 숫자");
		int num1 = sc.nextInt();
		System.out.println("▽ 두 번째 숫자");
		int num2 = sc.nextInt();
		
		if(num1>0 && num2>0 && num1<num2) {
			for(int i = num1 ; i<=num2 ; i++) {
				System.out.print(i+" ");
			}
		}
		else if(num1>0 && num2>0 && num2<num1) {
			for(int i = num2 ; i<=num1 ; i++) {
				System.out.print(i+" ");
			}
		}
		else { System.out.println("1 이상의 숫자를 입력하세요."); practice7(); }
	}
	public void practice8() {
		// 1. 입력받은 숫자의 단 출력.
		Scanner sc = new Scanner(System.in);
		System.out.println("▽ 숫자를 입력하시오.");
		int num = sc.nextInt();
		int res;
		
		System.out.println("==== "+num+"단 ====");
		for(int i=1; i<=9; i++) {
			res = num*i;
			System.out.println(num+" * "+i+" = "+
			res);
		}
	}
	public void practice9() {
		// 1. 숫자 입력받기
		// 2. 입력받은 숫자의 단 부터 9단까지 출력
		// 3. 9를 초과하는 숫자가 들어오면 "9 이하의 숫자만 입력해주세요" 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("▽ 숫자를 입력하시오.");
		int num = sc.nextInt();
		int res;
		
		if(num<=9) {
			for(int i=num; i<=9; i++ ) {
				System.out.println("==== "+i+"단 ====");
				for(int j=1; j<=9; j++) {
					res = i*j;
					System.out.println(i+" * "+j+" = "+res);
				}
			}
		}
		else System.out.println("9 이하의 숫자만 입력해주세요.");
	}
	public void practice10() {
		// 1. 숫자 입력받기
		// 2. 입력받은 숫자의 단 부터 9단까지 출력
		// 3. 9를 초과하는 숫자가 들어오면 
		//    "9 이하의 숫자만 입력해주세요" 출력 + 1,2번과정 반복
		Scanner sc = new Scanner(System.in);
		System.out.println("▽ 숫자를 입력하시오.");
		int num = sc.nextInt();
		int res;
		
		if(num<=9) {
			for(int i=num; i<=9; i++ ) {
				System.out.println("==== "+i+"단 ====");
				for(int j=1; j<=9; j++) {
					res = i*j;
					System.out.println(i+" * "+j+" = "+res);
				}
			}
		}
		else { System.out.println("9 이하의 숫자민 입력하세요."); practice10(); }
	}
	public void practice11() {
		// 1. 공차를 입력받는다.
		// 2. 일정한값으로 숫자가 커지거나 작아지는 프로그램을 구현해라. ( 출력되는 숫자 총 10개 )
		Scanner sc = new Scanner(System.in);
		System.out.println("▽ 시작숫자를 입력해주세요.");
		int num = sc.nextInt();
		System.out.println("▽ 공차를 입력해주세요.");
		int cd = sc.nextInt();
		int res;
		
		for(int i =0; i<10; i++) {
			res = num + cd*i;
			System.out.print(res+" ");
		}
	}
	public void practice12() {
		// 1. 정수 2개 입력받기
		// 2. 연산자를 입력받기 --> 입력받은 정수를 연산자에 따른 결과 출력
		// 3. 연산자 입력에 exit라는 값을 넣기 전까진 무한반복.
		// 4. exit을 입력받으면 "프로그램을 종료합니다." 출력하고 종료
		// 5. 연산자가 나누기이면서 두번째 정수가 0일 경우 
		//    "0으로 나눌 수 없습니다. 다시 입력해주세요." 출력
		// 6. 없는 연산자가 들어올 시 "없는 연산자 입니다. 다시 입력해주세요" 출력
		// 5, 6번의 경우 모두 처음으로 돌아가 사용자가 다시 연산자부터 입력하도록 하기.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("▽ 연산자를 입력하시오.(+, -, *, /, %)");
		String op = sc.next();	
		
		System.out.println("▽ 첫 번째 숫자를 입력하시오.");
		int num1 = sc.nextInt();
		System.out.println("▽ 두 번째 숫자를 입력하시오.");
		int num2 = sc.nextInt();
			
			if(op.equals("/") && num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요"); practice12();
			}
			
			switch(op) {
			
			case "+" :{ System.out.println(num1+" + "+num2+" = "+(num1+num2)); practice12();} break;
			case "-" :{ System.out.println(num1+" - "+num2+" = "+(num1-num2)); practice12();} break;
			case "*" :{ System.out.println(num1+" * "+num2+" = "+(num1*num2)); practice12();} break;
			case "/" :{ System.out.println(num1+" / "+num2+" = "+(num1/num2)); practice12();} break;
			case "%" :{ System.out.println(num1+" % "+num2+" = "+(num1%num2)); practice12();} break;
			case "exit" : System.out.println("프로그램을 종료합니다."); break;
			default : { System.out.println("없는 연산자입니다. 다시 입력해주세요"); practice12();}
			}
		
	}
	
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.println("▽ 정수를 입력하시오.");
		int num = sc.nextInt();	
		
		for(int i =1; i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	public void practice14() {
		Scanner sc = new Scanner(System.in);
		System.out.println("▽ 정수를 입력하시오.");
		int num = sc.nextInt();	
		
		for(int i =num-1; i>=0;i--) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
	}
}

