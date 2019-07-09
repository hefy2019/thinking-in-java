package com.hfy._04_char_sequence;

//�ֱ�ʹ��String/StringBuilder/StringBuffer��ƴ��30000���ַ���,�Աȸ������ʱ��
public class CharSequenceDemo {
	public static void main(String[] args) {
		testString();// 1993
		testStringBuffer();// 5
		testStringBuilder();// 3
	}

	public static void testString() {
		long begin = System.currentTimeMillis();
		String str = "";
		for (int i = 0; i < 30000; i++) {
			str += i;
		}
		long end = System.currentTimeMillis();
		System.out.println(end - begin);
	}

	public static void testStringBuffer() {
		long begin = System.currentTimeMillis();
		StringBuffer buffer = new StringBuffer("");
		for (int i = 0; i < 300000; i++) {
			buffer.append(i);
		}
		long end = System.currentTimeMillis();
		System.out.println(end - begin);

	}

	public static void testStringBuilder() {
		long begin = System.currentTimeMillis();
		StringBuilder builder = new StringBuilder("");
		for (int i = 0; i < 300000; i++) {
			builder.append(i);
		}
		long end = System.currentTimeMillis();
		System.out.println(end - begin);

	}
}
