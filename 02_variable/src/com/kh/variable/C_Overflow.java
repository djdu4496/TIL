package com.kh.variable;

public class C_Overflow {

	public void overflow( ) {
		byte bNum = 127;
		bNum = (byte) (bNum + 1);  // bNum�� byte, 1�� int�̱� ������ �������� ���Դ�. �ϴ�, byte�� ��������.
		System.out.println("bNum : " + bNum);
	}
	
	public void calc() {
		int num1 = 1000000;
		int num2 = 700000;
		
//		int result = num1 * num2;
		long result = (long) num1 * num2; // long�� * int���� long���� �ȴ�(������(int)�� ū��(long)�� ���󰡱� �����̴�)
//		System.out.println(result);
		System.out.println("���� ���: " + result);
	}
}
