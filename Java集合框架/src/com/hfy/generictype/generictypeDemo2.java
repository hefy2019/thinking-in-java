package com.hfy.generictype;

import java.util.ArrayList;
import java.util.List;

//����Ⱦ����    : ���͵Ĳ���    ��һ������ʹ�÷��͵�ʱ��Ҳʹ�ÿɱ����,��ʱ���׵��¶���Ⱦ����.  ����Arrays���е�asList����
public class generictypeDemo2 {
	public static void main(String[] args) {
		//����Integer ���͵ķ���
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(123);
		//�������͵ļ���
		List list2 = null;
		list2 = list1;//��ʱ���ͱ�����
		list2.add("ABC");
		//����String���͵ķ���
		List<String> list3 = null;
		list3 = list2;
		//�ȼ���: String num2 = 123; ����
		String num = list3.get(0);//�쳣 ClassCastException  :Integer cannot be cast to java.lang.String
	}

	// ����Ⱦ: Type safety: Potential heap pollution via varargs parameter arr
	//@SafeVarargs	���ƾ���,û�н������
	public static <T> List<T> asList(T... arr) {
		return null;
	}
}
