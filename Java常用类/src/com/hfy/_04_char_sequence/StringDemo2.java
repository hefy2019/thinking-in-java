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
		System.out.println("AbCDef".toLowerCase());//ת����Сд
		System.out.println("AbCDef".toUpperCase());//ת���ɴ�д
	}

	private static void stringEquals() {
		String str1 = new String("ABDc");
		String str2 = new String("ABDC");
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));//���Դ�Сд�Ƚ�
		System.out.println(str1.contentEquals(str2));//�ײ���equals��ͬ

	}

	/**
	   2):��ȡ�ַ�����Ϣ
	   		int length():���ش��ַ����ĳ���
	   		char charAt(int index): ����ָ���������� char ֵ
	   		int indexOf(String str): ����ָ�����ַ����ڴ��ַ����е�һ�γ��ִ�������
	   		int lastIndexOf(String str): ����ָ�����ַ����ڴ��ַ��������ұ߳��ִ�������
	*/

	private static void getStringInfo() {
		System.out.println("A BCDE ".length());//7
		System.out.println("A BCDE ".charAt(3));//C
		System.out.println("A BCDEDE ".indexOf("DE"));//4
		System.out.println("A BCDEDE ".lastIndexOf("DE"));//6
	}

	/** 	
	  	String�Ĵ�����ת��
			byte[] getBytes(): ���ַ���ת��Ϊbyte����
			char[] toCharArray(): �����ַ���ת��Ϊһ���µ�char���顣  
			String(byte[] bytes): ��byte����ת��Ϊ�ַ���
			String(char[] value): ��char����ת��Ϊ�ַ���
	*/

	private static void buildString() {
		//��char�����String�໥ת��
		char[] cs = new char[] { 'A', 'B', 'C', 'D' };
		String str1 = new String(cs);
		System.out.println(str1);
		System.out.println(str1.toCharArray());
		//byte �����String���໥ת��
		System.out.println(Arrays.toString("ABCD".getBytes()));
		System.out.println(new String("ABCD".getBytes()));
	}
}
