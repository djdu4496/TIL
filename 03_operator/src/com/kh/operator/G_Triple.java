package com.kh.operator;

import java.util.*;

public class G_Triple {
	// ���� ������
	// (���ǽ�)? ��1 : ��2;
	// ���ǽ��� true�� �� �� 1 ����, false�� �� �� 2 ����
	
	public void method1() {
		// �Է��� ������ ������� �ƴ��� �Ǻ�
		// ����� "�����", ����� �ƴϸ� "����� �ƴϴ�"��� ���� ���
		// '���� �ϳ� �Է� : '�̶�� �ȳ��� ��� �� �Է��� ������ num�� ����
		// ����
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϳ� �Է� : ");
		int num = sc.nextInt();						// �� ������ system �Ʒ��� ������ ������ ������ ���ƴ�.
		
		String positive = "�����";
		String negative = "����� �ƴϴ�";
		
//		String result = (num>0 ? positive : negative);	
//	    System.out.println("num : " + result);
		/* ������ ���
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("���� �ϳ� �Է� : ");
		int num = sc.nextInt();
		
		String result = num > 0 ? "�����" : "����� �ƴϴ�"; */   // ���̴�??
	    
	    // ��ø ���� ������
	    
	    String result = num >0 ? positive :(num ==0 ? "0�̴�" : negative);
	    System.out.println("num : " + result);
	}
	
	public void method2() {
		// �Է��� ������ ¦������ Ȧ������ �Ǻ�
		// Ȧ���� "Ȧ���Դϴ�", ¦���� "¦���Դϴ�" ���
		
		// 1. �� ���� ��ġ��
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է��� ���� : ");  // �ȳ���
		int num = sc.nextInt();		     // �޾��ִ� Ű����
		
		String result = (num % 2 == 0) ? "¦���Դϴ�" : "Ȧ���Դϴ�";  // ���� ���� boolean�̳� int ������ ���� ������൵ ��� ����.
		
		/* 2. ���ǽĸ� ���� ����
		 * boolean bool = num % 2 == 0;
		 * String result = bool ? "¦���Դϴ�" : "Ȧ���Դϴ�";
		*/
		
		/* 3 ���ĸ� ���� ����
		 * int mod = num % 2;
		 * String result = (mod == 0) ? "¦���Դϴ�" : "Ȧ���Դϴ�";
		 */		
				
		System.out.println("num : " + result);
	}
}
