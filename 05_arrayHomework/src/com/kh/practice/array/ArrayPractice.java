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
		System.out.println("▽ 숫자를 입력하시오");
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
		String[] fruits = {"사과", "귤", "포도", "복숭아", "참외"};
		
		System.out.println(fruits[1]);
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("▽ 문자열을 입력하세요.");
		
		String msg = sc.next();
		char[] arr = new char[msg.length()];
		
		
		// 입력받은 문자열 하나씩 배열에 저장
		for(int i =0; i<arr.length; i++) {
			arr[i] = msg.charAt(i);
		}
		
		System.out.println("▽ 찾고자 하는 문자는?");
		char searchText = sc.next().charAt(0);
		
		int count =0; 		// 문자 갯수 카운트해줄 변수
		String idx = "";	// 인덱스 번호 저장해놓을 변수
		
		for(int j = 0; j<arr.length; j++ ) {
			if(arr[j] == searchText) {
				idx +=(j+" ");
				count++;
			}
		}
		System.out.println(msg+"에 "+searchText+"가 존재하는 위치(인덱스): "+idx);
		System.out.println(searchText+"의 개수 : "+ count);
		
	}
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		String[] day = {"월", "화", "수", "목", "금", "토", "일"};
		
		System.out.println("▽ 인덱스 번호를 입력하세요.");
		int num = sc.nextInt();
		if(num<7) {
			System.out.println(day[num]+"요일");
		}
		else System.out.println("잘못 입력하셨습니다.");
		
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("▽ 배열의 길이를 입력하시오.");
		int length = sc.nextInt();
		
		int[] arr = new int[length];
		for(int i=0; i<arr.length; i++) {
			System.out.println("▽ 배열"+i+"번째 인덱스에 넣을 값 :");
			arr[i] = sc.nextInt(); 
		}
		
		int sum = 0;	// arr변수들의 합을 저장할 변수.
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
			System.out.print(arr[i]+" ");
		}
		System.out.print("\n"+"총 합 : "+sum);
	}
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.println("▽ 3이상의 홀수를 입력하세요.");
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
			System.out.println("다시 입력해주세요."); practice8();
		}
	}
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		String[] menu = {"쌀국수", "팟타이", "똠양꿍", "파파야 샐러드"};
		
		int count = 0;
		System.out.println("▽ 어떤 메뉴를 찾으시나요?");
		String cho = sc.next();
		
		for(int i =0; i<menu.length; i++) {
			if(cho.equals(menu[i])) {
				count++;
			}
		}
		if(count == 1) {
			System.out.println("네, 메뉴에 있습니다. "+cho+" 배달가능!");
		}
		else {
			System.out.println(cho+"은/는 없는 메뉴입니다.");
		}
	}
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		char[] idNumber = new char[14];
		System.out.println("▽ 주민등록번호를 입력하시오");
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
		
		// 최대값은 idx 맨마지막 번호에, 최솟값은 idx 맨처음에 저장 
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
		System.out.println("최댓값 : "+max);
		System.out.println("최솟값 : "+min);
		
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
		
	// 1. lotto배열에 중복값없이 6개의 숫자(1 ~ 45) 랜덤으로 저장.
		int[] lotto = new int[6];
		for(int i=0; i<6; i++) {
			lotto[i] = (int)(Math.random()*44+1);
			for(int j=0; j<i; j++) {
				if(lotto[i]==lotto[j]) {
					i--;
				}
			}
		}
	// 2. lotto배열에 각각 난수가 잘 저장됐는지 확인.
//		for(int k=0; k<6; k++) {
//			System.out.print(lotto[k]+" ");
//		}
		
	// 3. 오름차순으로 정렬.
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

		System.out.print("▽ 문자열을 입력하시오 : ");
		String msg = sc.next();
		int count = 0;
		
		char[] msg1 = new char[msg.length()];
		
		// 문자열에 문자 하나하나 저장.
		for(int i = 0; i<msg1.length; i++) {
			msg1[i] = msg.charAt(i); 
		}
		
		
		// 중복되는 값을 비교해서 제거
		final char cNull = '0';
		for(int i =1; i<msg1.length; i++) {
			for(int j=0; j<i; j++) {
				if(msg1[i]== msg1[j]) {
					msg1[i] = cNull;
				}
			}
		}
		
		// 중복 제거된 문자 개수
		for(int i =0; i<msg1.length;i++) {
			if(msg1[i]!=cNull) {
				count++;
			}
		}
		
		// 중복 제거된 문자 총 개수만큼 배열 새로 할당시키기
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
		
		// 문자열에 있는 문자 출력.
		System.out.print("문자열에 있는 문자 : ");
		for(int i =0; i<count; i++) {
			System.out.print(str[i]+" ");
		}
		
		System.out.print("\n문자개수 : "+count);
		
	}	
	
	public void practice16() {
		Scanner sc = new Scanner(System.in);
		System.out.println("▽ 배열의 크기를 입력하시오.");
		int size = sc.nextInt();
		
		String[] str = new String[size];
		
		sc.nextLine();
		for(int i = 0; i<size; i++) {
			System.out.print((i+1)+"번째 문자열 : ");
			str[i] = sc.nextLine();
		}
		
		// 추가적으로 더 만들 배열 
		
		boolean flag = true;
		while(flag) {
			System.out.println("계속 입력하시겠습니까?(Y/N)");
			char answer = sc.next().charAt(0);
			if(answer == 'Y') {
				System.out.println("더 입력하고 싶은 개수");
				int size2 = sc.nextInt();
				sc.nextLine();
				for(int i = size ; i<size2 ; i++) {
					System.out.println((i+1)+"번째 문자열 : ");
					str[i] = sc.nextLine();
				}
				
			}else {
				flag = false;
			}
		}
	}
}	
