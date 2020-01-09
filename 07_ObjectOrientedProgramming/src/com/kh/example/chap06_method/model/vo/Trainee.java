package com.kh.example.chap06_method.model.vo;

public class Trainee {
	// �ʵ� ����
	private String name;
	private final String ACADEMY = "KH";
	private char classRoom;
	private static double score;
	
	public Trainee () {}	// �� ������ �⺻ ������ ����
	
	public Trainee(String name, char classRoom, double score) {
		this.name = name;
		this.classRoom = classRoom;
		Trainee.score = score;
	}
	
	public Trainee(String name) {
		this.name = name;
	}
	
	// �ʵ忡 �ִ� name�� �޾ƿ� �Ű������� ���� �ʱ�ȭ ��Ű�� setter
	public void setName(String name) {
		this.name = name;
	}
	
	// �ʵ忡 �ִ� classRoom�� �޾ƿ� �Ű������� ���� �ʱ�ȭ ��Ű�� setter
	public void setClassRoom(char classRoom) {
		this.classRoom = classRoom;
	}
	
	// �ʵ忡 �ִ� score�� �޾ƿ� �Ű������� ���� �ʱ�ȭ ��Ű�� setter
	public static void setScore(double score) {
		Trainee.score=score;
	}
	
	// �ʵ忡 �ִ� name�� ��ȯ�ϴ� getter
	public String getName() {
		return name; // 
	}
	
	// �ʵ忡 �ִ� ACADEMY�� ��ȯ�ϴ� getter
	public String getACADEMY() {
		return ACADEMY;
	}
	
	// �ʵ忡 �ִ� classRoom�� ��ȯ�ϴ� getter
	public char getClassRoom() {
		return classRoom;
	}
	
	// �ʵ忡 �ִ� score�� ��ȯ�ϴ� getter
	public static double getScore() {
		return score;	// score�� Ŭ���� ����
	}
	
	public String inform() {
		return name + ", " + ACADEMY + ", " + classRoom + ", " + score;
	}
}
