package com.hfy._05_random;

import java.util.Random;
import java.util.UUID;

//验证码
public class RandomCodeDemo {
	public static void main(String[] args) {
		//生成一个5位数的随机数
		String code = UUID.randomUUID().toString().substring(0, 5);
		String code1 = UUID.randomUUID().toString();
		System.out.println(code1);
		System.out.println(code);
		System.out.println("--------------------------------");
		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		str += "0123456789";
		str += str.toLowerCase();
		System.out.println(str);
		System.out.println(str.length());
		StringBuilder builder = new StringBuilder(5);
		for (int i = 0; i < 5; i++) {
			//int nextInt = new Random().nextInt(str.length());
			char ch = str.charAt(new Random().nextInt(str.length()));//index必须在[0,str.length())之间
			builder.append(ch);
		}
		System.out.println(builder);
	}
}
