package com.kh.practice1.func;
import java.util.*;
public class VariablePractice4 {

	public void inputScanner6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String something = sc.nextLine();
		
		char index1 = something.charAt(0);
		System.out.println("ù ��° ���� : " + index1);
		
		char index2 = something.charAt(1);
		System.out.println("�� ��° ���� : " + index2);
		
		char index3 = something.charAt(2);
		System.out.println("�� ��° ���� : " + index3);
	}
}
