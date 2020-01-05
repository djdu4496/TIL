package com.kh.example.chap02.loop;

import java.util.Scanner;

public class C_DoWhile {
	public void method1() {
		// 키보드로 문자열 값을 입력 받아 출력 반복 실행
		// 단, exit가 들어오면 반복 종료
		/*
		  	문자열 입력 : 안녕하세요
		  	str : 안녕하세요
		  	문자열 입력 : apple
		  	str : apple
		  	문자열 입력 : exit
		  	str : exit
		*/
		Scanner sc = new Scanner(System.in);
		
		// 1. while
//			String str = "";  // null: 아무것도 아닌 값(빈공간x, 띄어쓰기x)
//			while(!str.equals("exit")) {	// equals: 문자열 비교 <= 모르는 것 복습하자
//				System.out.print("문자열 입력 : ");
//				str = sc.nextLine();
//				System.out.println("str : " + str);
//			}
		// 2. do ~ while
		String str = null;
		do {
			System.out.print("문자열 입력: ");
			str = sc.nextLine();
			System.out.println("str : " + str);
		} while (!str.equals("exit"));
		
	
	}
	public void method2() {
		Scanner sc = new Scanner(System.in);
		int menuNum=0;	// 가비지 값 등에 의한 오류를 방지하기 위해 menuNum 주소값에 대한 값 초기화를 써준다.
//		System.out.println(menuNum);
		do {
			System.out.println("1. 테스트 1");
			System.out.println("2. 테스트 2");
			System.out.println("3. 테스트 3");
			System.out.println("9. 종료");
			System.out.println("메뉴 선택 : ");
			menuNum = sc.nextInt();
		
			switch (menuNum) {
			case 1: System.out.println(1); break;
			case 2: System.out.println(2); break;
			case 3: System.out.println(3); break;
			case 9: System.out.println(9); break;
			default: System.out.println("잘못 입력하셨습니다.");
			}
		} while(menuNum !=9);
	}
}
