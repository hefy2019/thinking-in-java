package com.hfy._07_regex;

public class RegexDemo {
	public static void main(String[] args) {
		String input = "123456";
		boolean ok = isNumber(input);
		System.out.println(ok);
		System.out.println("123456".matches("\\d{5,10}"));
		System.out.println("--------------------------------");
		//�ж�һ���ֻ�����
		input = "13812345678";
		String regex = "^1[3|4|5|7|8]\\d{9}$";
		System.out.println(input.matches(regex));
		System.out.println("--------------------------------");
		//�ٶ�:������ʽӦ�ð���
		//�ж�����
		//ֻ�����뺺��

	}

	//����:�ж�һ���ַ���ȫ�����������
	private static boolean isNumber(String str) {
		char[] arr = str.toCharArray();
		for (char c : arr) {
			if (c < '0' || c > '9') {
				return false;
			}
		}
		return true;
	}
}
