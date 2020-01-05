package com.kh.example.chap01.condition;

import java.util.Scanner;

public class D_Switch {
		// ���ǽ��� ��� ���� case���� ã�� ����� �����ϴ� ���ǹ�
		// �ش��ϴ� ���� case�� ���� ��쿡�� default�� ��ɹ� ����
	
		// case�� ���๮ ���̿��� �ݷ�(:)�� ����ϸ�
		// break�� ������ ������ �ʰ� ��� ������
	public void method1() {
		// ���� �� ���� ���� ��ȣ ���� 1���� �Է� �޾Ƽ�
		// ���� ��ȣ ���ڿ� �ش��ϴ� ����� �����ϰ� ����ϼ���
		/*
		 * 	ù ��° �� : 
		 *  �� ��° �� : 
		 *  ������(+, -, *, /) : 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° �� : ");
		int first = sc.nextInt();
		System.out.print("�� ��° �� : ");
		int second = sc.nextInt();
		
		sc.nextLine();                 // <<---------------------------------------------------	 ��� 2.
		
		System.out.print("������(+, -, *, /) : ");
		char op = sc.nextLine().charAt(0);

		// ------------------------------------
		
		int result = 0;	// ���� ��� ����� ����
		
		switch(op) {
		case '+':
			result = first + second;
			break;
		
		case '-':
			result = first - second;
			break;
			
		case '*':
			result = first * second;
			break;
			
		case '/':
			result = first * second;
		}
		
		System.out.println(first + "" + op + "" + second + " = " + result);
	}
	public void method2() {
		// ������ �Է��Ͽ� 1000, �ٳ����� 3000, �����ƴ� 2000, Ű���� 5000,
		// ���ϰ��Կ� ���� ������ �Է����� ���� "�߸��Է��Ͽ����ϴ�" ����ϰ� �϶�
		// ���� �̸��� �Է��Ͻÿ� :
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �̸��� �Է��Ͻÿ� : ");
		String fruit = sc.nextLine();

		int price = 0;
		
		switch(fruit) {
		case "���":
			price = 1000;
			break;
		case "�ٳ���":
			price = 3000;
			break;
		case "������":
			price = 2000;
			break;
		case "Ű��":
			price = 5000;
			break;
		default:
			System.out.println("�߸��Է��Ͽ����ϴ�");
			return;	// return : ���� ȣ���� �޼ҵ�(method)���� ���ư��� ��
				 	// 			�̶� ���� ������ ���ư� ���� �ְ� �ƹ��͵� ���� ���ư� ���� ����
					// ���ǿ� ���� ������ ������ �� �ֱ� ������, �� ��� return;���ᵵ �������� �� ���
		}
		
		System.out.println(fruit + "�� ������ " + price + "���Դϴ�.");
		
	}
	public void method3() {
		// ����ڰ� �Է��� �޴� ��ȣ�� ���� �޴��� ��µǰ� �Ͻÿ�
		/*
		 1. ȸ�� ���
		 2. ȸ�� ����
		 3. ȸ�� ����
		 �޴� ��ȣ�� �Է��Ͻÿ� : 
		  */
		Scanner sc = new Scanner(System.in);
		System.out.println("1. ȸ�� ���");
		System.out.println("2. ȸ�� ����");
		System.out.println("3. ȸ�� ����");
		System.out.print("�޴� ��ȣ�� �Է��Ͻÿ� : ");
		
		int menu = sc.nextInt();
		
		switch (menu) {
		case 1:
			System.out.println("ȸ�� ��� �޴��Դϴ�.");
			break;
		case 2:
			System.out.println("ȸ�� ���� �޴��Դϴ�.");
			break;
			
		case 3:
			System.out.println("ȸ�� ���� �޴��Դϴ�.");
			break;
			
		default :
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			
		}

	}
	public void method4() {
		// 1������ 12������ �Է� �޾� �ش��ϴ� ���� ������ ��¥�� ����ϼ���
		// �Է��Ͻ� ���� 00�ϱ����Դϴ�.
		Scanner sc = new Scanner(System.in);
		System.out.print("1��~12������ �� �ϳ��� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("�Է��Ͻ� ���� 31�ϱ����Դϴ�.");
			break;
		case 2:
			System.out.println("�Է��Ͻ� ���� 28�ϱ����Դϴ�.");
			break;
		case 3:
			System.out.println("�Է��Ͻ� ���� 31�ϱ����Դϴ�.");
			break;
		case 4:
			System.out.println("�Է��Ͻ� ���� 30�ϱ����Դϴ�.");
			break;
		case 5:
			System.out.println("�Է��Ͻ� ���� 31�ϱ����Դϴ�.");
			break;
		case 6:
			System.out.println("�Է��Ͻ� ���� 30�ϱ����Դϴ�.");
			break;
		case 7:
			System.out.println("�Է��Ͻ� ���� 31�ϱ����Դϴ�.");
			break;
		case 8:
			System.out.println("�Է��Ͻ� ���� 31�ϱ����Դϴ�.");
			break;
		case 9:
			System.out.println("�Է��Ͻ� ���� 30�ϱ����Դϴ�.");
			break;
		case 10:
			System.out.println("�Է��Ͻ� ���� 31�ϱ����Դϴ�.");
			break;
		case 11:
			System.out.println("�Է��Ͻ� ���� 30�ϱ����Դϴ�.");
			break;
		case 12:
			System.out.println("�Է��Ͻ� ���� 31�ϱ����Դϴ�.");			
		}
		// -------------------------------------------------
		/* ������ Ǯ�� ���(ȿ���� ���)
		 switch(num) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("�Է��Ͻ� ���� 31�ϱ����Դϴ�.")
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("�Է��Ͻ� ���� 30�ϱ����Դϴ�.")
		case 2:	
			System.out.println("�Է��Ͻ� ���� 28�� Ȥ�� 29�ϱ����Դϴ�.");
			break;	
		default:
			System.out.prinln("�ݵ�� 1~12 ������ ���ڸ� �Է����ּ���.");
		} 
		 */	
	}
}
