package com.kh.operator;

public class D_Comparison {

	public void method1() {
		int a = 10;
		int b = 25;
		// � ���� ��µ��� �����غ���.
		boolean result1 = (a == b);			
		boolean result2 = (a <= b);			
		boolean result3 = (a > b);			
		
		System.out.println(result1);						// false
		System.out.println(result2);						// true
		System.out.println(result3);						// false
		// b Ȧ/¦�� �Ǵ� ���(�� ��° line�� �� ��° line�� ���� ��� �ٸ� ���
		System.out.println("b�� ¦���ΰ�? " + (b % 2 == 0));
		System.out.println("b�� Ȧ���ΰ�? " + (b % 2 != 0));
		System.out.println("b�� Ȧ���ΰ�? " + !(b % 2 == 0));
	}	
}
