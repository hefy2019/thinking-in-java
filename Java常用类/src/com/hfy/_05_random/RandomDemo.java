package com.hfy._05_random;

import java.util.Random;

//����α�����
public class RandomDemo {
	public static void main(String[] args) {
		Random r1 = new Random(10);
		System.out.println(r1.nextBoolean());//boolean�����
		System.out.println(r1.nextDouble());//double�����
		System.out.println(r1.nextInt());//int�����
		System.out.println(r1.nextInt(100));//int�����
		System.out.println("--------------------------------");
		Random r2 = new Random(8);
		System.out.println(r2.nextBoolean());//boolean�����
		System.out.println(r2.nextDouble());//double�����
		System.out.println(r2.nextInt());//int�����
		System.out.println(r2.nextInt(100));//int�����
		System.out.println("--------------------------------");
		//����:����34��179֮��������: 34 + [0,145)
		int num = new Random().nextInt(145) + 34;
		System.out.println(num);
	}
}
