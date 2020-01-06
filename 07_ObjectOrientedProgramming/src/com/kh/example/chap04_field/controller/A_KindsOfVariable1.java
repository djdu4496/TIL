package com.kh.example.chap04_field.controller;

public class A_KindsOfVariable1 { // <== Ŭ���� ������ ����
	
	// Ŭ���� ������ �ۼ��ϴ� ���� : �ʵ�
	// == �������
	// == ����ʵ�
	// == ��������
	
	private int globalNum;
	
	public void method1(int num) { // <== �޼ҵ� ������ ����
		//				------ �Ű����� : �޼ҵ��� ����� �� ��ȣ�ȿ� �����ϴ� ����
		
		// �޼ҵ� ������ �ۼ��ϴ� ���� : ��������
		int localNum;
		// �Ű����� ���� ���������� �������� ������
		
		localNum=10;
		System.out.println(localNum);
		//The local variable localNum may not have been initialized : ���� ������ �ݵ�� �ʱ�ȭ�� �Ǿ��־����
		
		System.out.println(num);
		
		System.out.println(globalNum);
		
	} // <== �޼ҵ� ������ ��
	
	public void method2() {
//		System.out.println(localNum);
		// localNum cannot be resolved to a variable : ���������� �ش� ���� ������ ��� ����
		System.out.println(globalNum);
	}
} // <== Ŭ���� ������ ��
