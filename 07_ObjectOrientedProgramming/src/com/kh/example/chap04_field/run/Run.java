package com.kh.example.chap04_field.run;

import com.kh.example.chap04_field.controller.B_KindsOfVariable2;
import com.kh.example.chap04_field.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		// ��ü ���� : B_KindsOfVariable2	
		B_KindsOfVariable2 bkov = new B_KindsOfVariable2();  // 'B_KindsOfVariable2' : ������  + 'new' : new ������
		int a = bkov.staticNum;
		// The static field B_KindsOfVariable2.staticNum should be accessed in a static way
		
		int a1 = B_KindsOfVariable2.staticNum;
		// static������ �ö� �ֱ� ������ ��ü ���� ���� ����
		
		B_KindsOfVariable2 bkv2 = new B_KindsOfVariable2();
		
		/*Static
		System.out.println();
		Arrays.copyof(null,0);
		Integer.pareInt(null);
		Math.random();
		main(String[] args]
		>> ��� static �޸� ���� ������ ���ֵ�.
		*/
		
		Product p = new Product();
		p.inform();
		// JVM �⺻��  �ʱ�ȭ : null, null, 0, 0(�� �ʱ�ȭ�� �� �Ǹ� jvm�� �⺻������ ����ȴ�)
		// ����� �ʱ�ȭ : ��������, ������, 1500, 100
		// �ν��Ͻ� �ʱ�ȭ �� : ĭ��, �Ե�, 1000, 90
		
		Product p2 = new Product();
		p2.inform();
		// �ν��Ͻ� �ʱ�ȭ �� : ĭ��, �Ե�, 1000, 80
		
		Product p3 = new Product();
		p3.inform();
		// �ν��Ͻ� �ʱ�ȭ �� : ĭ��, �Ե�, 1000, 70
		// ĭ��, �Ե�, 1000, 139
		// ĭ��, �Ե�, 1000, 129
		// ĭ��, �Ե�, 1000, 119
	}

}
