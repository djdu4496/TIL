package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.CookBook;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryController {

	private Member mem=null;
	private Book[] bList = new Book[5];
	
	{
		bList[0] = new CookBook("�������� ����", "������", "tvN", true);
		bList[1] = new AniBook("�ѹ� �� �ؿ�", "��Ƽ", "�����", 19);
		bList[2] = new AniBook("������ ���ǽ�", "����", "japan", 12);
		bList[3] = new CookBook("�������� �󸶳� ���ְԿ�", "������", "����", false);
		bList[4] = new CookBook("������ �� �����غ�", "������", "�ұ�å", true);
	}
	
	public void insertMember(Member mem) {
		this.mem=mem;
	}
	
	public Member myInfo() {
		Member a = new Member();
		
		a = mem;
		
		return a;
	}
	
	public Book[] selectAll() {
		Book[] b = new Book[5];
		
		for(int i=0;i<b.length;i++) {
			b[i] = bList[i];
		}
		
		return b;
	}
	
	public Book[] searchBook(String keyword) {
		
		Book[] bArr = new Book[5];
		
		int count=0;
				
		for(int i=0;i<bArr.length;i++) {
			if(bList[i].getTitle().contains(keyword)) {
				bArr[count]=bList[i];
				count++;
			}
		
		}
		return bArr;
		
	}
	
	public int rentBook(int index) {
	
		int result=0;
		int count=0;
		
		if(bList[index] instanceof AniBook) {
			
			if(mem.getAge()<((AniBook)bList[index]).getAccessAge()) {
				result=1;
			}	
			
		} else if(bList[index] instanceof CookBook) {
			
			if(((CookBook)bList[index]).getCoupon()){
				mem.setCouponCount(++count);
				result = 2;
			}
		}
		
		return result;
	}
}
