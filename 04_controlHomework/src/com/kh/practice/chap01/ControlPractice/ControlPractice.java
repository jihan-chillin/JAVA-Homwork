package com.kh.practice.chap01.ControlPractice;

import java.util.Scanner;

public class ControlPractice {

	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\t(����)���� �޴��� �����Ͻÿ�");
		System.out.println("============== (����) ==============");
		System.out.println("1. �Է�\t2. ����\t3.��ȸ\t4. ����\t7. ����");
		int menu = sc.nextInt();
		switch(menu) {
		case 1 : System.out.println("�Է¸޴��Դϴ�."); break;
		case 2 : System.out.println("�����޴��Դϴ�."); break;
		case 3 : System.out.println("��ȸ�޴��Դϴ�."); break;
		case 4 : System.out.println("�����޴��Դϴ�."); break;
		default : System.out.println("���α׷��� �����մϴ�.");
		}
		
	}
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ������ �Է��ϼ���.");
		int num = sc.nextInt();
		if(num>0) {
			if(num % 2 == 0) System.out.println("¦����");
			else System.out.println("Ȧ����.");
		}
		else
			System.out.println("������.");
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���������� �Է��Ͻÿ�.");
		double korean = sc.nextDouble();
		System.out.println("�� ���������� �Է��Ͻÿ�.");
		double english = sc.nextDouble();
		System.out.println("�� ���������� �Է��Ͻÿ�.");
		double math = sc.nextDouble();
		
		double sum = korean+english+math;
		double avg = sum/3;
		if(avg>=60 && korean>=40 && english>=40 && math>=40) {
			System.out.println("�հ� : "+(int)sum);
			System.out.println("��� : "+avg);
			System.out.println("�����մϴ�. �հ��Դϴ�!");
		}
		else System.out.println("���հ��Դϴ�.");
	}
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���ΰ���?");
		int month = sc.nextInt();
		switch(month) {
		case 12 : System.out.println("�ܿ�"); break;
		case 1 : System.out.println("�ܿ�"); break;
		case 2 : System.out.println("�ܿ�"); break;
		
		case 3 : System.out.println("��"); break;
		case 4 : System.out.println("��"); break;
		case 5 : System.out.println("��"); break;
		
		case 6 : System.out.println("����"); break;
		case 7 : System.out.println("����"); break;
		case 8 : System.out.println("����"); break;
		
		case 9 : System.out.println("����"); break;
		case 10 : System.out.println("����"); break;
		case 11 : System.out.println("����"); break;
		
		default : System.out.println(month+"���� �߸� �Էµ� ���Դϴ�.");
		}
		
	}
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("==== �α��� ====");
		System.out.println("�� ���̵� �Է��ϼ���.");
		String id = sc.next();
		System.out.println("�� ��й�ȣ�� �Է��ϼ���.");
		String password = sc.next();
		
		if(id.equals("kimjihan77") && password.equals("1234")) {
			System.out.println("�α��� ����!");
		}
		else if(id.equals("kimjihan77") && password != "1234") {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		}
		else if(id != "kimjihan77" && password.equals("1234")) {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		}
		else System.out.println("�Է��Ͻ� ���̵�� ��й�ȣ�� �������� �ʽ��ϴ�.");
	}
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("����� �����?");
		System.out.println("1. ������\t2. ȸ��\t3. ��ȸ��");
		int grade = sc.nextInt();
		if(grade == 1) {
			System.out.println("������ Ȯ���ϰ��� �ϴ� ȸ�� ��� : ������");
			System.out.println("ȸ������, �Խñ� ����, �Խñ� �ۼ�, ��� �ۼ�, �Խñ� ��ȸ");	
		}
		else if(grade == 2) {
			System.out.println("������ Ȯ���ϰ��� �ϴ� ȸ�� ��� : ȸ��");
			System.out.println("�Խñ� �ۼ�, ��� �ۼ�, �Խñ� ��ȸ");
		}
		else {
			System.out.println("������ Ȯ���ϰ��� �ϴ� ȸ�� ��� : ��ȸ��");
			System.out.println("�Խñ� ��ȸ");			
		}		
	}
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("==== BMI���� ====");
		System.out.println("�� Ű(m)�� �Է��ϼ���.");
		double height = sc.nextDouble();
		System.out.println("�� ������(kg)�� �Է��ϼ���.");
		double weight = sc.nextDouble();
		
		double bmi = weight/(height*height);
		if(bmi<18.5) {
			System.out.println("��ü���Դϴ�.");
		}
		else if(bmi>=18.5 && bmi<23) {
			System.out.println("����ü���Դϴ�.");
		}
		else if(bmi>=23 && bmi<25) {
			System.out.println("��ü���Դϴ�.");
		}
		else if(bmi>=25 && bmi<30) {
			System.out.println("���Դϴ�.");
		}
		else System.out.println("�����Դϴ�.");
	}
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� ������ �Է��Ͻÿ�.");
		int num = sc.nextInt();
		int num1 = sc.nextInt();
		if(num>0 && num1>0) {
			System.out.println("�����ڸ� �Է��Ͻÿ�(+, -, *, /, %)");
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
		else System.out.println("�߸� �Է��ϼ̽��ϴ�.");
	}
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� �߰���� ������ �Է��Ͻÿ�.");
		double mid = sc.nextDouble(); 
		System.out.println("�� �⸻��� ������ �Է��Ͻÿ�.");
		double fin = sc.nextDouble(); 
		System.out.println("�� ���� ������ �Է��Ͻÿ�.");
		double task = sc.nextDouble(); 
		System.out.println("�� �⼮ ȸ���� �Է��Ͻÿ�.");
		double attendance = sc.nextDouble(); 
		
		mid *= 0.2; 
		fin *= 0.3;
		task *= 0.3;
	
		double score = mid + fin + task + attendance;
		
		if(score>=70 && attendance>=15) {
			System.out.println("============== ��� ==============");
			System.out.println("�߰���� ����(20) : " + mid);
			System.out.println("�⸻��� ����(30) : " + fin);
			System.out.println("���� ����\t(30) : " + task);
			System.out.println("�⼮ ����\t(20) : " + attendance);
			System.out.println("���� : " + score);
			System.out.println("Pass");
		}
		else if(score<70 && attendance>=15) {
			System.out.println("���� : " + score);
			System.out.println("============== ��� ==============");
			System.out.println("�߰���� ����(20) : " + mid);
			System.out.println("�⸻��� ����(30) : " + fin);
			System.out.println("���� ����\t(30) : " + task);
			System.out.println("�⼮ ����\t(20) : " + attendance);
			System.out.println("���� : " + score);
			System.out.println("Fail [ ���� �̴� ]");
		}
		else if (attendance<15) {
			System.out.println("============== ��� ==============");
			System.out.println("Fail [�⼮ ȸ�� ���� ("+(int)attendance+"/20) ]");
		}
	}
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("============== ���� ==============");
		System.out.println("1. �޴����\n2. ¦��/Ȧ��\n3. �հ�/���հ�\n4. ����\n5. �α���\n6. ���� Ȯ��\n7. BMI\n8. ����\n9. P/F");
		System.out.println("\n������ ����� �����ϼ���.");
		
		int func = sc.nextInt();
		
		switch(func) {
		case 1: System.out.println("���� : �޴� ��� (�ǽ�����"+func+" ����)"); break;
		case 2: System.out.println("���� : ¦��/Ȧ�� (�ǽ�����"+func+" ����)"); break;
		case 3: System.out.println("���� : �հ�/���հ� (�ǽ�����"+func+" ����)"); break;
		case 4: System.out.println("���� : ���� (�ǽ�����"+func+" ����)"); break;
		case 5: System.out.println("���� : �α��� ��� (�ǽ�����"+func+" ����)"); break;
		case 6: System.out.println("���� : ���� Ȯ�� (�ǽ�����"+func+" ����)"); break;
		case 7: System.out.println("���� : BMI (�ǽ�����"+func+" ����)"); break;
		case 8: System.out.println("���� : ���� (�ǽ�����"+func+" ����)"); break;
		default: System.out.println("���� : P/F (�ǽ�����"+func+" ����)"); break;
		}
	}
}

