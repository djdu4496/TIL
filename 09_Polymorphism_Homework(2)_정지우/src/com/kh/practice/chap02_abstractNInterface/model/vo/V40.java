package com.kh.practice.chap02_abstractNInterface.model.vo;

public class V40 extends SmartPhone implements NotePen {
	public V40() {
		super.setMaker("LG");
	}
	
	public String makeCall() {
		return "��ȣ�� ������ ��ȭ��ư�� ����";
	}
	
	public String takeCall() {
		return "��ȭ�ޱ� ��ư�� ����";
	}
	
	public String picture() {
		return "1300�� ���ī�޶�";
	}
	
	public String charge() {
		return "�������, ��� ���� ����";
	}
	
	public String touch() {
		return "������, ������ ����";
	}
	
	public boolean bluetoothPen() {
		return true;

	}
	
	// ���� ȭ���� �����Ͽ� �������̵�
	public String printInformation() {
		return "V40�� " + getMaker() + "���� ��������� ������ ������ ���� ���������.\n"
				+ makeCall() + "/n" + takeCall() + "\n" + picture() + "\n" + 
				charge() + "\n" + touch() + "\n������� �� ž�� ���� : " + bluetoothPen()+"\n";
	}
}
