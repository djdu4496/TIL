package com.kh.example.chap04_field.controller;

public class A_KindsOfVariable1 { // <== 클래스 영역의 시작
	
	// 클래스 영역에 작성하는 변수 : 필드
	// == 멤버변수
	// == 멤버필드
	// == 전역변수
	
	private int globalNum;
	
	public void method1(int num) { // <== 메소드 영역의 시작
		//				------ 매개변수 : 메소드의 선언부 중 괄호안에 선언하는 변수
		
		// 메소드 영역에 작성하는 변수 : 지역변수
		int localNum;
		// 매개변수 역시 지역변수의 일종으로 생각함
		
		localNum=10;
		System.out.println(localNum);
		//The local variable localNum may not have been initialized : 지역 변수는 반드시 초기화가 되어있어야함
		
		System.out.println(num);
		
		System.out.println(globalNum);
		
	} // <== 메소드 영역의 끝
	
	public void method2() {
//		System.out.println(localNum);
		// localNum cannot be resolved to a variable : 지역변수는 해당 지역 내서만 사용 가능
		System.out.println(globalNum);
	}
} // <== 클래스 영역의 끝
