package com.study.JavaOCP.day01;

import java.math.BigDecimal;

public class BigDecimalDemo {

	public static void main(String[] args) {

		System.out.println(0.1 + 0.1 == 0.2); // true
		System.out.println(0.1 + 0.1 + 0.1 == 0.3); // false
		System.out.println(0.1 + 0.1); // 0.2
		System.out.println(0.1 + 0.1 + 0.1); // 0.30000000000000004

		System.out.println("============================");

		BigDecimal a = new BigDecimal("0.1");
		BigDecimal b = new BigDecimal("0.1");
		BigDecimal c = new BigDecimal("0.1");

		System.out.println(a.add(b).add(c).doubleValue()); // 0.3
		System.out.println(a.add(b).add(c).doubleValue() == 0.3); // true
	}

}
