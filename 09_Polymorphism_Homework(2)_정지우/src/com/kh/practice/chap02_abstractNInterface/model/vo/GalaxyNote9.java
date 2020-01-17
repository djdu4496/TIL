package com.kh.practice.chap02_abstractNInterface.model.vo;

public class GalaxyNote9 extends SmartPhone implements NotePen{
	public GalaxyNote9() {
		super.setMaker("삼성");
	}
	
	public String makeCall() {
		return "번호를 누르고 통화버튼을 누름";
	}
	
	public String takeCall() {
		return "전화받기 버튼을 누름";
	}
	
	public String picture() {
		return "1200, 1600만 화소 트리플 카메라";
	}
	
	public String charge() {
		return "고속충전, 고속 무선 충전";
	}
	
	public String touch() {
		return "정전식";
	}
	
	public boolean bluetoothPen() {
		return false;

	}
	
	public String printInformation() {
		return "갤럭시 노트9는 " + getMaker() + "에서 만들어졌고 제원은 다음과 같이 만들어졌다.\n"
				+ makeCall() + "/n" + takeCall() + "\n" + picture() + "\n" + 
				charge() + "\n" + touch() + "\n블루투스 펜 탑재 여부 : " + bluetoothPen()+"\n";
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
