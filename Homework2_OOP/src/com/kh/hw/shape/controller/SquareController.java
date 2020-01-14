package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class SquareController {
	private Shape s = new Shape();
	
	public SquareController() {}
	
	public double calcPerimeter(double height, double width) {
		// 둘레 : 너비*2 + 높이*2
		s.setHeight(height);
		s.setWidth(width);
		
		double perimeter = width*2 + height*2;
		
		return perimeter;
	}
	
	public double calcArea(double height, double width) {
		// 넓이 : 너비 * 높이
		s.setHeight(height);
		s.setWidth(width);
		
		double area = width * height;
		
		return area;
	}
	
	public void paintColor(String color) {
		// setter를 이용해 받아온 매개변수로 값 변경
		s.setColor(color);
	}
	
	public String print() {
		// 어떤 모양인지와 Shape의 information()메소드의 반환 값 합쳐 함께 반환
		return "사각형" + " " + s.information();
	}
}
