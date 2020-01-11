package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {	
	double pi = Math.PI;
	private Circle c = new Circle();

	public String calcArea(int x, int y, int radius) {
		// 면적 : PI * 반지름 * 반지름
		
		double surface = pi * radius * radius;
		
		return x + ", " + y + ", " + radius + " / " +surface;
		
	}
	
	public String calcCircum(int x, int y, int radius) {
		// 둘레 : PI * radius * 2
		
		double round = pi * radius * 2;
		
		return x + ", " + y + ", " + radius + " / " +round;
		
	}
	
}
