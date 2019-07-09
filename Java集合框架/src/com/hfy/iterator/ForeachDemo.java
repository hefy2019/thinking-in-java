package com.hfy.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForeachDemo {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("B");
		/*
		for (Object ele : list) {
			System.out.println(ele);
			//删除集合中为b字符串的元素
			if ("B".equals(ele)) {//并发修改异常ConcurrentModificationException
				list.remove(ele);
			}
		}
		*/
		
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Object ele = it.next();
			if ("B".equals(ele)) {
				//list.remove(ele);	错误,不能使用集合对象的remove方法
				it.remove();
			}
		}
		System.out.println(list);
	}
}
