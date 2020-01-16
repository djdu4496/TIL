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
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age =sc.nextInt();
		sc.nextLine();
		System.out.print("성별 : ");
		char gender = sc.nextLine().charAt(0);
		
		Member mem = new Member(name,age,gender);
		lc.insertMember(mem);
		while(true) {
			System.out.println("\n==== 메뉴 ==== ");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			
			System.out.print("메뉴 번호 : ");
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
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}
	
	public void selectAll() {
		
		Book[] bList = lc.selectAll();

		
		for(int i=0;i<bList.length;i++) {
			if(bList[i] instanceof AniBook) {
				System.out.println(i+"번도서 : "+bList[i].getTitle()+" / "+bList[i].getAuthor()+" / "+bList[i].getPublisher()+" / "+((AniBook)bList[i]).getAccessAge());
			} else if(bList[i] instanceof CookBook) {
				System.out.println(i+"번도서 : "+bList[i].getTitle()+" / "+bList[i].getAuthor()+" / "+bList[i].getPublisher()+" / "+((CookBook)bList[i]).getCoupon());
			}		
		}
	}
	
	public void searchBook() {
		
		System.out.print("검색할 제목 키워드 : ");
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
		
		System.out.print("대여할 도서 번호 선택 : ");
		int index = sc.nextInt();
		
		int result = lc.rentBook(index);
		
		if(result==0) {
			System.out.println("성공적으로 대여되었습니다.");
		} else if(result==1) {
			System.out.println("나이 제한으로 대여 불가능입니다.");
		} else if(result==2) {
			System.out.println("성공적으로 대여되었습니다.요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요.");
		}

	}
}