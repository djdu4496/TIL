package com.kh.practice.chap02_abstractNInterface.model.vo;

public abstract class SmartPhone implements CellPhone,TouchDisplay{
	private String maker; // 제조사 정보
	
	public SmartPhone() {}
	
	//스마트폰의 제원 정보를 출력하기 위한 추상 메소드
	public abstract String printInformation();

	public void setMaker(String maker) {
		this.maker=maker;
	}
	
	public String getMaker() {
		return maker;
	}
}
