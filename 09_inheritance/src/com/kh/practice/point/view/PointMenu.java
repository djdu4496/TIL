package com.kh.practice.point.view;

import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu {
	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("===== �޴� =====");
			System.out.println("1. �� : ");
			System.out.println("2. �簢�� : ");
			System.out.println("9. ������ : ");
			System.out.print("�޴� ��ȣ : ");
			int menuNum = sc.nextInt();
			
			if(menuNum==1) {
				circleMenu();
			} else if (menuNum==2) {
				rectangleMenu();
			} 
		}	
	}
	

	
	public void circleMenu() {
		System.out.println("===== �� �޴� =====");
		System.out.println("1. �� �ѷ� : ");
		System.out.println("2. �� ���� : ");
		System.out.println("3. �������� : ");
		System.out.print("�޴� ��ȣ : ");
		int menuNum1 = sc.nextInt();

		if(menuNum1==1) {
			calcCircum();
		} else if(menuNum1 == 2) {
			calcCircleArea();
		}
	}
	
	public void rectangleMenu() {
		System.out.println("===== �簢�� �޴� =====");
		System.out.println("1. �簢�� �ѷ� : ");
		System.out.println("2. �簢�� ���� : ");
		System.out.println("3. �������� : ");
		System.out.print("�޴� ��ȣ : ");
		int menuNum1 = sc.nextInt();
		
		if(menuNum1==1) {
			calcPerimeter();
		} else if(menuNum1==2) {
			calcRectArea();
		} else if(menuNum1==3) {
			mainMenu();
		}
	}
	
	public void calcCircum() {
		System.out.print("x ��ǥ : ");
		int x = sc.nextInt();
		System.out.print("y ��ǥ : ");
		int y = sc.nextInt();
		System.out.print("������ : ");
		int radius = sc.nextInt();
		cc.calcCircum(x,y,radius);
	}
	
	public void calcCircleArea() {
		System.out.print("x ��ǥ : ");
		int x = sc.nextInt();
		System.out.print("y ��ǥ : ");
		int y = sc.nextInt();
		System.out.print("������ : ");
		int radius = sc.nextInt();
		cc.calcArea(x, y, radius);
	}
	
	public void calcPerimeter() {
		System.out.print("x ��ǥ : ");
		int x = sc.nextInt();
		System.out.print("y ��ǥ : ");
		int y = sc.nextInt();
		System.out.print("���� : ");
		int height = sc.nextInt();
		System.out.print("���� : ");
		int width = sc.nextInt();
		
		rc.calcPerimeter(x, y, height, width);

	}
	
	public void calcRectArea() {
		System.out.print("x ��ǥ : ");
		int x = sc.nextInt();
		System.out.print("y ��ǥ : ");
		int y = sc.nextInt();
		System.out.print("���� : ");
		int height = sc.nextInt();
		System.out.print("���� : ");
		int width = sc.nextInt();
		
		rc.calcArea(x, y, height, width);
	}
	
	
	
}
