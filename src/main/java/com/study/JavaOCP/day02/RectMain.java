package com.study.JavaOCP.day02;

public class RectMain {

	public static void main(String[] args) {

		Rect rect = new Rect();
		rect.setWidthAndHigh(30, 50);

		int area = rect.getArea();
		System.out.printf("Area = %,d\n", area);

	}

}
