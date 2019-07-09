package com.hfy._04_char_sequence;

//√Ê ‘Ã‚∑÷Œˆ
public class StringDemo1 {
	public static void main(String[] args) {
		String str1 = "ABCD";
		String str2 = new String("ABCD");
		System.out.println(str1 == str2);//false
		System.out.println(str1.equals(str2));//true
	}
}
