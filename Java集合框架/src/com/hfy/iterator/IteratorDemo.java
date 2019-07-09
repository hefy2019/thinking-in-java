package com.hfy.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//集合元素的迭代/遍历操作
public class IteratorDemo {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		//方式1: for循环
		for (int index = 0; index < list.size(); index++) {
			Object ele = list.get(index);
			System.out.println(ele);
		}
		System.out.println("--------------------------------");
		//方式2: for-each 增强for循环
		/*
		 for(类型    变量: 数组名/iterable的实例){
		 	//TODO
		 }
		 */
		for (Object ele : list) {
			System.out.println(ele);
		}
		System.out.println("--------------------------------");
		//方式3: 使用while循环操作迭代器Iterator()
		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		//方式4: 使用for循环操作迭代器Iterator()   性能会更好 :释放 it2 
		for (Iterator it2 = list.iterator(); it2.hasNext();) {
			System.out.println(it2.next());
		}
	}
}
