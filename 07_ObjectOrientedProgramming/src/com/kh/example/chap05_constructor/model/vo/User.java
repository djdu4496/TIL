package com.kh.example.chap05_constructor.model.vo;

import java.util.Date;

public class User {
	// - userId : String
	// - userPwd : String
	// - userName : String
	// - enrollDate : Date(java.util(import ���))
	private String userId;
	private String userPwd;
	private String userName;
	private Date enrollDate;
	
	// ������ ��� ����(��ü�� ����)
	// 		1. ��ü ����
	//		2. �Ű������� ���� ���� ������ �ʵ� �ʱ�ȭ�ϴ� ����
	
	// ������ ��� ��Ģ
	//		1. ������ ���� Ŭ���� ��� �����ؾ� ��
	//      2. ��ȯ��(������)�� �������� ����
	
	public User() {} // �⺻������ : �Ű������� ���� ������
	// JVM�� �⺻������ ��������
	// �Ű����� �ִ� �����ڸ� ����� JVM�� �ڵ����� ���������� �ʱ� ������ �ݵ�� ����ؾ� ��
	
//	public User() {}
	// Duplicate method User() in type User : �����ε��� ������� ����.
	// ���� �̸��� ������(�޼ҵ�)�� ���� �� �����ε��� ������� ������ ���� �߻�.
	
	public User(String id, String pwd) {
		// �Ű� ���� ������ �ٸ��Ƿ� �����ε��� �����
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
		//1) this. ���
//		this.userId = userId;
//		this.userPwd = userPwd;
//		this.userName = userName;
//		this.enrollDate = enrollDate;
		//2) this ������ ��� (good)
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
