package com.hfy.set;

import java.util.LinkedHashSet;
import java.util.Set;

//ʹ�ù�ϣ��������㷨,��֤��HashSet��Ԫ�ص��Ⱥ����˳��
public class LinkedHashSetDemo {
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>();
		set.add("X");
		set.add("C");
		set.add("B");
		set.add("1");
		set.add("2");
		System.out.println(set);
	}
}
