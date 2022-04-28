package com.study.JavaOCP.day02;

public class ArrayDemo2 {

	public static void main(String[] args) {

		// int[] scores = new int[] { 100, 90, 80 };
		int[] scores = { 100, 90, 87 };

		// 計算總分與平均
		// 利用 for-loop 或 for-in 輪詢每一個元素並加總
		int sum = 0; // 總和(元素內容累計)
		for (int i = 0; i < scores.length; i++) {
			// sum = sum + scores[i];
			sum += scores[i];
		}
		System.out.printf("總分: %d\n", sum);

		double avg = sum / (double) scores.length;
		System.out.printf("平均: %.1f\n", avg);
		
		System.out.println("==================");

		int sum2 = 0;
		for (int x : scores) {
			sum2 += x;
		}
		System.out.printf("總分2: %d\n", sum2);

		double avg2 = sum2 / (double) scores.length;
		System.out.printf("平均2: %.1f\n", avg2);

	}

}
