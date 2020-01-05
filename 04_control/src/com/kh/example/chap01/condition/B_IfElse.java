package com.kh.example.chap01.condition;

import java.util.Scanner;

public class B_IfElse {
	// if-else��
	// if(���ǽ�){
	// 		������ ����1;
	// } else {
	// 		������ ����2;
	// }
	// �� �� �� ���� �����ϴ� ���ǹ�
	// ���ǽ� ��� ���� ��(True)�̸� if�� �ȿ� �ִ� ������ ����1 ����
	// ���ǽ� ��� ���� ����(False)�̸� if���� �������� else�� �ȿ� �ִ� ������ ����2 ����
	public void method1() {
		// Ű����� �Է��� ���ڰ� ¦������ Ȧ������ ���
		
		// '���� �� ���� �Է��ϼ��� : ' �ȳ����� ��� �� num������ ������ ����
		// ¦���̸� "�Է��Ͻ� ���ڴ� ¦���Դϴ�.", Ȧ���̸� "�Է��Ͻ� ���ڴ� Ȧ���Դϴ�." ���
		// ���α׷��� ������ �� "���α׷� ����"���� ��� �� ���α׷� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �� ���� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if(num % 2 ==0) {
			System.out.println("�Է��Ͻ� ���ڴ� ¦���Դϴ�.");
		} else {
			System.out.println("�Է��Ͻ� ���ڴ� Ȧ���Դϴ�.");
		}
		System.out.println("���α׷� ����");
	}
	public void method2() {
		// ����ڿ���  ����, ����, ���� ������ �Է� �޾Ƽ� ���� kor, eng, math ������ ����
		// �� ���� ������ 40�� �̻��̰� �� ���� ��� ������ 60�� �̻��� �� "���� ���",
		// �ϳ��� ���� �̴��� �� "���� �����" ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� : ");
		int kScore = sc.nextInt();
		System.out.print("���� ���� : ");
		int eScore = sc.nextInt();
		System.out.print("���� ���� : ");
		int mScore = sc.nextInt();
		
		double average = (kScore + eScore + mScore) / 3.0;     // ����� �Ҽ��ϱ� �Ǽ��� double������ ������!!!(�����ߴ� �κ�)
															   // 3.0 ���ִ� ������ ������ ���ַ���
		
		if ((kScore>=40 && eScore>=40 && mScore>=40) && (average >= 60)) {
			System.out.println("���� ���");
		} else {
			System.out.println("���� �����");
		}
		
		
		
	}
	public void method3() {
		// ���ڿ� ���ϱ� : StringŬ���� �ȿ� �ִ� equals() // ���ڿ��� equals��� �ϴ� �޼ҵ�� ���Ѵ� // ���ڿ��� ==���� ���ϴ°� �ƴϴ�.
		// equals�� ��Ÿ�� �� �ִ� ���� boolean�̴�.
		// boolean java.lang.String.equals(Object object)  
		// ����ڿ��� �̸��� �޴µ� ���� ������ �̸��� ������ "�����Դϴ�"
		// ���� ������ "������ �ƴմϴ�" ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		
		if(name.equals("�ڽſ�")) {  // name���� "�ڽſ�"�� ���� ��� ����� ���̴�.
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("������ �ƴմϴ�.");
		}
	}
}
