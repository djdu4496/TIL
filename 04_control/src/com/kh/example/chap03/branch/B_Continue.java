package com.kh.example.chap03.branch;

public class B_Continue {
	// continue�� �ݺ��� �ȿ����� ��� ����
	// continue�� ������ �Ʒ� ���� �������� �ʰ�
	// �ݺ��� �ٽ� ������
	// for���� ��� ���������� ����, while���� ��� ���ǽ����� ��
	public void method1() {
		// 1~100���� �������� �հ踦 ����ϵ� ��, 4�� ����� ���� ���
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 4 == 0) {
				continue;
			}
			System.out.print(i + " ");
			sum += i;
		}
		System.out.println();
		System.out.println("sum = " + sum);
	}
	public void method2() {
		// ������ ��� : ¦�� ��, ¦�� �� ���� ��� // continue ��� + ���� ���� ������ ��� �� Ǯ���
		int dan = 1;
		int su = 1;
		
//		for(dan=1;dan<=9;dan+=2) {
			System.out.println("==========" + dan + "��==========");
			for(su=1;su<=9;su+=2) {
				System.out.println(dan + " * " + su + " = " + (dan * su));
			}
			System.out.println();
		
//		for(dan=1;dan<=9;dan+=2) {
//			if(dan % 2 ==0) {
//				continue;
//			} 
//			for(su=1;su<=9;su+=2) {
//				if(su % 2 ==0) {
//					continue;
//				}
//				System.out.println(dan + "*" + su + "=" + (dan*su));
				System.out.printf("%d * %d = %d%n", dan, su, (dan*su));
	}
			
		
}

