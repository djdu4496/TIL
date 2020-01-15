package com.kh.practice.numRange.view;

import java.util.Scanner;

import com.kh.practice.numRange.controller.NumberController;
import com.kh.practice.numRange.exception.NumRangeException;

public class NumberMenu {
	Scanner sc = new Scanner(System.in);
	NumberController nc = new NumberController();
	public void menu() {
		while(true) {
			System.out.print("����1 : ");
			int num1 = sc.nextInt();
			System.out.print("����2 : ");
			int num2 = sc.nextInt();

			
			try {
				
				System.out.print(num1+"��(��) " + num2 + "�� ����ΰ� ? "+nc.checkDouble(num1, num2));

				System.out.println("\n�Ǵ�\n");
				
			} catch(NumRangeException nre) {
				nre.printStackTrace();
				break;
			}


		}
	}
}