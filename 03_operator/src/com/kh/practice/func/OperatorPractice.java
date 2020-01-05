package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	public void practice1(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		if(num>0) {
			System.out.println("�����");
		}	else {
			System.out.println("����� �ƴϴ�");
		}
	}
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		if(num>0) {
			System.out.println("�����");
		}	else if(num==0) {
			System.out.println("0�̴�");
		}	else {
			System.out.println("������");
		}
	}
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		if(num/2==0) {
			System.out.println("¦����");
		} else {
			System.out.println("Ȧ����");
		}
	}
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ο� �� : ");
		int peopleNum = sc.nextInt();
		
		System.out.print("���� ����: ");
		int candyNum = sc.nextInt();
		
		int perHead = candyNum / peopleNum;
		int rest = candyNum % peopleNum;
		
		
		System.out.println("1�δ� ���� ���� : " + perHead);
		System.out.println("���� ���� ���� : " + rest);
	}
	public void practice5() {						// charAt(); ���ذ� // �Ҽ��� �Ʒ� ��°�ڸ����� ���ذ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("�г� : ");
		int grade = sc.nextInt();
		
		System.out.print("�� : ");
		int classNum = sc.nextInt();
		
		System.out.print("��ȣ : ");
		int number = sc.nextInt();
		
		System.out.print("����(M/F) : ");
		String userGender = sc.nextLine();
		char gender = userGender.charAt(0);
		
		System.out.print("����(�Ҽ��� �Ʒ� ��°�ڸ�����) : ");
		double score = sc.nextDouble();
		
		System.out.println(grade + "�г� " + classNum + "�� " + number + "�� " + name + "" + gender + "�л��� ������ " + score + "�̴�.");	
	}
	
	public void practice6() {						
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		System.out.println("");
		
		if(age<=13) {
			System.out.println("���");
		} else if(age>19) {
			System.out.println("����");
		}	else {
			System.out.println("û�ҳ�");
		}
	}
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int kor = sc.nextInt();
		
		System.out.print("���� : ");
		int eng = sc.nextInt();
		
		System.out.print("���� : ");
		int math = sc.nextInt();
		
		int total = kor + eng + math;
		double average = (double)total / 3;
		
		System.out.println("");
		
		System.out.println("�հ� : " + total);
		System.out.println("��� : " + average);
		
		if (kor >= 40 && eng >= 40 && math >= 40 && average >= 60) {
			System.out.println("�հ�");
		} else {
			System.out.println("���հ�");
		}
	}
	public void practice8() {						// charAt(); ���ذ�
		Scanner sc = new Scanner(System.in);
		// �ֹι�ȣ�� �̿��Ͽ� �������� �������� �����Ͽ� ����ϼ���.
		// method 1----------------------------------
		System.out.print("�ֹι�ȣ�� �Է��ϼ���(- ����) : ");
		String user = sc.nextLine();
		
		
		//123456-2123456
		char userGender = user.charAt(7);
		String gender = userGender == '1' || userGender == '3' ? "����" : "����";
		System.out.println(gender);
		//method 2-------------------------------------

		if(userGender == '1' || userGender == '3') {
			System.out.println("����");
		}	else {
			System.out.println("����");
		}
	}
	public void practice9() {					// ��, num1�� num2���� �۾ƾ� �� ???
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("����2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("�Է� : ");
		int num3 = sc.nextInt();
		
		if(num3 <= num1 || num3 > num2) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է�1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("�Է�2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("�Է�3 : ");
		int num3 = sc.nextInt();	
		
		System.out.println("");
		
		if(num1 == num2 && num2 == num3) {
			System.out.println("true");
		}	else {
			System.out.println("false");
		}
	}
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A����� ���� : ");
		int aWage = sc.nextInt();
		
		System.out.print("B����� ���� : ");
		int bWage = sc.nextInt();
		
		System.out.print("C����� ���� : ");
		int cWage = sc.nextInt();	
		
		System.out.println("");
		
		double aWageTotal = (double)aWage + 1000.0;
		double bWageTotal = (double)bWage + 0.0;
		double cWageTotal = (double)cWage + 389.9999999999995;
		
		System.out.println("A��� ����/����+a : " + aWage + "/" + aWageTotal );
		if(aWageTotal >= 3000.0) {
			System.out.println("3000 �̻�");
		} else {
			System.out.println("3000 �̸�");
		}
		
		System.out.println("B��� ����/����+a : " + bWage + "/" + bWageTotal );
		if(bWageTotal >= 3000.0) {
			System.out.println("3000 �̻�");
		} else {
			System.out.println("3000 �̸�");
		}
		
		System.out.println("A��� ����/����+a : " + cWage + "/" + cWageTotal );
		if(cWageTotal >= 3000.0) {
			System.out.println("3000 �̻�");
		} else {
			System.out.println("3000 �̸�");
		}
		// ----------------------------------------------
		/* ������ Ǯ�̹��
		 * double aIncen = a * 1.4;
		 * double bIncen = b;
		 * double cIncen = c * 1.15;  // (���� ��) double cIncen = c + c * 0.15;
		 * 
		 * String s1 = "3000 �̻�";
		 * String s2 = "3000 �̸�";
		 * 
		 * System.out.println("A��� ����/����+a : " + a + "/" + aIncen);
		 * System.out.println(aIncen >= 3000 ? s1 : s2);
		 * System.out.println("B��� ����/����+a : " + b + "/" + bIncen);
		 * System.out.println(bIncen >= 3000 ? s1 : s2);
		 * System.out.println("B��� ����/����+a : " + c + "/" + cIncen);
		 * System.out.println(cIncen >= 3000 ? s1 : s2); 
		 */
	}
}
	

