package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	public void practice1() {
		// 1. �� ���� �� �Է¹ޱ�.
		// 2. 1���� �Է¹��� �������� ���ڵ� ��� ����ϱ� 
		Scanner sc = new Scanner(System.in);
		System.out.println("�� 1 �̻��� ���ڸ� �Է����ּ���.");
		int num = sc.nextInt();
		
		for(int i =1 ; i<=num ; i++) {
			System.out.print(i+" ");
		}
	}
	public void practice2() {
		// 1. �� ���� �� �Է¹ޱ�.
		// 2. 1 �̸��� ���� �Է� ���� ��� "
		//    "1 �̻��� ���ڸ� �Է����ּ���" ��� + �ٽ� ����ڰ� ���� �Է��� �� �ֵ���.
		// 3. 1���� �Է¹��� �������� ���ڵ� ��� ����ϱ�.
		Scanner sc = new Scanner(System.in);
		System.out.println("�� 1 �̻��� ���ڸ� �Է����ּ���.");
		int num = sc.nextInt();
		
		if (num>0) {
			for(int i = 1; i <= num; i++) {
				System.out.print(i+" ");
			}
		}
		else {practice2();}
		
	}
	
	public void practice3() {
		// 1. �� ���� ���� �Է¹޾� �� ������ 1���� �Ųٷ� ����Ѵ�.
		Scanner sc = new Scanner(System.in);
		System.out.println("�� 1 �̻��� ���ڸ� �Է����ּ���.");
		int num = sc.nextInt();
		
		for(int i = num ; i>=1 ; i--) {
			System.out.print(i+" ");
		}	
	}
	public void practice4() {
		// 1. �� ���� ���� �Է¹޾� �� ������ 1���� �Ųٷ� ����Ѵ�.
		// 2. �Է¹��� ���� 1 �̸��� ��쿣 
		//	  " 1 �̻��� ���ڸ� �Է����ּ���." ��� �� 1�� ���� ��Ǯ��
			
				Scanner sc = new Scanner(System.in);
				System.out.println("�� 1 �̻��� ���ڸ� �Է����ּ���.");
				int num = sc.nextInt();
				
				if (num>0) {
					for(int i = num ; i>=1 ; i--) {
					System.out.print(i+" ");
					} 
				}
				else practice4();
	}
	public void practice5() {
		// 1. 1���� �Է¹��� �������� �������� ���
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� �ϳ��� �Է��ϼ��� ");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i=1; i<=num; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	public void practice6() {
		// 1. �ΰ��� ���� �Է¹޾� �� ������ ���ڸ� ��� ���/
		// 2. 1�̸��� ���ڰ� �Էµƴٸ�, "1�̻��� ���ڸ� �Է����ּ���" ���
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ù ��° ����");
		int num1 = sc.nextInt();
		System.out.println("�� �� ��° ����");
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
		else System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
	}
	public void practice7() {
		// 1. �ΰ��� ���� �Է¹޾� �� ������ ���ڸ� ��� ���/
		// 2. 1�̸��� ���ڰ� �Էµƴٸ�, 
		//    "1�̻��� ���ڸ� �Է����ּ���" ��� + 1�� ���� �ݺ�
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ù ��° ����");
		int num1 = sc.nextInt();
		System.out.println("�� �� ��° ����");
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
		else { System.out.println("1 �̻��� ���ڸ� �Է��ϼ���."); practice7(); }
	}
	public void practice8() {
		// 1. �Է¹��� ������ �� ���.
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���ڸ� �Է��Ͻÿ�.");
		int num = sc.nextInt();
		int res;
		
		System.out.println("==== "+num+"�� ====");
		for(int i=1; i<=9; i++) {
			res = num*i;
			System.out.println(num+" * "+i+" = "+
			res);
		}
	}
	public void practice9() {
		// 1. ���� �Է¹ޱ�
		// 2. �Է¹��� ������ �� ���� 9�ܱ��� ���
		// 3. 9�� �ʰ��ϴ� ���ڰ� ������ "9 ������ ���ڸ� �Է����ּ���" ���
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���ڸ� �Է��Ͻÿ�.");
		int num = sc.nextInt();
		int res;
		
		if(num<=9) {
			for(int i=num; i<=9; i++ ) {
				System.out.println("==== "+i+"�� ====");
				for(int j=1; j<=9; j++) {
					res = i*j;
					System.out.println(i+" * "+j+" = "+res);
				}
			}
		}
		else System.out.println("9 ������ ���ڸ� �Է����ּ���.");
	}
	public void practice10() {
		// 1. ���� �Է¹ޱ�
		// 2. �Է¹��� ������ �� ���� 9�ܱ��� ���
		// 3. 9�� �ʰ��ϴ� ���ڰ� ������ 
		//    "9 ������ ���ڸ� �Է����ּ���" ��� + 1,2������ �ݺ�
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���ڸ� �Է��Ͻÿ�.");
		int num = sc.nextInt();
		int res;
		
		if(num<=9) {
			for(int i=num; i<=9; i++ ) {
				System.out.println("==== "+i+"�� ====");
				for(int j=1; j<=9; j++) {
					res = i*j;
					System.out.println(i+" * "+j+" = "+res);
				}
			}
		}
		else { System.out.println("9 ������ ���ڹ� �Է��ϼ���."); practice10(); }
	}
	public void practice11() {
		// 1. ������ �Է¹޴´�.
		// 2. �����Ѱ����� ���ڰ� Ŀ���ų� �۾����� ���α׷��� �����ض�. ( ��µǴ� ���� �� 10�� )
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���ۼ��ڸ� �Է����ּ���.");
		int num = sc.nextInt();
		System.out.println("�� ������ �Է����ּ���.");
		int cd = sc.nextInt();
		int res;
		
		for(int i =0; i<10; i++) {
			res = num + cd*i;
			System.out.print(res+" ");
		}
	}
	public void practice12() {
		// 1. ���� 2�� �Է¹ޱ�
		// 2. �����ڸ� �Է¹ޱ� --> �Է¹��� ������ �����ڿ� ���� ��� ���
		// 3. ������ �Է¿� exit��� ���� �ֱ� ������ ���ѹݺ�.
		// 4. exit�� �Է¹����� "���α׷��� �����մϴ�." ����ϰ� ����
		// 5. �����ڰ� �������̸鼭 �ι�° ������ 0�� ��� 
		//    "0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���." ���
		// 6. ���� �����ڰ� ���� �� "���� ������ �Դϴ�. �ٽ� �Է����ּ���" ���
		// 5, 6���� ��� ��� ó������ ���ư� ����ڰ� �ٽ� �����ں��� �Է��ϵ��� �ϱ�.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� �����ڸ� �Է��Ͻÿ�.(+, -, *, /, %)");
		String op = sc.next();	
		
		System.out.println("�� ù ��° ���ڸ� �Է��Ͻÿ�.");
		int num1 = sc.nextInt();
		System.out.println("�� �� ��° ���ڸ� �Է��Ͻÿ�.");
		int num2 = sc.nextInt();
			
			if(op.equals("/") && num2 == 0) {
				System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���"); practice12();
			}
			
			switch(op) {
			
			case "+" :{ System.out.println(num1+" + "+num2+" = "+(num1+num2)); practice12();} break;
			case "-" :{ System.out.println(num1+" - "+num2+" = "+(num1-num2)); practice12();} break;
			case "*" :{ System.out.println(num1+" * "+num2+" = "+(num1*num2)); practice12();} break;
			case "/" :{ System.out.println(num1+" / "+num2+" = "+(num1/num2)); practice12();} break;
			case "%" :{ System.out.println(num1+" % "+num2+" = "+(num1%num2)); practice12();} break;
			case "exit" : System.out.println("���α׷��� �����մϴ�."); break;
			default : { System.out.println("���� �������Դϴ�. �ٽ� �Է����ּ���"); practice12();}
			}
		
	}
	
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ������ �Է��Ͻÿ�.");
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
		System.out.println("�� ������ �Է��Ͻÿ�.");
		int num = sc.nextInt();	
		
		for(int i =num-1; i>=0;i--) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
	}
}

