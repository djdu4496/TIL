package com.kh.practice.token.view;

import java.util.Scanner;

import com.kh.practice.token.controller.TokenController;

public class TokenMenu {
	private Scanner sc = new Scanner(System.in);
	private TokenController tc = new TokenController();
	
	public void mainMenu() {
		System.out.println("1. ���� ���ڿ�");
		System.out.println("2. �Է� ���ڿ�");
		System.out.println("3. ���α׷� ������");
		
		System.out.print("�޴� ��ȣ : ");
		int menuNum = sc.nextInt();
		sc.nextLine();
		
		if(menuNum==1) {
			tokenMenu();
		} else if(menuNum==2) {
			inputMenu();
		} else if(menuNum==3) {
			System.out.println("���α׷��� �����մϴ�.");
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			mainMenu();
		}
		
	}
			
	public void tokenMenu() {
		String str = "J a v a P r o g r a m ";
		
		System.out.println("��ū ó�� �� ���� : " + str);
		
		System.out.println("��ū ó�� �� ���� : " + str.length());
		
		tc.afterToken(str);		
				
	}
	
	public void inputMenu() {
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String input = sc.nextLine();
		tc.firstCap(input);
		System.out.println("ù ���� �빮�� : " + tc.firstCap(input));
		
		System.out.print("ã�� ���ڸ� �ϳ� �Է��ϼ��� : ");
		char one = sc.nextLine().charAt(0);
		
		tc.findChar(input,one);
		System.out.println("i ���ڰ� �� ���� : " + tc.findChar(input,one));
		
	}
}
