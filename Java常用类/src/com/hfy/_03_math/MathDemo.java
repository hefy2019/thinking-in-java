package com.hfy._03_math;

import java.util.Random;

//Math类中的常量和静态方法
public class MathDemo {
	public static void main(String[] args) {
		System.out.println(Math.max(100, 9));
        //返回带正号的 double 值，该值大于等于 0.0 且小于 1.0 .
		double ran = Math.random();
		System.out.println((int)(ran*100));
	}
}
