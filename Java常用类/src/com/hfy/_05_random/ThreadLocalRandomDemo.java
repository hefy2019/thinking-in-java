package com.hfy._05_random;

import java.util.concurrent.ThreadLocalRandom;

public class ThreadLocalRandomDemo {
	public static void main(String[] args) {
		ThreadLocalRandom random = ThreadLocalRandom.current();
		System.out.println(random.nextInt(100));
		System.out.println(random.nextInt(34,179));//生成[34,179)之间的随机数
	}
}
