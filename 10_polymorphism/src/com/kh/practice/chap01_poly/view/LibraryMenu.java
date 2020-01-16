package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.CookBook;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryMenu {
	private LibraryController lc = new LibraryController();
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("���� : ");
		int age =sc.nextInt();
		sc.nextLine();
		System.out.print("���� : ");
		char gender = sc.nextLine().charAt(0);
		
		Member mem = new Member(name,age,gender);
		lc.insertMember(mem);
		while(true) {
			System.out.println("\n==== �޴� ==== ");
			System.out.println("1. ����������");
			System.out.println("2. ���� ��ü ��ȸ");
			System.out.println("3. ���� �˻�");
			System.out.println("4. ���� �뿩�ϱ�");
			System.out.println("9. ���α׷� �����ϱ�");
			
			System.out.print("�޴� ��ȣ : ");
			int menuNum = sc.nextInt();
			sc.nextLine();
			
			if(menuNum==1) {
				System.out.println(lc.myInfo().toString()); 
			} else if(menuNum==2) {
				selectAll();
			} else if(menuNum==3) {
				searchBook();
			} else if(menuNum==4) {
				rentBook();
			} else if(menuNum==9) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		}
	}
	
	public void selectAll() {
		
		Book[] bList = lc.selectAll();

		
		for(int i=0;i<bList.length;i++) {
			if(bList[i] instanceof AniBook) {
				System.out.println(i+"������ : "+bList[i].getTitle()+" / "+bList[i].getAuthor()+" / "+bList[i].getPublisher()+" / "+((AniBook)bList[i]).getAccessAge());
			} else if(bList[i] instanceof CookBook) {
				System.out.println(i+"������ : "+bList[i].getTitle()+" / "+bList[i].getAuthor()+" / "+bList[i].getPublisher()+" / "+((CookBook)bList[i]).getCoupon());
			}		
		}
	}
	
	public void searchBook() {
		
		System.out.print("�˻��� ���� Ű���� : ");
		String keyword = sc.nextLine();
		
		lc.searchBook(keyword);
			
		for(int i=0;i<lc.searchBook(keyword).length;i++) {
			if(lc.searchBook(keyword)[i] != null) {
				System.out.println(lc.searchBook(keyword)[i].toString());
			}
		}
	}
	
	public void rentBook() {
		
		selectAll();
		
		System.out.print("�뿩�� ���� ��ȣ ���� : ");
		int index = sc.nextInt();
		
		int result = lc.rentBook(index);
		
		if(result==0) {
			System.out.println("���������� �뿩�Ǿ����ϴ�.");
		} else if(result==1) {
			System.out.println("���� �������� �뿩 �Ұ����Դϴ�.");
		} else if(result==2) {
			System.out.println("���������� �뿩�Ǿ����ϴ�.�丮�п� ������ �߱޵Ǿ����� �������������� Ȯ���ϼ���.");
		}

	}
}