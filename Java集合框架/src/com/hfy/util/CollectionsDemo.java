package com.hfy.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
	public static void main(String[] args) {
		List<Object> list1 = Collections.EMPTY_LIST;//常量
		List<Object> list2 = Collections.emptyList();//方法
		List<Object> list3 = new ArrayList<>();//从Java7开始,方法
	}
}
