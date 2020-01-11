package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {
	private Rectangle r = new Rectangle();
	
	public String calcArea(int x, int y, int height, int width) {
		int surface = width * height;
		
		return x + ", " + y + " " +height + " " + width + " / " + surface;
	}
	
	public String calcPerimeter(int x, int y, int height, int width) {
		int round = 2 * (height + width);
		return x + ", " + y + " " +height + " " + width + " / " + round;
	}	
}