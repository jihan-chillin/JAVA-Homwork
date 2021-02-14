package com.kh.practice.dimension;

import java.math.*;

import java.util.Scanner;

public class DimensionPractice {
	public void practice1() {
		String[][] arr = new String[4][4];
		for(int i = 0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print("("+i+","+j+")");
			}
			System.out.println();
		}
	}
	public void practice2() {
		int[][] arr = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
		for(int i = 0; i<4; i++) {
			for(int j = 0; j<4; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	
	}
	public void practice3() {
		int[][] arr = { {16,15,14,13}, {12,11,10,9}, {8,7,6,5}, {4,3,2,1}};
		for(int i = 0; i<4; i++) {
			for(int j = 0; j<4; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public void practice4() {
		
		int[][] arr = new int[4][4];
		for(int i =0 ;i<3; i++) {
			for(int j=0;j<3; j++) {
				arr[i][j] = (int)(Math.random()*100);
			}
		}
		for(int k = 0; k<3; k++) {
			arr[3][k] = (int)(Math.random()*100);
		}
		for(int l = 0; l<3; l++) {
			arr[l][3] = (int)(Math.random()*100);
		}
		for(int m = 0; m<3; m++) {
			for(int n=0; n<3 ; n++) {
				arr[3][3] += arr[m][n]; 
			}
		}
		for(int i = 0; i<4; i++) {
			for(int j = 0; j<4; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("▽ 정수를 입력하세요");
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		if((row>=1 && row<=10) || (col>=1 && col<=10)) {
		
		char [][] arr = new char[row][col];
		for(int i =0 ;i<row; i++) {
			for(int j=0;j<col; j++) {
				arr[i][j] = (char)(int)((Math.random()*26)+65);
			}
		}
		for(int i = 0; i<row; i++) {
			for(int j = 0; j<col; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	} 
		else {
		System.out.println("반드시 1 ~ 10 사이의 정수를 입력해야합니다.");
		}
		
	}
	public void practice6() {
		String[][] arr = {{"이","까","왔","앞","힘"},{"차","지","습","으","냅"},
				{"원","열","니","로","시"},{"배","심","다","좀","다"},
				{"열","히","!","더","!!"}};
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<5; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}	
	}
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("▽ 행의 크기를 입력하세요.");
		int row = sc.nextInt();
		
		for(int i = 0; i<row; i++) {
			System.out.println("▽ "+i+"행의 크기를 입력하세요.");
			int col = sc.nextInt();
			
			
			
			
//			char[][] arr = new char[row][col];
//			for(int j = 0; j<col; j++) {
//				arr[i][j] = (char)(int)((Math.random()*26)+97);
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//			
		}
	
	}
	public void practice8() {
		String[] arr1 = { "김지한", "유태오", "옥택연","유지태","공지철","햄식이"};
		String[] arr2 = {"박재범","로꼬","코쿤","팔로알토","그루비룸","기리보이"};
		
		String[][] arr3 = new String[3][2];
		String[][] arr4 = new String[3][2];
		
		int idx = 0;
		int idx1 = 0;
		
		System.out.println("==== 1분단 ====");
		for(int i = 0; i<arr3.length; i++) {
			for(int j = 0; j<arr3[i].length; j++) {
				arr3[i][j]= arr1[idx++];
				System.out.print(arr3[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("==== 2분단 ====");
		for(int i = 0; i<arr4.length; i++) {
			for(int j = 0; j<arr4[i].length; j++) {
				arr4[i][j]= arr2[idx1++];
				System.out.print(arr4[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		String[] arr1 = { "김지한", "유태오", "옥택연","유지태","공지철","햄식이"};
		String[] arr2 = {"박재범","로꼬","코쿤","팔로알토","그루비룸","기리보이"};
		
		String[][] arr3 = new String[3][2];
		String[][] arr4 = new String[3][2];
		
		int idx = 0;
		int idx1 = 0;
		
		System.out.println("==== 1분단 ====");
		for(int i = 0; i<arr3.length; i++) {
			for(int j = 0; j<arr3[i].length; j++) {
				arr3[i][j]= arr1[idx++];
				System.out.print(arr3[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("==== 2분단 ====");
		for(int i = 0; i<arr4.length; i++) {
			for(int j = 0; j<arr4[i].length; j++) {
				arr4[i][j]= arr2[idx1++];
				System.out.print(arr4[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("\n====================");
		System.out.print("검색할 학생 이름을 입력하세요. : ");
		String name = sc.next();
		
		for(int i =0; i<3; i++) {
			for(int j = 0; j<arr3[i].length; j++) {
				if(name.equals(arr3[i][j])) {
					if(j%2 == 0) {
						System.out.println("검색하신 "+name+" 학생은 1분단 "+(i+1)+"번째 줄 왼쪽에 있습니다.");
					}
					else System.out.println("검색하신 "+name+"학생은 1분단"+(i+1)+"번째 줄 오른에 있습니다.");
				}
				else if(name.equals(arr4[i][j])) {
					if(j%2 == 0) {
						System.out.println("검색하신 "+name+" 학생은 2분단 "+(i+1)+"번째 줄 왼쪽에 있습니다.");
					}
					else System.out.println("검색하신 "+name+"학생은 2분단"+(i+1)+"번째 줄 오른에 있습니다.");
				}
			}
		}		
		
	}
	
}
	
	
