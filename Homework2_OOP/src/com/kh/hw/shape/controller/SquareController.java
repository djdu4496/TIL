package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class SquareController {
	private Shape s = new Shape();
	
	public SquareController() {}
	
	public double calcPerimeter(double height, double width) {
		// �ѷ� : �ʺ�*2 + ����*2
		s.setHeight(height);
		s.setWidth(width);
		
		double perimeter = width*2 + height*2;
		
		return perimeter;
	}
	
	public double calcArea(double height, double width) {
		// ���� : �ʺ� * ����
		s.setHeight(height);
		s.setWidth(width);
		
		double area = width * height;
		
		return area;
	}
	
	public void paintColor(String color) {
		// setter�� �̿��� �޾ƿ� �Ű������� �� ����
		s.setColor(color);
	}
	
	public String print() {
		// � ��������� Shape�� information()�޼ҵ��� ��ȯ �� ���� �Բ� ��ȯ
		return "�簢��" + " " + s.information();
	}
}
