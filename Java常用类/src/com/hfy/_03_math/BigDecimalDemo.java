package com.hfy._03_math;

import java.math.BigDecimal;

public class BigDecimalDemo {
	public static void main(String[] args) {
		//使用double
		System.out.println("0.09+0.01=" + (0.09 + 0.01));
		System.out.println("1.0-.033=" + (1.0 - .033));
		System.out.println("4.015*1000=" + (4.015 * 1000));
		System.out.println("12.3/100=" + (12.3 / 100));
		//使用BigDecimal: BigDecimal(double val)
		
		BigDecimal num1 = new BigDecimal("0.09");
		BigDecimal num2 = new BigDecimal("0.01");
		System.out.println(num1.add(num2));
	}
}
