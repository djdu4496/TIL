package com.kh.example.person.controller;

import com.kh.example.person.model.vo.Person;

public class PersonController {
	public void method1() {
		// Person��ü�� ���� �ִ� 5���� ���� ����
		Person[] pArr = new	Person[5];
		
		System.out.println("pArr : " + pArr);
		for(int i=0;i<pArr.length;i++) {
				System.out.println("pArr[" + i + "] : " + pArr[i]);
		}
		// �� �ε��� ���� ��ü�� �����Ͽ� �����ϱ�
		pArr[0] = new Person("���ǰ�", 20, '��', 175.8, 66.9);
		pArr[1] = new Person("������", 34, '��', 179.5, 96.1);
		pArr[2] = new Person("�����", 14, '��', 190.0, 77.3);
		pArr[3] = new Person("�����", 27, '��', 161.4, 56.8);
		pArr[4] = new Person("���̹�", 53, '��', 157.9, 58.3);
	
		for(int i=0;i<pArr.length;i++) {
			System.out.println("pArr[" + i + "] : " + pArr[i]);
		} // line 30 �� 5�� �۾��ϴ� ���̴�.
		
		Person seonje = new Person("����", 26, '��', 164.3, 48.6); // ��ü ����
		System.out.println(seonje);  // ��ü�� �ּҰ� ���
		System.out.println(seonje.personInfo()); // ��ü �ȿ� �ִ� personInfo() �޼ҵ� ������ ���	
	}
	public void method2() {
//		pArr[0] = new Person("���ǰ�", 20, '��', 175.8, 66.9);
//		pArr[1] = new Person("������", 34, '��', 179.5, 96.1);
//		pArr[2] = new Person("�����", 14, '��', 190.0, 77.3);
//		pArr[3] = new Person("�����", 27 , '��', 161.4, 56.8);
//		pArr[4] = new Person("���̹�", 53, '��', 157.9, 58.3);
		
		Person[] pArr = {new Person("���ǰ�", 20, '��', 175.8,66.9),
						 new Person("������", 34, '��', 179.5, 96.1),
						 new Person("�����", 14, '��', 190.0, 77.3),
						 new Person("�����", 27, '��', 161.4, 56.8),
						 new Person("���̹�", 53, '��', 157.9, 58.3)};
		
		for(int i=0;i<pArr.length;i++) {
			System.out.println(pArr[i].getName() + "���� ���� : " + pArr[i].personInfo());
			
		}
	}
}
	