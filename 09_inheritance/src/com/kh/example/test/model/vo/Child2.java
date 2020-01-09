package com.kh.example.test.model.vo;

public class Child2 extends Parent{
	private String str;
	
	public Child2() {
//		super.num = 10;  
		// 접근 범위가 Parent만이기 때문에 불가능
		
		super.dNum = 10.2;
		// 접근 범위가 같은 패키지이기 때문에 가능
		
		super.bool = false;
		// 같은 범위가 같은 패키지, 후손이기 때문에 가능
		
		super.ch = 'a';
		// 접근 범위가 전체 다 이기 때문에 가능
	}
	
	public void setStr(String str) {
		this.str = str;
	}
	
	public String getStr() {
		return str;
	}
}
