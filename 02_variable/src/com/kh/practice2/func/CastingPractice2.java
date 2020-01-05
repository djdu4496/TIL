package com.kh.practice2.func;
import java.util.*;
public class CastingPractice2 {
	public void method() {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("±¹¾î : ");
	double kor = sc.nextDouble();
		
	System.out.print("¿µ¾î : ");
	double eng = sc.nextDouble();
		
	System.out.print("¼öÇÐ : ");
	double math = sc.nextDouble();
		
	int total = (int)(kor + eng + math);
	int average = total / 3;
	
	System.out.println("ÃÑÁ¡: " + total);
	System.out.println("Æò±Õ: " + average);
}
	
}
