package com.hfy._05_random;

import java.util.Random;

//生成伪随机数
public class RandomDemo {
	public static void main(String[] args) {
		Random r1 = new Random(10);
		System.out.println(r1.nextBoolean());//boolean随机数
		System.out.println(r1.nextDouble());//double随机数
		System.out.println(r1.nextInt());//int随机数
		System.out.println(r1.nextInt(100));//int随机数
		System.out.println("--------------------------------");
		Random r2 = new Random(8);
		System.out.println(r2.nextBoolean());//boolean随机数
		System.out.println(r2.nextDouble());//double随机数
		System.out.println(r2.nextInt());//int随机数
		System.out.println(r2.nextInt(100));//int随机数
		System.out.println("--------------------------------");
		//需求:生成34到179之间的随机数: 34 + [0,145)
		int num = new Random().nextInt(145) + 34;
		System.out.println(num);
	}
}
