package com.kh.operator;

public class B_InDecrease {
	// ���� ������ : ++, --
	// ++ : 1�� ����
	// -- : 1�� ����
	// ++��, --�� : ���� ������ => ������ ����ϰ� �ٸ� ������ ���
	// ��++, ��-- : ���� ������=> �ٸ� �����ں��� ��� �� �� ���
	public void method1() {
		// ���� ���� ������ �׽�Ʈ
		int num1 =10;
		// � ���� ��µ��� �����غ���. 
		System.out.println("���� ���� ������ ���� �� : " + num1);            // ���� ���� ������ ���� �� : 10
		System.out.println("++num1�� 1ȸ ���� �� ��� : " + (++num1));		 // ++num1�� 1ȸ ���� �� ��� : 11
		System.out.println("++num1�� 2ȸ ���� �� ��� : " + (++num1));		 // ++num1�� 2ȸ ���� �� ��� : 12
		System.out.println("++num1�� 3ȸ ���� �� ��� : " + (++num1));		 // ++num1�� 3ȸ ���� �� ��� : 13
		System.out.println("++num1�� 4ȸ ���� �� ��� : " + (++num1));		 // ++num1�� 4ȸ ���� �� ��� : 14
		System.out.println("++num1�� 5ȸ ���� �� ��� : " + (++num1));     // ++num1�� 5ȸ ���� �� ��� : 15
		System.out.println("���� ���� ���� ���� �� num1�� �� : " + num1);     // ���� ���� ���� ���� �� num1�� �� : 11(x) 15(o) 
		
		System.out.println();  // �� �� �����
		
		// ���� ���� ������
		int num2 = 10;
		System.out.println("���� ���� ���� ���� �� " + num2);				// ���� ���� ������ ���� �� : 10
		System.out.println("num2++�� 1ȸ ���� �� ��� " + (num2++));		// num2++�� 1ȸ ���� �� ��� : 10
		System.out.println("num2++�� 2ȸ ���� �� ��� " + (num2++));		// num2++�� 2ȸ ���� �� ��� : 11
		System.out.println("num2++�� 3ȸ ���� �� ��� " + (num2++));		// num2++�� 3ȭ ���� �� ��� : 12
		System.out.println("num2++�� 4ȸ ���� �� ��� " + (num2++));    	// num2++�� 4ȸ ���� �� ��� : 13
		System.out.println("num2++�� 5ȸ ���� �� ��� " + (num2++));		// num2++�� 5ȸ ���� �� ��� : 14
		System.out.println("���� ���� ���� ���� �� num2�� �� " + (num2++));    // ���� ���� ���� ���� �� num2�� �� : 15	
		
	}
	public void method2() {
		int age =20;
		// � ���� ��µ��� �����غ���. 
		System.out.println("���� ���̴�? " + age);						// ���� ���̴�? 20
		System.out.println("++age��? " + ++age);						// ++age��? 21
		System.out.println("age++��? " + age++);						// age++��? 21
		System.out.println("--age��? " + --age);						// --age��? 21
		System.out.println("age--��? " + age--);						// age--��? 21
		System.out.println("���� ���̴�? " + age);                     // ���� ���̴�? 20
		
	}
	
	public void method3() {
		int num1 = 20;
		int result = num1++ * 3;
		// � ���� ��µ��� �����غ���. 
		System.out.println("result : " + result);  					// result : 60
		System.out.println("num1 : " + num1);      					// num1 : 21
	
		int num2 = 20;
		int result2 = ++num2 * 3;
		System.out.println("result2 : " + result2); 				// result2 : 63
		System.out.println("num2 : " + num2);						// num2 : 21
	}
	public void method4() {
		int a = 10;
		int b = 20;
		int c = 30;
		// � ���� ��µ��� �����غ���. 
		System.out.println(a++);							// 10
				
		System.out.println((++a) + (b++));					// 12 + 20 = 32
		
		System.out.println((a++) + (--b) + (--c));			// 12 + 20 + 29 = 61
		
		System.out.println("a = " + a);						// a = 13
		System.out.println("b = " + b);						// b = 20
		System.out.println("c = " + c);						// c = 29
		
		
		
		
		
		
		
		
	}
}
