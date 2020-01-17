package com.kh.practice.chap02_abstractNInterface.model.vo;

public class V40 extends SmartPhone implements NotePen {
	public V40() {
		super.setMaker("LG");
	}
	
	public String makeCall() {
		return "번호를 누르고 통화버튼을 누름";
	}
	
	public String takeCall() {
		return "전화받기 버튼을 누름";
	}
	
	public String picture() {
		return "1300만 듀얼카메라";
	}
	
	public String charge() {
		return "고속충전, 고속 무선 충전";
	}
	
	public String touch() {
		return "정전식, 와콤펜 지원";
	}
	
	public boolean bluetoothPen() {
		return true;

	}
	
	// 실행 화면을 참조하여 오버라이딩
	public String printInformation() {
		return "V40는 " + getMaker() + "에서 만들어졌고 제원은 다음과 같이 만들어졌다.\n"
				+ makeCall() + "/n" + takeCall() + "\n" + picture() + "\n" + 
				charge() + "\n" + touch() + "\n블루투스 펜 탑재 여부 : " + bluetoothPen()+"\n";
	}
}
