package com.kh.hw.person.view;

import java.util.Scanner;
import com.kh.hw.person.controller.PersonController;

public class PersonMenu {
	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();
	
	public void mainMenu() {
		System.out.println("�л��� �ִ� 3����� ������ �� �ֽ��ϴ�.");
		System.out.println("���� ����� �л��� " + M + "���Դϴ�." );
		System.out.println("����� �ִ� 10����� ������ �� �ֽ��ϴ�.");
		System.out.println("���� ����� ����� " + N + "���Դϴ�.");
		
		System.out.println("1. �л� �޴�");
		System.out.println("2. ��� �޴�");
		System.out.println("9. ������");
		
		System.out.print("�޴� ��ȣ : ");
		int menuNum = sc.nextInt();
		
		if(menuNum==1) {
			studentMenu();
		} else if(menuNum==2) {
			employeeMenu();
		} else if(menuNum==9) {
			System.out.println("�����մϴ�.");
		}
		
	}
	
	public void studentMenu() {
		System.out.println("1. �л� �߰�");
		System.out.println("2. �л� ����");
		System.out.println("9. ��������");
		
		System.out.print("�޴� ��ȣ : ");
		int menuNum = sc.nextInt();
		
		if(menuNum==9) {
			mainMenu();
		} else if(menuNum==1) {
			
		}
	}
	
	public void employeeMenu() {
		
	}
	
	public void insertStudent() {
		
	}
	
	public void printStudent() {
		
	}
	
	public void insertEmployee() {
		
	}
	
	public void printEmployee() {
		
	}
}
