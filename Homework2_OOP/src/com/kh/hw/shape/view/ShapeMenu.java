package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {
	private Scanner sc = new Scanner(System.in);
	private SquareController scr = new SquareController();
	private TriangleController tcr = new TriangleController();
	
	public void inputMenu() {
		// �ﰢ���� �簢���� �����ϰ� �ϴ� �޼ҵ�
		
		System.out.println("===== ���� ���α׷� =====");
		System.out.println("3. �ﰢ�� ");
		System.out.println("4. �簢�� ");
		System.out.println("9. ���α׷� ���� ");
		System.out.print("�޴� ��ȣ : ");
		int type = sc.nextInt();
		
		if(type==3) {
			triangleMenu(type);
		} else if(type==4) {
			squareMenu(type);
		} else if(type==9) {
			System.out.println("���α׷��� �����մϴ�.");
		} else {
			inputMenu();
		}
	}
	
	public void triangleMenu(int type) {
		// �ﰢ�� �޴� ��� �޼ҵ�	
		System.out.println("===== �ﰢ�� =====");
		System.out.println("1. �ﰢ�� ����");
		System.out.println("2. �ﰢ�� ��ĥ ");
		System.out.println("3. �ﰢ�� ���� ");
		System.out.println("9. ��������");           //   1 2 3 4 
		System.out.print("�޴� ��ȣ : ");
		int menuNum = sc.nextInt();		
		sc.nextLine();
		if(menuNum==1||menuNum==2) {
			inputSize(type, menuNum);
		} else if(menuNum==3) {
			printInformation(type);
		} else if(menuNum==9){
			System.out.println("�������� ���ư��ϴ�.");
			inputMenu();
		} else {
			System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է����ּ���.");
			triangleMenu(type);
		}
		
	}
	
	public void squareMenu(int type) {
		// �簢�� �޴� ��� �޼ҵ�
		
		System.out.println("===== �簢�� =====");
		System.out.println("1. �簢�� �ѷ�");
		System.out.println("2. �簢�� ����");
		System.out.println("3. �簢�� ��ĥ ");
		System.out.println("4. �簢�� ���� ");
		System.out.println("9. ��������");
		System.out.print("�޴� ��ȣ : ");
		int menuNum = sc.nextInt();
		
		if(menuNum==1||menuNum==2||menuNum==3) {
			inputSize(type,menuNum);
		} else if(menuNum==4) {
			printInformation(type);
		} else if(menuNum==9){
			System.out.println("�������� ���ư��ϴ�.");
			inputMenu();
		} else {
			System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է����ּ���.");
			squareMenu(type);
		}
	}
	
	public void inputSize(int type, int menuNum) {
		// �ʺ�� ���̸� �޾� ��û������ ó���ϰų� ������ �޾� ��û������ ó���ϴ� �޼ҵ�
		if(type==3&&menuNum==1) {
			
			System.out.print("���� : ");
			int height = sc.nextInt();
			sc.nextLine();
			System.out.print("�ʺ� : ");
			int width = Integer.parseInt(sc.nextLine());
			
			tcr.calcArea(height, width);
			
			System.out.println("�ﰢ�� ���� : " + tcr.calcArea(height,width));
			
			triangleMenu(type);
			
		} else if(type==3&&menuNum==2) {
			
			System.out.print("������ �Է����ּ��� : ");
			String color = sc.nextLine();
			
			
			
			tcr.paintColor(color);
			
			System.out.println("���� �����Ǿ����ϴ�.");	
			
			triangleMenu(type);
		}
		
		if(type==4&&menuNum==1) {
			
			System.out.print("���� : ");
			int height = sc.nextInt();
			
			System.out.print("�ʺ� : ");
			int width = sc.nextInt();
				
			scr.calcArea(height, width);
			
			System.out.println("�ѷ� : " + scr.calcPerimeter(height,width));
			
			squareMenu(type);
		} else if(type==4&&menuNum==2) {
		
			System.out.print("���� : ");
			int height = sc.nextInt();
			
			System.out.print("�ʺ� : ");
			int width = sc.nextInt();
				
			scr.calcArea(height, width);
			
			System.out.println("�簢�� ���� : " + scr.calcArea(height,width));
			
			squareMenu(type);
		} else if(type==4&&menuNum==3) {
			
			System.out.print("���� : ");
			String color = sc.nextLine();
			
			sc.nextLine();
			
			scr.paintColor(color);
			
			System.out.println("���� �����Ǿ����ϴ�.");
			
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
