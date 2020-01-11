package com.kh.practice.point.view;

import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu {
	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();
	
	public void mainMenu() {
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 원 : ");
			System.out.println("2. 사각형 : ");
			System.out.println("9. 끝내기 : ");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			
			if(menuNum==1) {
				circleMenu();
			} else if (menuNum==2) {
				rectangleMenu();
			} else if (menuNum==9) {
				mainMenu();
			} else {
				System.out.println("종료합니다.");
			}
	}
	

	
	public void circleMenu() {
		System.out.println("===== 원 메뉴 =====");
		System.out.println("1. 원 둘레 : ");
		System.out.println("2. 원 넓이 : ");
		System.out.println("3. 메인으로 : ");
		System.out.print("메뉴 번호 : ");
		int menuNum1 = sc.nextInt();

		if(menuNum1==1) {
			calcCircum();
		} else if(menuNum1 == 2) {
			calcCircleArea();
		}
	}
	
	public void rectangleMenu() {
		System.out.println("===== 사각형 메뉴 =====");
		System.out.println("1. 사각형 둘레 : ");
		System.out.println("2. 사각형 넓이 : ");
		System.out.println("3. 메인으로 : ");
		System.out.print("메뉴 번호 : ");
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
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("반지름 : ");
		int radius = sc.nextInt();
//M1 	String result = cc.calcCircum(x,y,radius);
//		System.out.println(result);
//M2		
		System.out.println(cc.calcCircum(x, y, radius));
		
	}
	
	public void calcCircleArea() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("반지름 : ");
		int radius = sc.nextInt();
		cc.calcArea(x, y, radius);
		
		System.out.println(cc.calcArea(x,y,radius));
	}
	
	public void calcPerimeter() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("높이 : ");
		int height = sc.nextInt();
		System.out.print("너비 : ");
		int width = sc.nextInt();
		
		System.out.println(rc.calcPerimeter(x,y,height,width));

	}
	
	public void calcRectArea() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("높이 : ");
		int height = sc.nextInt();
		System.out.print("넓이 : ");
		int width = sc.nextInt();
		
		System.out.println(rc.calcArea(x, y, height, width));
	}
	
	
	
}
