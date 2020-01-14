package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;


public class TriangleController {
	private Shape s = new Shape();
	
	public TriangleController() {}
	
	public double calcArea(double height,double width) {
		// ��� Ÿ�� ��ȣ�� ���� �Ű������� �Ű����� �ִ� �����ڷ� �ʱ�ȭ ��Ų�� ���� ��ȯ
		// ���� : �ʺ� * ���� / 2

		s.setHeight(height);
		s.setWidth(width);
		
		double area = width * height * 1/2;
		
		return area;
	}
	
	public void paintColor(String color) {
		// setter�� �̿��� �޾ƿ� �Ű������� �� ����
		s.setColor(color);
	}
	
	public String print() {
		// � ��������� Shape�� information()�޼ҵ��� ��ȯ �� ���� �Բ� ��ȯ
		return "�ﰢ��" + " " + s.information();
	}
}
