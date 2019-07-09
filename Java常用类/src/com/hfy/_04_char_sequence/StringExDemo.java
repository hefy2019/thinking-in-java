package com.hfy._04_char_sequence;

//字符串的操作练习
public class StringExDemo {
	public static void main(String[] args) {
		//test1();
		//test2();
		test3();
	}

	/**	 
	           判断字符串为空
	 	为null或者为空字符串
	  */
//	private static boolean isBlank(String str){
//		return !hasLength(str);
//	}
	/**
	 	判断字符串非空:
	 			既不是引用为null,也不是空字符
	  */
//	private static boolean hasLength(String str) {
//		if (str != null && !"".equals(str.trim())) {
//			return true;
//		} else {
//			return false;
//		}
//	}
	/*private static boolean hasLength(String str){
		return str != null&&!"".equals(str.trim());
	}*/

	//判断字符串是否非空
	private static void test3() {
		System.out.println(StringUtil.hasLength(null));
		System.out.println(StringUtil.hasLength(""));
		System.out.println(StringUtil.hasLength(" "));
		System.out.println(StringUtil.hasLength(" A "));
		System.out.println("--------------------------------");
		System.out.println(StringUtil.isBlank(null));
		System.out.println(StringUtil.isBlank(""));
		System.out.println(StringUtil.isBlank(" "));
		System.out.println(StringUtil.isBlank(" A "));

		System.out.println(" A BC D ".length());//8
		System.out.println(" A BC D ".trim().length());//6
		String str1 = "";//为空
		String str2 = " ";//为空
		String str3 = null;//为空
		String str = " ";
		//判断字符串非空
		/*if (str != null && !"".equals(str.trim())) {
			System.out.println("非空");
		} else {
			System.out.println("空");
		}*/
	}

	//String练习获取以hello开头的文件名的后缀名
	private static void test1() {
		//多个文件名组成的一个字符串
		String fileNames = "abc.java;hello.will.txt;hello.java;hello.class";
		//1):以分号来分割字符串,获取每一个文件的名称和拓展名
		String[] names = fileNames.split(";");
		for (String name : names) {
			//判断每一个字符串是否以hello开头
			if (name.startsWith("hello")) {
				//获取文件名的后缀名:最后一个点的后半截
				//System.out.println(name);
				int index = name.lastIndexOf(".");
				//System.out.println(index);
				String substring = name.substring(index);
				//System.out.println(substring);
			}
		}
	}

	//String练习把单词首字母大写
	private static void test2() {
		String str = "asm";
		//1):获取第一个字符串,并转换为大写
		String upperCase = str.substring(0, 1).toUpperCase();
		System.out.println(upperCase);
		//2):截取字符串
		String substring = str.substring(1);
		System.out.println(upperCase + substring);

	}
}
