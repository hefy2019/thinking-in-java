package com.hfy.generictype;

import java.util.ArrayList;
import java.util.List;

//���͵�ͨ���: ? 
public class generictypeDemo {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		List<Number> list3 = new ArrayList<>();
		List<Object> list4 = new ArrayList<>();

		doWork1(list1);
		//doWork1(list2); ����
		doWork1(list3);
		//doWork1(list4); ����

		//doWork2(list1); ����
		//doWork2(list2); ����
		doWork2(list3);
		doWork2(list4);
	}

	//���͵�����:��ʱ�ķ���?,������Number���ͻ�Number�������
	private static void doWork1(List<? extends Number> list) {
	}

	//���͵�����:��ʱ�ķ���?,������Number���ͻ�Number��ĸ���
	private static void doWork2(List<? super Number> list) {
	}
}
