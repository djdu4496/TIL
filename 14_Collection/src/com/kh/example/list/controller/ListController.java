package com.kh.example.list.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.example.list.model.vo.Student;

public class ListController {
	public void doList() {
		List list1 = new ArrayList();
//		list1.
//		List<Student> list = new ArrayList</*Student(생략가능)*/>();
		List<Student> list = new ArrayList<>();
		// add(E e) : 리스트 끝에 데이터 e 추가
		list.add(new Student("테스트",0));
		list.add(new Student("도대담",60));
		
		System.out.println("list : " + list);
		
		// 컬렉션 장점 1. 크기의 제약이 없다.
		list.add(new Student("남나눔",90));
		list.add(new Student("하현호",85));
		
		System.out.println("현재 list에 담긴 element 개수 : " + list.size());
		System.out.println("list : " + list);
		
		list.add(new Student("문미미",66));
		System.out.println("현재 list에 담긴 element 개수 : " + list.size());
		System.out.println("list : " + list);
		
		// 컬렉션 장점 2. 추가/삭제/정렬 등의 기능처리가 간단함
		// add(int index, E e) : index번째 인덱스에 e 추가
		list.add(0, new Student("류라라", 100));
		System.out.println("list : " + list);

		list.add(3, new Student("강건강", 40));
		System.out.println("list : " + list);
		
		// remove(int index) : 해당 index번째 객체 삭제
		list.remove(1);
		System.out.println("list : " + list);
		
		// remove(Object o) : 해당 Object객체삭제
		list.remove(new Student("강건강", 40));
		System.out.println("list : " + list);
		
		// 정렬 방법 1. Collections 클래스 이용	// Collections 클래스 : 컬렉션을 이용할 때 더 좋게 해주는 메소드를 모아놓은 클래스
		Collections.sort(list);
		System.out.println("list : " + list);
		
//		ArrayList<String> strList = new ArrayList<String>();
//		strList.add("저녁시간");
//		strList.add("점심시간");
//		strList.add("퇴근시간");
//		strList.add("기상시간");
//		strList.add("출근시간");
//		strList.add("취침시간");
		
//		System.out.println(strList);
//		Collections.sort(strList);
//		System.out.println(strList);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
