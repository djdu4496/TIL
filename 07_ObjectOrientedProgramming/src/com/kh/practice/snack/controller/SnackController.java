package com.kh.practice.snack.controller;

import com.kh.practice.snack.model.vo.Snack;

public class SnackController {
	private Snack s1 = new Snack();
	
	public SnackController() {}
	
	public String saveData(String kind, String name, String flavor, int numOf, int price) {
		s1.setKind(kind);
		s1.setName(name);
		s1.setFlavor(flavor);
		s1.setNumOf(numOf);
		s1.setPrice(price);
		return "저장완료되었습니다.ㅋㅋ";
	}
	
	public String confirmData() {
		s1.getKind();
		s1.getName();
		s1.getFlavor();
		s1.getNumOf();
		s1.getPrice();
		return s1.getKind() + s1.getName() + s1.getFlavor() + s1.getNumOf() + s1.getPrice();
	}
}
