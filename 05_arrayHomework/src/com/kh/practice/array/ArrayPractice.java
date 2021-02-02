package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {
	public void practice1() {
		int[] arr = new int[10];
		
		for(int i =0; i<10; i++) {
			arr[i] +=(i+1);
		}
		for(int j = 0; j<10; j++) {
			System.out.print(arr[j]+" ");
		}
	}

	public void practice2() {
		
		int[] arr = new int[10];
		
		for(int i =0; i<10; i++) {
			arr[i] +=(i+1);
		}
		for(int j = 9; j>=0; j--) {
			System.out.print(arr[j]+" ");
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���ڸ� �Է��Ͻÿ�");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for(int i =0; i<size; i++) {
			arr[i] +=(i+1);
		}
		for(int j = 0; j<size; j++) {
			System.out.print(arr[j]+" ");
		}
	}
	public void practice4() {
		String[] fruits = {"���", "��", "����", "������", "����"};
		
		System.out.println(fruits[1]);
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���ڿ��� �Է��ϼ���.");
		
		String msg = sc.next();
		char[] arr = new char[msg.length()];
		
		
		// �Է¹��� ���ڿ� �ϳ��� �迭�� ����
		for(int i =0; i<arr.length; i++) {
			arr[i] = msg.charAt(i);
		}
		
		System.out.println("�� ã���� �ϴ� ���ڴ�?");
		char searchText = sc.next().charAt(0);
		
		int count =0; 		// ���� ���� ī��Ʈ���� ����
		String idx = "";	// �ε��� ��ȣ �����س��� ����
		
		for(int j = 0; j<arr.length; j++ ) {
			if(arr[j] == searchText) {
				idx +=(j+" ");
				count++;
			}
		}
		System.out.println(msg+"�� "+searchText+"�� �����ϴ� ��ġ(�ε���): "+idx);
		System.out.println(searchText+"�� ���� : "+ count);
		
	}
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		String[] day = {"��", "ȭ", "��", "��", "��", "��", "��"};
		
		System.out.println("�� �ε��� ��ȣ�� �Է��ϼ���.");
		int num = sc.nextInt();
		if(num<7) {
			System.out.println(day[num]+"����");
		}
		else System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� �迭�� ���̸� �Է��Ͻÿ�.");
		int length = sc.nextInt();
		
		int[] arr = new int[length];
		for(int i=0; i<arr.length; i++) {
			System.out.println("�� �迭"+i+"��° �ε����� ���� �� :");
			arr[i] = sc.nextInt(); 
		}
		
		int sum = 0;	// arr�������� ���� ������ ����.
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
			System.out.print(arr[i]+" ");
		}
		System.out.print("\n"+"�� �� : "+sum);
	}
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� 3�̻��� Ȧ���� �Է��ϼ���.");
		int num = sc.nextInt();
		
		if(num>=3 && num%2 ==1) {
			int[] arr = new int[num];
			for(int i = 0; i<=(num/2); i++) {
				arr[i] = (i+1);
			}
			for(int j = (num/2+1); j<num; j++) {
				arr[j] = (arr[j-1]-1);
			}
			for(int k=0; k<num; k++) {
				System.out.print(arr[k]+" ");				
			}
		}
		else {
			System.out.println("�ٽ� �Է����ּ���."); practice8();
		}
	}
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		String[] menu = {"�ұ���", "��Ÿ��", "�c���", "���ľ� ������"};
		
		int count = 0;
		System.out.println("�� � �޴��� ã���ó���?");
		String cho = sc.next();
		
		for(int i =0; i<menu.length; i++) {
			if(cho.equals(menu[i])) {
				count++;
			}
		}
		if(count == 1) {
			System.out.println("��, �޴��� �ֽ��ϴ�. "+cho+" ��ް���!");
		}
		else {
			System.out.println(cho+"��/�� ���� �޴��Դϴ�.");
		}
	}
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		char[] idNumber = new char[14];
		System.out.println("�� �ֹε�Ϲ�ȣ�� �Է��Ͻÿ�");
		String id = sc.next();
		
		for(int i =0; i<8; i++) {
			idNumber[i] = id.charAt(i);
		}
		for(int k=0; k<8; k++) {
			System.out.print(idNumber[k]);
		}
		for(int j =8; j<14; j++) {
			System.out.print("*");
		}
	}
	public void practice11() {
		int[] arr = new int[10];
		
		Math.random();
		for(int i=0; i<10; i++) {
			arr[i]  = (int)(Math.random()*10+1);
		}
		for(int j=0; j<10; j++) {
			System.out.print(arr[j]+" ");
		}
	}
	
	public void practice12() {
		int[] arr = new int[10];
		
		Math.random();
		for(int i=0; i<10; i++) {
			arr[i]  = (int)(Math.random()*10+1);
		}
		for(int j=0; j<10; j++) {
			System.out.print(arr[j]+" ");
		}
		
		int max = arr[0];
		int swap;
		
		// �ִ밪�� idx �Ǹ����� ��ȣ��, �ּڰ��� idx ��ó���� ���� 
		for(int i =0; i<10; i++) {
			for(int j = (i+1); j<10; j++) {
				if(arr[i] > arr[j]) {
					swap = arr[i];
					arr[i] = arr[j];
					arr[j] = swap;	
				}
			}
		}
		max = arr[9];
		int min = arr[0];
		
		System.out.println();
		System.out.println("�ִ� : "+max);
		System.out.println("�ּڰ� : "+min);
		
	}
	public void practice13() {
		int[] arr = new int[10];
		
		for(int i =0; i<10; i++) {
			arr[i] = (int)(Math.random()*10+1);
			for(int j=0; j<i; j++) {
				if(arr[i]==arr[j]) {
					i--;
				}
			}
		}
		for(int k=0; k<10; k++) {
			System.out.print(arr[k]+" ");
		}
	}
	public void practice14() {
		
	// 1. lotto�迭�� �ߺ������� 6���� ����(1 ~ 45) �������� ����.
		int[] lotto = new int[6];
		for(int i=0; i<6; i++) {
			lotto[i] = (int)(Math.random()*44+1);
			for(int j=0; j<i; j++) {
				if(lotto[i]==lotto[j]) {
					i--;
				}
			}
		}
	// 2. lotto�迭�� ���� ������ �� ����ƴ��� Ȯ��.
//		for(int k=0; k<6; k++) {
//			System.out.print(lotto[k]+" ");
//		}
		
	// 3. ������������ ����.
		int temp;
		for(int k=0; k<6; k++) {
			for(int l=(k+1); l<6; l++) {
				if(lotto[k]>lotto[l]) {
					temp = lotto[k];
					lotto[k] = lotto[l];
					lotto[l] = temp;
				}
			}
		}
		for(int m=0; m<6; m++) {
			System.out.print(lotto[m]+" ");
		}
	}
	public void practice15() {
		Scanner sc = new Scanner(System.in);

		System.out.print("�� ���ڿ��� �Է��Ͻÿ� : ");
		String msg = sc.next();
		int count = 0;
		
		char[] msg1 = new char[msg.length()];
		
		// ���ڿ��� ���� �ϳ��ϳ� ����.
		for(int i = 0; i<msg1.length; i++) {
			msg1[i] = msg.charAt(i); 
		}
		
		
		// �ߺ��Ǵ� ���� ���ؼ� ����
		final char cNull = '0';
		for(int i =1; i<msg1.length; i++) {
			for(int j=0; j<i; j++) {
				if(msg1[i]== msg1[j]) {
					msg1[i] = cNull;
				}
			}
		}
		
		// �ߺ� ���ŵ� ���� ����
		for(int i =0; i<msg1.length;i++) {
			if(msg1[i]!=cNull) {
				count++;
			}
		}
		
		// �ߺ� ���ŵ� ���� �� ������ŭ �迭 ���� �Ҵ��Ű��
		int space =0;
		char[] str = new char[count];
		for(int i =0; i<msg.length(); i++) {
			if(msg1[i] != cNull) {
				str[i-space] = msg1[i];
			}
			else {
				space++;
				continue;
			}
		}
		
		// ���ڿ��� �ִ� ���� ���.
		System.out.print("���ڿ��� �ִ� ���� : ");
		for(int i =0; i<count; i++) {
			System.out.print(str[i]+" ");
		}
		
		System.out.print("\n���ڰ��� : "+count);
		
	}	
	
	public void practice16() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� �迭�� ũ�⸦ �Է��Ͻÿ�.");
		int size = sc.nextInt();
		
		String[] str = new String[size];
		
		sc.nextLine();
		for(int i = 0; i<size; i++) {
			System.out.print((i+1)+"��° ���ڿ� : ");
			str[i] = sc.nextLine();
		}
		
		// �߰������� �� ���� �迭 
		
		boolean flag = true;
		while(flag) {
			System.out.println("��� �Է��Ͻðڽ��ϱ�?(Y/N)");
			char answer = sc.next().charAt(0);
			if(answer == 'Y') {
				System.out.println("�� �Է��ϰ� ���� ����");
				int size2 = sc.nextInt();
				sc.nextLine();
				for(int i = size ; i<size2 ; i++) {
					System.out.println((i+1)+"��° ���ڿ� : ");
					str[i] = sc.nextLine();
				}
				
			}else {
				flag = false;
			}
		}
	}
}	
