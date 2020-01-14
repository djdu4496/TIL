package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {
	private Scanner sc = new Scanner(System.in);
	private SquareController scr = new SquareController();
	private TriangleController tcr = new TriangleController();
	
	public void inputMenu() {
		// 삼각형과 사각형을 선택하게 하는 메소드
		
		System.out.println("===== 도형 프로그램 =====");
		System.out.println("3. 삼각형 ");
		System.out.println("4. 사각형 ");
		System.out.println("9. 프로그램 종료 ");
		System.out.print("메뉴 번호 : ");
		int type = sc.nextInt();
		
		if(type==3) {
			triangleMenu(type);
		} else if(type==4) {
			squareMenu(type);
		} else if(type==9) {
			System.out.println("프로그램을 종료합니다.");
		} else {
			inputMenu();
		}
	}
	
	public void triangleMenu(int type) {
		// 삼각형 메뉴 출력 메소드	
		System.out.println("===== 삼각형 =====");
		System.out.println("1. 삼각형 면적");
		System.out.println("2. 삼각형 색칠 ");
		System.out.println("3. 삼각형 정보 ");
		System.out.println("9. 메인으로");           //   1 2 3 4 
		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();		
		sc.nextLine();
		if(menuNum==1||menuNum==2) {
			inputSize(type, menuNum);
		} else if(menuNum==3) {
			printInformation(type);
		} else if(menuNum==9){
			System.out.println("메인으로 돌아갑니다.");
			inputMenu();
		} else {
			System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			triangleMenu(type);
		}
		
	}
	
	public void squareMenu(int type) {
		// 사각형 메뉴 출력 메소드
		
		System.out.println("===== 사각형 =====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 면적");
		System.out.println("3. 사각형 색칠 ");
		System.out.println("4. 사각형 정보 ");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();
		
		if(menuNum==1||menuNum==2||menuNum==3) {
			inputSize(type,menuNum);
		} else if(menuNum==4) {
			printInformation(type);
		} else if(menuNum==9){
			System.out.println("메인으로 돌아갑니다.");
			inputMenu();
		} else {
			System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			squareMenu(type);
		}
	}
	
	public void inputSize(int type, int menuNum) {
		// 너비와 높이를 받아 요청사항을 처리하거나 색깔을 받아 요청사항을 처리하는 메소드
		if(type==3&&menuNum==1) {
			
			System.out.print("높이 : ");
			int height = sc.nextInt();
			sc.nextLine();
			System.out.print("너비 : ");
			int width = Integer.parseInt(sc.nextLine());
			
			tcr.calcArea(height, width);
			
			System.out.println("삼각형 면적 : " + tcr.calcArea(height,width));
			
			triangleMenu(type);
			
		} else if(type==3&&menuNum==2) {
			
			System.out.print("색깔을 입력해주세요 : ");
			String color = sc.nextLine();
			
			
			
			tcr.paintColor(color);
			
			System.out.println("색이 수정되었습니다.");	
			
			triangleMenu(type);
		}
		
		if(type==4&&menuNum==1) {
			
			System.out.print("높이 : ");
			int height = sc.nextInt();
			
			System.out.print("너비 : ");
			int width = sc.nextInt();
				
			scr.calcArea(height, width);
			
			System.out.println("둘레 : " + scr.calcPerimeter(height,width));
			
			squareMenu(type);
		} else if(type==4&&menuNum==2) {
		
			System.out.print("높이 : ");
			int height = sc.nextInt();
			
			System.out.print("너비 : ");
			int width = sc.nextInt();
				
			scr.calcArea(height, width);
			
			System.out.println("사각형 면적 : " + scr.calcArea(height,width));
			
			squareMenu(type);
		} else if(type==4&&menuNum==3) {
			
			System.out.print("색깔 : ");
			String color = sc.nextLine();
			
			sc.nextLine();
			
			scr.paintColor(color);
			
			System.out.println("색이 수정되었습니다.");
			
			squareMenu(type);
		}
	}
	
	public void printInformation(int type) {
		if(type==3) {
			
			System.out.println(tcr.print());
			
			triangleMenu(type);
			
		} else if(type==4) {
			
			System.out.println(scr.print());
			
			squareMenu(type);
			
		}
	}
}
