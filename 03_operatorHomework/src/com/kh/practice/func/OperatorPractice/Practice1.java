package com.kh.practice.func.OperatorPractice;

import java.util.Scanner;

public class Practice1 {
	// Ű����� �Է� ���� �ϳ��� ������ ����̸� "�����", �ƴϸ� "����� �ƴϴ�" ���
	public void practice1() {
		System.out.println("���� �Է� : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(num>0 ? "�����" : "����� �ƴϴ�.");
	}
	//Ű����� �Է� ���� �ϳ��� ������ ����̸� "�����", �ƴ� ��� �� 0�̸� "0�̴�." "������" ���
	public void practice2() {
		System.out.println("���� �Է� : ");
		Scanner sc = new Scanner(System.in);
		int num2 = sc.nextInt();
		System.out.println(num2>0 ? "�����" : num2 == 0 ? "0�̴�." : "������.");
	}
	// Ű����� �Է¹��� �ϳ��� ������ ¦���̸� "¦����", �ƴϸ� "Ȧ����"
	public void practice3() {
		System.out.println("���� �Է� : ");
		Scanner sc = new Scanner(System.in);
		int num3 = sc.nextInt();
		System.out.println(num3%2 == 0 ? "¦����" : "Ȧ����");
}
	public void practice4() {
		// �ο� ���� ���� ������ �Է¹޴´�.
		// 1�δ� �����ϰ� �������� ���� ������ �����ְ� ���� ������ ������ ����ض�.
		Scanner sc = new Scanner(System.in);
		System.out.println("�ο� ���� �Է��Ͻÿ�");
		int people = sc.nextInt();
		System.out.println("���� ������ �Է��Ͻÿ�");
		int candy = sc.nextInt();
		System.out.println("1�δ� �������� : "+ candy/people);
		System.out.println("���� �������� : "+ candy%people);
		
	}
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� ������?");
		String name = sc.next();
		System.out.println("�� �г��ΰ���?");
		int grade = sc.nextInt();
		System.out.println("�� ���ΰ���?");
		int cl = sc.nextInt();
		System.out.println("�� ���ΰ���?");
		int num = sc.nextInt();
		System.out.println("������ ������? (F/M)");
		char gender = sc.next().charAt(0);
		
		System.out.println("����� ������?");
		double score = sc.nextDouble();
		
		System.out.printf("%d�г� %d�� %d�� ", grade, cl, num);
		System.out.println((gender == 'F'?"���л�":"���л�")+"�� ������ "+score+"�̴�.");
	
	}
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("����� ���̴�?");
		int age = sc.nextInt();
		System.out.println(age>19 ? "����" : age<=13 ? "���" : "û�ҳ�");
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ����� ���������� �Է��Ͻÿ�.");
		int korean = sc.nextInt();
		System.out.println("�� ����� ���������� �Է��Ͻÿ�.");
		int math = sc.nextInt();
		System.out.println("�� ����� ���������� �Է��Ͻÿ�.");
		int english = sc.nextInt();
		
		int sum = korean+math+english;
		int avr = (korean+math+english)/3;
		System.out.println("�հ� : " + sum );
		System.out.println("��� : " + avr);
		System.out.println(korean>=40 &&math>=40 && english>=40 ? "�հ�" : "���հ�" );
		}
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ֹι�ȣ�� �Է��ϼ��� (- ����)");
		char gender = sc.next().charAt(7);
		System.out.println(gender == '2' ? "����" : "����");
	}
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ù ��° ������ �Է��Ͻÿ�.");
		int num1 = sc.nextInt();
		System.out.println("�� �� ��° ������ �Է��Ͻÿ�.");
		int num2 = sc.nextInt();
		System.out.println("�� �� ��° ������ �Է��Ͻÿ�.");
		int num = sc.nextInt();
		System.out.println(num<=num1||num2<num ? "true" : "false");
	
	}
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ù ��° ������ �Է��Ͻÿ�.");
		int num1 = sc.nextInt();
		System.out.println("�� �� ��° ������ �Է��Ͻÿ�.");
		int num2 = sc.nextInt();
		System.out.println("�� �� ��° ������ �Է��Ͻÿ�.");
		int num = sc.nextInt();
		System.out.println(num1 == num2&& num2 == num ? "true" : "false");
		
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� A�� ���� : ");
		double num1 = sc.nextDouble();
		double salaryA = num1*0.4 + num1;
		System.out.println("�� B�� ���� : ");
		double num2 = sc.nextDouble();
		System.out.println("�� C�� ���� : ");
		double num = sc.nextDouble();
		double salaryC = num*0.15 +num;
		
		System.out.printf("���� / ����+�μ�Ƽ�� : %.0f/%.1f \n", num1, salaryA);
		System.out.println(salaryA>=3000 ? " ���� 3000�̻�" : " ���� 3000 �̸�");
		System.out.printf("���� / ����+�μ�Ƽ�� : %.0f/%.1f \n", num2, num2);
		System.out.println(num2>=3000 ? " ���� 3000�̻�" : " ���� 3000 �̸�");
		System.out.printf("���� / ����+�μ�Ƽ�� : %.0f/%.1f \n", num, salaryC);
		System.out.println(salaryC>=3000 ? " ���� 3000�̻�" : " ���� 3000 �̸�");
	}
	

}

