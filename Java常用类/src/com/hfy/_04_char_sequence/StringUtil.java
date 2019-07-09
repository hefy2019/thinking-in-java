package com.hfy._04_char_sequence;

public class StringUtil {
	private StringUtil() {
	}

	/**	 
	判断字符串为空
	为null或者为空字符串
	*/
	public static boolean isBlank(String str) {
		return !hasLength(str);
	}

	/**
	判断字符串非空:
			既不是引用为null,也不是空字符
	*/
	public static boolean hasLength(String str) {
		if (str != null && !"".equals(str.trim())) {
			return true;
		} else {
			return false;
		}
	}
	/*private static boolean hasLength(String str){
	return str != null&&!"".equals(str.trim());
	}*/
}
