package com.hfy._03_math;

import java.util.Random;

//Math���еĳ����;�̬����
public class MathDemo {
	public static void main(String[] args) {
		System.out.println(Math.max(100, 9));
        //���ش����ŵ� double ֵ����ֵ���ڵ��� 0.0 ��С�� 1.0 .
		double ran = Math.random();
		System.out.println((int)(ran*100));
	}
}
