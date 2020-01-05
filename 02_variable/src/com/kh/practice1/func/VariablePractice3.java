package com.kh.practice1.func;
import java.util.*;
public class VariablePractice3 {

	public void inputScanner5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		double horizon = sc.nextDouble();
		
		System.out.print("세로 : ");
		double vertical = sc.nextDouble();
		
		double area = horizon * vertical;
		System.out.println("면적 : " + area);
		
		double round = 2*(horizon + vertical);
		System.out.println("둘레 : " + round);
	}
}

