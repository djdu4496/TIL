package com.kh.practice.chap02_abstractNInterface.model.vo;

public class GalaxyNote9 extends SmartPhone implements NotePen{
	public GalaxyNote9() {
		super.setMaker("�Ｚ");
	}
	
	public String makeCall() {
		return "��ȣ�� ������ ��ȭ��ư�� ����";
	}
	
	public String takeCall() {
		return "��ȭ�ޱ� ��ư�� ����";
	}
	
	public String picture() {
		return "1200, 1600�� ȭ�� Ʈ���� ī�޶�";
	}
	
	public String charge() {
		return "�������, ��� ���� ����";
	}
	
	public String touch() {
		return "������";
	}
	
	public boolean bluetoothPen() {
		return false;

	}
	
	public String printInformation() {
		return "������ ��Ʈ9�� " + getMaker() + "���� ��������� ������ ������ ���� ���������.\n"
				+ makeCall() + "/n" + takeCall() + "\n" + picture() + "\n" + 
				charge() + "\n" + touch() + "\n������� �� ž�� ���� : " + bluetoothPen()+"\n";
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
