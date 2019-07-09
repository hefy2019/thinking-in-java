package com.hfy._04_char_sequence;

import java.util.Arrays;

public class StringDemo2 {

	public static void main(String[] args) {
		//buildString();
		//getStringInfo();
		//stringEquals();
		toUpper_lower();
		stringEquals();

	}
	private static void toUpper_lower() {
		System.out.println("AbCDef".toLowerCase());//转换成小写
		System.out.println("AbCDef".toUpperCase());//转换成大写
	}

	private static void stringEquals() {
		String str1 = new String("ABDc");
		String str2 = new String("ABDC");
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));//忽略大小写比较
		System.out.println(str1.contentEquals(str2));//底层与equals相同

	}

	/**
	   2):获取字符串信息
	   		int length():返回此字符串的长度
	   		char charAt(int index): 返回指定索引处的 char 值
	   		int indexOf(String str): 返回指定子字符串在此字符串中第一次出现处的索引
	   		int lastIndexOf(String str): 返回指定子字符串在此字符串中最右边出现处的索引
	*/

	private static void getStringInfo() {
		System.out.println("A BCDE ".length());//7
		System.out.println("A BCDE ".charAt(3));//C
		System.out.println("A BCDEDE ".indexOf("DE"));//4
		System.out.println("A BCDEDE ".lastIndexOf("DE"));//6
	}

	/** 	
	  	String的创建和转换
			byte[] getBytes(): 把字符串转换为byte数组
			char[] toCharArray(): 将此字符串转换为一个新的char数组。  
			String(byte[] bytes): 把byte数组转换为字符串
			String(char[] value): 把char数组转换为字符串
	*/

	private static void buildString() {
		//把char数组和String相互转换
		char[] cs = new char[] { 'A', 'B', 'C', 'D' };
		String str1 = new String(cs);
		System.out.println(str1);
		System.out.println(str1.toCharArray());
		//byte 数组和String的相互转换
		System.out.println(Arrays.toString("ABCD".getBytes()));
		System.out.println(new String("ABCD".getBytes()));
	}
}
