package com.kh.hw.employee.view;

import java.util.Scanner;

import com.kh.hw.employee.controller.EmployeeController;

public class EmployeeMenu {
	private Scanner sc = new Scanner(System.in);
	private EmployeeController ec = new EmployeeController();

	public EmployeeMenu() {
		int menuNum=0;
		while(menuNum!=9) {
			System.out.println("1. ��� �߰�");
			System.out.println("2. ��� ����");
			System.out.println("3. ��� ����");
			System.out.println("4. ��� ���");
			System.out.println("9. ���α׷� ����");

			System.out.print("�޴� ��ȣ�� �������� : ");
			menuNum = sc.nextInt();

			if(menuNum==1) {
				insertEmp();
			} else if(menuNum==2) {
				updateEmp();
			} else if(menuNum==3){
				deleteEmp();
			} else if(menuNum==4) {
				printEmp();
			} else {
				System.out.println("������ �߸� �Է��ϼ̽��ϴ�.");
			}
		}
	}

	public void insertEmp() {
		System.out.print("��� ��ȣ : ");
		int empNo = sc.nextInt();

		System.out.print("��� �̸� : ");
		String name = sc.nextLine();

		sc.nextLine();

		System.out.print("��� ���� : ");
		char gender = sc.nextLine().charAt(0);

		System.out.print("��ȭ ��ȣ : ");
		String phone = sc.nextLine();

		System.out.print("�߰� ������ �� �Է��Ͻðڽ��ϱ�?(y/n) : ");
		char addInfo = sc.nextLine().charAt(0);

		if(addInfo=='y') {
			System.out.print("��� �μ� : ");
			String dept = sc.nextLine();

			System.out.print("��� ���� : ");
			int salary = sc.nextInt();

			System.out.print("���ʽ� �� : ");
			double bonus = sc.nextDouble();

			ec.add(empNo, name, gender, phone, dept, salary, bonus);		
		} else if(addInfo=='n') {
			ec.add(empNo, name, gender, phone);

		}
	}

	public void updateEmp() {
		System.out.println("���� �ֽ��� ��� ������ �����ϰ� �˴ϴ�.");
		System.out.println("����� � ������ �����Ͻðڽ��ϱ�?");
		System.out.println("1. ��ȭ ��ȣ");
		System.out.println("2. ��� ����");
		System.out.println("3. ���ʽ� ��");
		System.out.println("9. ���ư���");

		System.out.print("�޴� ��ȣ�� �������� : ");
		int menuNum = sc.nextInt();

		if(menuNum==1) {
			System.out.print("������ ��ȭ ��ȣ : ");
			String phone = sc.nextLine();
			ec.modify(phone);
		} else if(menuNum==2) {
			System.out.print("������ ��� ���� : ");
			int salary = sc.nextInt();
			ec.modify(salary);
		} else if(menuNum==3) {
			System.out.print("������ ���ʽ� �� : ");
			double bonus = sc.nextDouble();
			ec.modify(bonus);
		} else if(menuNum==9) {
			System.out.println("���θ޴��� ���ư��ϴ�.");

		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}

	public void deleteEmp() {
		System.out.print("���� �����Ͻðڽ��ϱ�? (y/n) : ");
		char ask = sc.nextLine().charAt(0);

		if(ask=='y') {
			ec.remove();
			System.out.println("������ ������ �����Ͽ����ϴ�.");
		} else if(ask=='n') {
			System.out.println("������ ������ �����Ͽ����ϴ�.");
		}
	}

	public void printEmp() {
		if(ec.inform()==null) {
			System.out.println("��� �����Ͱ� �����ϴ�.");
		} else if(ec.inform()!=null) {
			System.out.println(ec.inform());
		}
	}
}