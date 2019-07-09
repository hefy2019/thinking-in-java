package com.hfy._04_char_sequence;

//�ַ����Ĳ�����ϰ
public class StringExDemo {
	public static void main(String[] args) {
		//test1();
		//test2();
		test3();
	}

	/**	 
	           �ж��ַ���Ϊ��
	 	Ϊnull����Ϊ���ַ���
	  */
//	private static boolean isBlank(String str){
//		return !hasLength(str);
//	}
	/**
	 	�ж��ַ����ǿ�:
	 			�Ȳ�������Ϊnull,Ҳ���ǿ��ַ�
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

	//�ж��ַ����Ƿ�ǿ�
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
		String str1 = "";//Ϊ��
		String str2 = " ";//Ϊ��
		String str3 = null;//Ϊ��
		String str = " ";
		//�ж��ַ����ǿ�
		/*if (str != null && !"".equals(str.trim())) {
			System.out.println("�ǿ�");
		} else {
			System.out.println("��");
		}*/
	}

	//String��ϰ��ȡ��hello��ͷ���ļ����ĺ�׺��
	private static void test1() {
		//����ļ�����ɵ�һ���ַ���
		String fileNames = "abc.java;hello.will.txt;hello.java;hello.class";
		//1):�Էֺ����ָ��ַ���,��ȡÿһ���ļ������ƺ���չ��
		String[] names = fileNames.split(";");
		for (String name : names) {
			//�ж�ÿһ���ַ����Ƿ���hello��ͷ
			if (name.startsWith("hello")) {
				//��ȡ�ļ����ĺ�׺��:���һ����ĺ���
				//System.out.println(name);
				int index = name.lastIndexOf(".");
				//System.out.println(index);
				String substring = name.substring(index);
				//System.out.println(substring);
			}
		}
	}

	//String��ϰ�ѵ�������ĸ��д
	private static void test2() {
		String str = "asm";
		//1):��ȡ��һ���ַ���,��ת��Ϊ��д
		String upperCase = str.substring(0, 1).toUpperCase();
		System.out.println(upperCase);
		//2):��ȡ�ַ���
		String substring = str.substring(1);
		System.out.println(upperCase + substring);

	}
}
