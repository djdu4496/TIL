package com.kh.example.chap03.branch;

import java.util.Scanner;

public class A_Break {
	// break���� ���� ����� �ݺ����� ����
	
	public void method1() {
		// ���ڿ��� �Է� �޾� ���� ����(length())�� ����ϴ� �ݺ�(do ~ while) ���α׷�
		// ��, end�� �ԷµǸ� �ݺ� ����
		// do ~ while ���
		
		Scanner sc = new Scanner(System.in);
		
		do {		
			System.out.print("���ڿ� �Է� : ");
			String str = sc.nextLine();
		
			if(str.equals("end")) {
				break;
			}
		
			System.out.println(str + "�� ���� ���� : " + str.length());
		} while(true);
	}
	public void method2() {
		// 1���� ����ڿ��� �Է� ���� ���ڱ����� �� ���
		// for�� ���
		
		Scanner sc = new Scanner(System.in);	
		System.out.print("���� �Է� : ");
			int num = sc.nextInt();
			int sum = 0;
			
			for(int i=1;/*i<=num*/;i++) {
				sum+=i;
				
				if(i == num) {
					break;
				}
			}
			
			System.out.println("1����" + num + "������ ����" + sum + "�Դϴ�.");
	}
}
