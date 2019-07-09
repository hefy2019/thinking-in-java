package com.hfy._04_char_sequence;

public class StringUtil {
	private StringUtil() {
	}

	/**	 
	�ж��ַ���Ϊ��
	Ϊnull����Ϊ���ַ���
	*/
	public static boolean isBlank(String str) {
		return !hasLength(str);
	}

	/**
	�ж��ַ����ǿ�:
			�Ȳ�������Ϊnull,Ҳ���ǿ��ַ�
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
