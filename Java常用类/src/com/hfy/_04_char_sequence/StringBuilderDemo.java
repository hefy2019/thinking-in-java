package com.hfy._04_char_sequence;

// StringBuffer和StringBuilder都表示可变的字符串,功能方法都是相同的
public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();//等价于 StringBuilder(16);
		//链式编程
		builder.append("A").append("B");
		System.out.println(builder);
		//删除最后一个字符:G
		String str = "ABCDEFG";
		StringBuilder newString = new StringBuilder(str).deleteCharAt(str.length() - 1);
		System.out.println(newString);
		
		System.out.println(new StringBuilder("ABCDEFG").reverse());
	}
}
