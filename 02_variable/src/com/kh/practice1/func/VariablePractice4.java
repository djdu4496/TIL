package com.kh.practice1.func;
import java.util.*;
public class VariablePractice4 {

	public void inputScanner6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String something = sc.nextLine();
		
		char index1 = something.charAt(0);
		System.out.println("첫 번째 문자 : " + index1);
		
		char index2 = something.charAt(1);
		System.out.println("두 번째 문자 : " + index2);
		
		char index3 = something.charAt(2);
		System.out.println("세 번째 문자 : " + index3);
	}
}
