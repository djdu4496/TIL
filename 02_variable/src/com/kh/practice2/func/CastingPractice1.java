package com.kh.practice2.func;
import java.util.*;
public class CastingPractice1 {
	public void method() {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		int codeNumber = (int) ch;  // 문자형 char를 숫자형 'int'로 강제 형변환
		System.out.println("A unicode : " + codeNumber);
		
	}
}
