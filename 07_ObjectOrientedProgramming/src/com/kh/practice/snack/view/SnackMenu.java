package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {
	private Scanner sc = new Scanner(System.in);
	private SnackController scr = new SnackController();
	
	public void menu() {
		System.out.println("�������� �Է��ϼ���.");
		
		System.out.print("���� : ");
		String kind = sc.nextLine();
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("�� : ");
		String flavor = sc.nextLine();
		
		System.out.print("���� : ");
		int numOf = sc.nextInt();
		
		System.out.print("���� : ");
		int price = sc.nextInt();
		
		sc.nextLine();	// ���� �ٹٲ� issue
		
		String result=scr.saveData(kind, name, flavor, numOf, price);
		
		System.out.println(result);
		
		System.out.print("������ ������ Ȯ���Ͻðڽ��ϱ�?(y/n) : ");
		char cf = sc.nextLine().charAt(0);
		
		if(cf=='y') {
			System.out.println(scr.confirmData());
//			scr.confirmData();
		} 
	}
}
