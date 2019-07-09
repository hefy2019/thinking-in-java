package com.hfy.generictype;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Why {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(1);//Integer类型
		Object ele = list.get(0);
		System.out.println(ele);
		//现在需要操作Integer类中的方法
		Integer num = (Integer) ele;
		System.out.println(num);

		TreeSet set = new TreeSet();//集合类
		set.add(123);
		set.add("ABC"); //ClassCastException 类型转换异常
	}
}
