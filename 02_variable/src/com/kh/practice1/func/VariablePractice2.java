package com.kh.practice1.func;
import java.util.*;

public class VariablePractice2 {
	public void inputScanner4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 : ");
		int firstInteger = sc.nextInt();
		
		
		System.out.print("두 번째 정수 : ");
		int secondInteger = sc.nextInt();
		
		int plus = firstInteger + secondInteger;
		System.out.println("더하기 결과 : " + plus);
		
		int subtract = firstInteger + secondInteger;
		System.out.println("빼기 결과 : " + subtract);
		
		int multiply = firstInteger * secondInteger;
		System.out.println("곱하기 결과 : " + multiply);
		
		int divide = firstInteger / secondInteger;
		System.out.println("나누기 몫 결과 : " + divide);		
	}
}

