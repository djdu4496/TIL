package com.kh.example.list.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.example.list.model.vo.Student;

public class ListController {
	public void doList() {
		List list1 = new ArrayList();
//		list1.
//		List<Student> list = new ArrayList</*Student(��������)*/>();
		List<Student> list = new ArrayList<>();
		// add(E e) : ����Ʈ ���� ������ e �߰�
		list.add(new Student("�׽�Ʈ",0));
		list.add(new Student("�����",60));
		
		System.out.println("list : " + list);
		
		// �÷��� ���� 1. ũ���� ������ ����.
		list.add(new Student("������",90));
		list.add(new Student("����ȣ",85));
		
		System.out.println("���� list�� ��� element ���� : " + list.size());
		System.out.println("list : " + list);
		
		list.add(new Student("���̹�",66));
		System.out.println("���� list�� ��� element ���� : " + list.size());
		System.out.println("list : " + list);
		
		// �÷��� ���� 2. �߰�/����/���� ���� ���ó���� ������
		// add(int index, E e) : index��° �ε����� e �߰�
		list.add(0, new Student("�����", 100));
		System.out.println("list : " + list);

		list.add(3, new Student("���ǰ�", 40));
		System.out.println("list : " + list);
		
		// remove(int index) : �ش� index��° ��ü ����
		list.remove(1);
		System.out.println("list : " + list);
		
		// remove(Object o) : �ش� Object��ü����
		list.remove(new Student("���ǰ�", 40));
		System.out.println("list : " + list);
		
		// ���� ��� 1. Collections Ŭ���� �̿�	// Collections Ŭ���� : �÷����� �̿��� �� �� ���� ���ִ� �޼ҵ带 ��Ƴ��� Ŭ����
		Collections.sort(list);
		System.out.println("list : " + list);
		
//		ArrayList<String> strList = new ArrayList<String>();
//		strList.add("����ð�");
//		strList.add("���ɽð�");
//		strList.add("��ٽð�");
//		strList.add("���ð�");
//		strList.add("��ٽð�");
//		strList.add("��ħ�ð�");
		
//		System.out.println(strList);
//		Collections.sort(strList);
//		System.out.println(strList);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
