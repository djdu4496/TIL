package com.kh.practice2.func;
import java.util.*;
public class CastingPractice1 {
	public void method() {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("���� : ");
		char ch = sc.nextLine().charAt(0);
		
		int codeNumber = (int) ch;  // ������ char�� ������ 'int'�� ���� ����ȯ
		System.out.println("A unicode : " + codeNumber);
		
	}
}
