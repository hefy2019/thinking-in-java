package com.hfy.array;

public class MyArrayListDemo {
	public static void main(String[] args) {
		//创建数组列表对象
		MyArrayList list = new MyArrayList();
		System.out.println(list.isEmpty());//true 为空
		list.add("A");
		System.out.println(list.isEmpty());//false 不空
		list.add("B");
		list.add("C");
		list.add(1);
		list.add(2);
		list.add(true);
		//打印集合对象:打印集合中存储的数据
		System.out.println(list);
		//list.print();
		list.remove(0);
		System.out.println(list);
		System.out.println(list.size());//5
		//清空集合中的元素
		list.clear();
		System.out.println(list);//[]
	}
}
