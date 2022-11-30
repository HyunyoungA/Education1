package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Point;
import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController extends Point{
	private Rectangle r = new Rectangle();
	
	public String calcArea(int x, int y, int height , int width) {
		r = new Rectangle(x, y, height, width);
		// 면적 : 너비 * 높이
		return r + "/" + width * height;
	}
	public String calcPerimeter(int x, int y, int height, int width) {
		// 둘레 : 2 * (너비 + 높이)
		r = new Rectangle(x, y, height, width);
		
		return r + " / " + (2 * (width + height));
	}
	
}
