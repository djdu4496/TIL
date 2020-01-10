package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {
	private Rectangle r = new Rectangle();
	
	public String calcArea(int x, int y, int height, int width) {
		double surface = width * height;
		
		return toString() + " " + surface;
	}
	
	public String calcPerimeter(int x, int y, int height, int width) {
		double round = 2 * (height + width);
		
		return toString() + " " + round; 
	}	
}