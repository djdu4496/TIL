package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	
	public TokenController() {}
	
	public String afterToken(String str) {
		// ������ ��ū���� ó���� ���ڿ� ��ȯ
		String str1="";
		String str3="";
		StringTokenizer stObj = new StringTokenizer(str," ");
		int str2 = stObj.countTokens();
		System.out.print("��ū ó�� �� ���� : ");
		while(stObj.hasMoreTokens()) {
			str1 += stObj.nextToken();
			
		}
		System.out.print(str1);
		System.out.println();
		System.out.println("��ū ó�� �� ���� : " + str2);
		
		
		System.out.print("��� �빮�ڷ� ��ȯ : "+ str1.toUpperCase());

				
		return str1;
		
		
	}
	
	public String firstCap(String input) {
		// ù ���ڸ� �빮�ڷ� �ٲ� ���ڿ� ��ȯ
		input.substring(0, 1).toUpperCase();
		
		
		
		
		
		return input.substring(0, 1).toUpperCase() + input.substring(1);
	
		
		
	}
	
	public int findChar(String input, char one) {
		// ���ڿ� �ȿ� ã�� ���� ������ �� �� ���ִ��� ��ȯ
		int count=0;
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)==one) {
				count++;
			}
		}
		return count;
	}
}
