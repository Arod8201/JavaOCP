package com.study.JavaOCP.day02;

import java.util.Arrays;

public class ArrayDemo1 {

	public static void main(String[] args) {

		int[] scores = new int[3];
		scores[0] = 100;
		scores[1] = 90;
		scores[2] = 80;

		System.out.println("陣列長度: " + scores.length);
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);

		System.out.println("==================");

		// for-loop
		System.out.print("for-loop ->");
		for (int i = 0; i < scores.length; i++) {
			System.out.print(" " + scores[i]);
		}

		System.out.println();

		// for-each (for-in) Java 5.0
		System.out.print("for-each ->");
		for (int x : scores) {
			System.out.print(" " + x);
		}

		System.out.println();
		System.out.println("==================");

		// Arrays.toString() 將陣列轉換成字串印出
		// 使用情境: 快速檢視目前陣列最新內容
		System.out.println(Arrays.toString(scores));

		// 直接印出 scores
		System.out.println(scores);

	}

}
