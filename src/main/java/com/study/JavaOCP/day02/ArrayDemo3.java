package com.study.JavaOCP.day02;

import java.util.Arrays;

public class ArrayDemo3 {

	public static void main(String[] args) {

		int[] scores = { 40, 90, 100, 50, 35, 80, 60 };
		System.out.println(Arrays.toString(scores));

		System.out.println("=============================");

		// 求最高分 max
		int max = Integer.MIN_VALUE;
		for (int x : scores) {
			if (x > max) {
				max = x;
			}
		}
		System.out.printf("最高分 = %d\n", max);

		System.out.println("=============================");

		// 求最低分 min
		int min = Integer.MAX_VALUE;
		for (int x : scores) {
			if (x < min) {
				min = x;
			}
		}
		System.out.printf("最低分 = %d\n", min);

	}

}
