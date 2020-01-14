package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;


public class TriangleController {
	private Shape s = new Shape();
	
	public TriangleController() {}
	
	public double calcArea(double height,double width) {
		// 모양 타입 번호와 받은 매개변수를 매개변수 있는 생성자로 초기화 시킨후 넓이 반환
		// 넓이 : 너비 * 높이 / 2

		s.setHeight(height);
		s.setWidth(width);
		
		double area = width * height * 1/2;
		
		return area;
	}
	
	public void paintColor(String color) {
		// setter를 이용해 받아온 매개변수로 값 변경
		s.setColor(color);
	}
	
	public String print() {
		// 어떤 모양인지와 Shape의 information()메소드의 반환 값 합쳐 함께 반환
		return "삼각형" + " " + s.information();
	}
}
