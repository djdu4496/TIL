package com.kh.example.chap03_user.controller;

import java.util.Scanner;

import com.kh.example.chap03_user.model.exception.MyException;

public class UserExceptionController {
	public void inputAge() {
		// ���̸� �Է��ϼ��� ��� ������ �߰� �ű⿡ ����ڰ� ���̸� �Է��ϸ� age������ �Է� ���� �� ����
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		
		try {
			checkAge(age);
		} catch(MyException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void checkAge(int age) throws MyException {
		if(age<19) {
			throw new MyException("����Ұ�");
		} else {
			System.out.println("��");
		}
	}
}
