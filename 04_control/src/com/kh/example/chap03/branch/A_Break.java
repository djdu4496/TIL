package com.kh.example.chap03.branch;

import java.util.Scanner;

public class A_Break {
	// break문은 가장 가까운 반복문을 나감
	
	public void method1() {
		// 문자열을 입력 받아 글자 개수(length())를 출력하는 반복(do ~ while) 프로그램
		// 단, end가 입력되면 반복 종료
		// do ~ while 사용
		
		Scanner sc = new Scanner(System.in);
		
		do {		
			System.out.print("문자열 입력 : ");
			String str = sc.nextLine();
		
			if(str.equals("end")) {
				break;
			}
		
			System.out.println(str + "의 글자 개수 : " + str.length());
		} while(true);
	}
	public void method2() {
		// 1부터 사용자에게 입력 받은 숫자까지의 합 출력
		// for문 사용
		
		Scanner sc = new Scanner(System.in);	
		System.out.print("숫자 입력 : ");
			int num = sc.nextInt();
			int sum = 0;
			
			for(int i=1;/*i<=num*/;i++) {
				sum+=i;
				
				if(i == num) {
					break;
				}
			}
			
			System.out.println("1부터" + num + "까지의 합은" + sum + "입니다.");
	}
}
