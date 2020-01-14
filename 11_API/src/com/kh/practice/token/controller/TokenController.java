package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	
	public TokenController() {}
	
	public String afterToken(String str) {
		// 공백을 토큰으로 처리한 문자열 반환
		String str1="";
		String str3="";
		StringTokenizer stObj = new StringTokenizer(str," ");
		int str2 = stObj.countTokens();
		System.out.print("토큰 처리 후 글자 : ");
		while(stObj.hasMoreTokens()) {
			str1 += stObj.nextToken();
			
		}
		System.out.print(str1);
		System.out.println();
		System.out.println("토큰 처리 후 개수 : " + str2);
		
		
		System.out.print("모두 대문자로 변환 : "+ str1.toUpperCase());

				
		return str1;
		
		
	}
	
	public String firstCap(String input) {
		// 첫 글자만 대문자로 바꾼 문자열 반환
		input.substring(0, 1).toUpperCase();
		
		
		
		
		
		return input.substring(0, 1).toUpperCase() + input.substring(1);
	
		
		
	}
	
	public int findChar(String input, char one) {
		// 문자열 안에 찾을 문자 개수가 몇 개 들어가있는지 반환
		int count=0;
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)==one) {
				count++;
			}
		}
		return count;
	}
}
