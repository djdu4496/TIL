package com.kh.variable;

public class C_Overflow {

	public void overflow( ) {
		byte bNum = 127;
		bNum = (byte) (bNum + 1);  // bNum은 byte, 1은 int이기 때문에 빨간줄이 나왔다. 일단, byte로 묶어주자.
		System.out.println("bNum : " + bNum);
	}
	
	public void calc() {
		int num1 = 1000000;
		int num2 = 700000;
		
//		int result = num1 * num2;
		long result = (long) num1 * num2; // long형 * int형은 long형이 된다(작은애(int)가 큰애(long)을 따라가기 때문이다)
//		System.out.println(result);
		System.out.println("개선 결과: " + result);
	}
}
