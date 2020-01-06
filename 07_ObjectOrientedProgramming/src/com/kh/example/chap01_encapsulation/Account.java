package com.kh.example.chap01_encapsulation;

public class Account {
	private String name = "�ڽſ�";
	private String phone = "010-9468-8140";
	private String pwd = "1q2w3e4r";
	private int bankCode = 3030;
	private int balance = 0; //�ܾ�
	// ��� ���� : �޼ҵ� ������ �ƴ� Ŭ���� ������ �ִ� ������ ���Ѵ�.
	
	// �Ա� �޼ҵ�
	public void deposit(int money) {
		if(money > 0) {
			balance += money;
			System.out.println(name + "���� ���¿�" + money + "���� �ԱݵǾ����ϴ�.");
		} else {
			System.out.println("�߸��� �ݾ��� �ԱݵǾ����ϴ�.");
		}
	}
	
	// ��� �޼ҵ�
	public void withdraw(int money) {
		if(money <= balance) {
			balance -= money;
			System.out.println(name + "���� ���¿���" + money + "���� ��ݵǾ����ϴ�.");
		} else {
			System.out.println("�ܾ��� �����մϴ�. �ܾ��� Ȯ���ϼ���");
		}
	}
	
	// �ܾ� ��ȸ �޼ҵ�
	public void displayBalance() {
		System.out.println(name + "���� ������ �ܾ��� " + balance + "���Դϴ�.");
	}
}
