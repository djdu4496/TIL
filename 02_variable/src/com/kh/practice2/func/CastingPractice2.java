package com.kh.practice2.func;
import java.util.*;
public class CastingPractice2 {
	public void method() {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("���� : ");
	double kor = sc.nextDouble();
		
	System.out.print("���� : ");
	double eng = sc.nextDouble();
		
	System.out.print("���� : ");
	double math = sc.nextDouble();
		
	int total = (int)(kor + eng + math);
	int average = total / 3;
	
	System.out.println("����: " + total);
	System.out.println("���: " + average);
}
	
}
