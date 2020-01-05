package com.kh.operator;

public class D_Comparison {

	public void method1() {
		int a = 10;
		int b = 25;
		// 어떤 값이 출력될지 예측해보자.
		boolean result1 = (a == b);			
		boolean result2 = (a <= b);			
		boolean result3 = (a > b);			
		
		System.out.println(result1);						// false
		System.out.println(result2);						// true
		System.out.println(result3);						// false
		// b 홀/짝수 판단 방법(두 번째 line과 세 번째 line은 같은 얘기 다른 방법
		System.out.println("b가 짝수인가? " + (b % 2 == 0));
		System.out.println("b가 홀수인가? " + (b % 2 != 0));
		System.out.println("b가 홀수인가? " + !(b % 2 == 0));
	}	
}
