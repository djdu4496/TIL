package com.kh.practice.token.view;

import java.util.Scanner;

import com.kh.practice.token.controller.TokenController;

public class TokenMenu {
	private Scanner sc = new Scanner(System.in);
	private TokenController tc = new TokenController();
	
	public void mainMenu() {
		System.out.println("1. 지정 문자열");
		System.out.println("2. 입력 문자열");
		System.out.println("3. 프로그램 끝내기");
		
		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();
		sc.nextLine();
		
		if(menuNum==1) {
			tokenMenu();
		} else if(menuNum==2) {
			inputMenu();
		} else if(menuNum==3) {
			System.out.println("프로그램을 종료합니다.");
		} else {
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			mainMenu();
		}
		
	}
			
	public void tokenMenu() {
		String str = "J a v a P r o g r a m ";
		
		System.out.println("토큰 처리 전 글자 : " + str);
		
		System.out.println("토큰 처리 전 개수 : " + str.length());
		
		tc.afterToken(str);		
				
	}
	
	public void inputMenu() {
		System.out.print("문자열을 입력하세요 : ");
		String input = sc.nextLine();
		tc.firstCap(input);
		System.out.println("첫 글자 대문자 : " + tc.firstCap(input));
		
		System.out.print("찾을 문자를 하나 입력하세요 : ");
		char one = sc.nextLine().charAt(0);
		
		tc.findChar(input,one);
		System.out.println("i 문자가 들어간 개수 : " + tc.findChar(input,one));
		
	}
}
