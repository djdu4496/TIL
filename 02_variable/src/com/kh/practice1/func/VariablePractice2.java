package com.kh.practice1.func;
import java.util.*;

public class VariablePractice2 {
	public void inputScanner4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� : ");
		int firstInteger = sc.nextInt();
		
		
		System.out.print("�� ��° ���� : ");
		int secondInteger = sc.nextInt();
		
		int plus = firstInteger + secondInteger;
		System.out.println("���ϱ� ��� : " + plus);
		
		int subtract = firstInteger + secondInteger;
		System.out.println("���� ��� : " + subtract);
		
		int multiply = firstInteger * secondInteger;
		System.out.println("���ϱ� ��� : " + multiply);
		
		int divide = firstInteger / secondInteger;
		System.out.println("������ �� ��� : " + divide);		
	}
}

