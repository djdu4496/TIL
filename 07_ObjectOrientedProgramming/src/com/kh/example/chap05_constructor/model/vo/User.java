package com.kh.example.chap05_constructor.model.vo;

import java.util.Date;

public class User {
	// - userId : String
	// - userPwd : String
	// - userName : String
	// - enrollDate : Date(java.util(import 대상))
	private String userId;
	private String userPwd;
	private String userName;
	private Date enrollDate;
	
	// 생성자 사용 목적(객체의 역할)
	// 		1. 객체 생성
	//		2. 매개변수로 전달 받은 값으로 필드 초기화하는 목적
	
	// 생성자 사용 규칙
	//		1. 생성자 명은 클래스 명과 동일해야 함
	//      2. 반환형(리턴형)이 존재하지 않음
	
	public User() {} // 기본생성자 : 매개변수가 없는 생성자
	// JVM이 기본적으로 생성해줌
	// 매개변수 있는 생성자를 만들면 JVM이 자동으로 생성해주지 않기 때문에 반드시 명시해야 함
	
//	public User() {}
	// Duplicate method User() in type User : 오버로딩이 적용되지 않음.
	// 같은 이름의 생성자(메소드)가 있을 때 오버로딩이 적용되지 않으면 에러 발생.
	
	public User(String id, String pwd) {
		// 매개 변수 개수가 다르므로 오버로딩이 적용됨
		userId = id;
		userPwd = pwd;

	}
	
	
	public User(String userId,String userPwd,String userName) {
//		this.userId = userId;
//		this.userPwd = userPwd;
		this(userId,userPwd);	
		this.userName = userName;
	}
	
	public User(String userId,String userPwd,String userName,Date enrollDate) {
		//1) this. 사용
//		this.userId = userId;
//		this.userPwd = userPwd;
//		this.userName = userName;
//		this.enrollDate = enrollDate;
		//2) this 생성자 사용 (good)
		this(userId,userPwd,userName);
		this.enrollDate = enrollDate;
	}
	
//	public User(String id,String name) {
//		userId = id;
//		userName = name;
//	}
	 	
	public void inform() {
		System.out.println(userId + ", " + userPwd + ", " + userName + ", " + enrollDate);
	} 
}
