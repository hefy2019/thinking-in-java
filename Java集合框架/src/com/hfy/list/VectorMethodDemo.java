package com.hfy.list;

import java.util.Vector;

public class VectorMethodDemo {
	public static void main(String[] args) {

		testAdd();
		testRemove();
		testUpdate();
	}
	
	/**
	 Object set(int index, Object element)	修改当前集合中指定索引位置的元素
	 	返回被替换的旧的元素
	 */
	private static void testUpdate() {
	}

	/**
	 Object remove(int index)	删除指定索引位置的元素,并返回删除之后的元素
	 boolean remove(Object o)	删除指定的元素
	 boolean removaAll(Collection c)	从此集合中移除包含在指定集合c中的所有元素
	 boolean retainAll(Collection c)	在此集合中仅保留包含在指定集合c中的元素 (求两个集合的交集)
	 */
	private static void testRemove() {
	}

	/**
	 boolean add(Object e)	将指定元素添加到此向量的末尾,等价于addElement方法
	 void add(int index, Object element)	在此向量的指定位置插入指定的元素
	 boolean addAll(Collection c)	把集合中的所有元素添加到当前集合对象中
	 */
	private static void testAdd() {
		Vector v1 = new Vector();
		v1.add("A");
		v1.add("B");
		v1.add("C");
		//System.out.println(v1);
		//v1.add(0, "will");//性能不高
		System.out.println(v1);

		Vector v2 = new Vector();
		v2.add(1);
		v2.add(2);
		v2.add(3);

		//v1.add(v2);//[A, B, C, [1, 2, 3]]   把v2看成一个整体
		v1.addAll(v2);//[A, B, C, 1, 2, 3]	  增大其索引值
		System.out.println(v1);
	}
}
