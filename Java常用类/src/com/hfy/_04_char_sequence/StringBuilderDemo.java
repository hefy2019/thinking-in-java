package com.hfy._04_char_sequence;

// StringBuffer��StringBuilder����ʾ�ɱ���ַ���,���ܷ���������ͬ��
public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();//�ȼ��� StringBuilder(16);
		//��ʽ���
		builder.append("A").append("B");
		System.out.println(builder);
		//ɾ�����һ���ַ�:G
		String str = "ABCDEFG";
		StringBuilder newString = new StringBuilder(str).deleteCharAt(str.length() - 1);
		System.out.println(newString);
		
		System.out.println(new StringBuilder("ABCDEFG").reverse());
	}
}
