package com.kh.practice1.func;
import java.util.*;
public class VariablePractice3 {

	public void inputScanner5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		double horizon = sc.nextDouble();
		
		System.out.print("���� : ");
		double vertical = sc.nextDouble();
		
		double area = horizon * vertical;
		System.out.println("���� : " + area);
		
		double round = 2*(horizon + vertical);
		System.out.println("�ѷ� : " + round);
	}
}

