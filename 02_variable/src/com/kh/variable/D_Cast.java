package com.kh.variable;

public class D_Cast {
	public void rule1() {
		boolean flag = true;
//		boolean flag2 = 100; // boolean�� ����ȯ���� ���ܵȴ�. boolean only true or false.
		int num = 'A';  // ������ char�� ������ int���� �� �� �ִ�. �ٰ�: ��ǻ�ʹ� �������� �����ڵ� ������� �д´�.
		System.out.println("num: " + num);
		
		char ch = 97;  // ���׿� ���ͷ�, 97�� �ְ� �ֱ� ������ ������ ���� �ʾҴ�. ������ int�� ������ 'char' ���� �� �� �ִ�
		System.out.println("ch : " + ch);
		
		char ch2 = (char) num;  // ����: Type mismatch: cannot convert from int to char
						 		// 'num'�� ���� �ƴ�, '����'��. 
								// ������ ���� ���� ������ ���� ũ�⸸ �� �� �ִ�. 
								// 'num'�� 4byte. 
								// 'char'�� 2byte��. ũ�� �񱳸� �Ǳ� ������ error�� �ߴ� ���̴�.
								// �̷� ��, 'num'�� char�� ���� ����ȯ�� ���� �Ѵ�.
		System.out.println("ch2 : " + ch2);
		
		int num2 = -97;
		char ch3 = (char)num2;
		System.out.println("ch3 : " + ch3);  // ����ǥ�� ���� �ߴ� �� �ƴ϶� ������ char�� ���� �����̱� ������ ?�� ��µ� ���̴�.
	}
	
	public void rule2() {
		int iNum = 10;
		long lNum = 100;
		
//		int result = iNum + lNum;  // ����: ���� ���� ū�� ���󰡱� ������ long�� �Ǵ� ���� int�� ����������� �ϱ� ������ error�� ����.
								   // ������ ū �ڷ������� �ڵ� ����ȯ�� �� �� ����ó���� �Ǳ� ������
									// iNum + lNum�� ����� long���� �� ����.
		// iNum + lNum�� int result�� ������ �� �ִ� ���
		// ��� 1. ���� ����� int�� ���� ����ȯ
//		int result = (int) (iNum + lNum);  // (int)�� ����, (iNum + lNum)�� �̷��� �����ش�.
		// ��� 2. long���� int�� ���� ����ȯ
//		int result = iNum + (int)lNum;
		// ��� 3. ��� ���� �����ϴ� result�� long���� ����
//		long result = iNum + lNum;
	}
	
	public void rule3() {
		int iNum = 290;
		
		byte bNum = (byte)iNum; // ����: int��� ū �ڷ����� byte��� ���� �ڷ����� ������ �ϱ� ����
								// ���� ����ֱ� ���� byte�� ����ȯ�� ���ְ� �׷��� ���� ���� �߶󳽴�.
								// �߶󳻴� �κп� �����Ͱ� �������� �� �κ��� ������ �Ϻΰ� �սǵ� �����Ͱ� ����Ʈ �ȿ� ����. 
		                        // �� ����� 34�� ���� ���̰� �̰� ������ �ս��̴�.

		System.out.println("bNum : " + bNum);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
