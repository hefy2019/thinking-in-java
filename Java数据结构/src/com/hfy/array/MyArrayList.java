package com.hfy.array;

import java.util.Arrays;

/**
 * 基于数组的列表(集合)
 * @author Administrator
 */
public class MyArrayList {
	//存储任意类型的元素
	private Object[] elements = null;
	//数组中存储了多少个元素
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 10;

	public MyArrayList() {//默认的构造器 
		this(DEFAULT_INITIAL_CAPACITY);
	}

	//构造器
	public MyArrayList(int initialCapacity) {
		if (initialCapacity < 0) {//容量检查
			throw new IllegalArgumentException("容量不能为负数");
		}
		elements = new Object[initialCapacity];
	}

	// 保存新的元素
	public void add(Object ele) {
		//判断和扩容
		if (size == elements.length) {
			Object[] temp = Arrays.copyOf(elements, elements.length * 2);
			elements = temp;
		}
		elements[size] = ele;
		size++;
	}

	// 查询指定索引位置的元素
	public Object get(int index) {
		if (index < 0 || index >= size) {//索引检查
			throw new IllegalArgumentException("索引越界");
		}
		return elements[index];
	}

	// 替换指定索引位置的元素值
	public void set(int index, Object newEle) {
		if (index < 0 || index >= size) {
			throw new IllegalArgumentException("索引越界");
		}
		elements[index] = newEle;
	}

	// 删除指定索引位置的元素
	public void remove(int index) {
		if (index < 0 || index >= size) {
			throw new IllegalArgumentException("索引越界");
		}
		for (int i = index; i < size - 1; i++) {
			//index + 1 位置移动到index 位置
			elements[i] = elements[i + 1];
		}
		//最后一个位置设置为null
		elements[size - 1] = null;
		//把场上球员总数减1
		size--;
	}

	public String toString() {
		if (elements == null) {
			return "null";
		}
		if (size == 0) {
			return "[]";
		}
		StringBuilder sb = new StringBuilder(size * 3 + 1);
		sb.append("[");
		for (int index = 0; index < size; index++) {
			sb.append(elements[index]);
			if (index != size - 1) {
				sb.append(",");
			} else {
				sb.append("]");
			}
		}
		return sb.toString();
	}

	//返回数组的元素个数
	public int size() {
		return size;
	}

	//判断数组中元素个数是否为: 0
	public boolean isEmpty() {
		return size == 0;
	}

	//清空集合中的元素
	public void clear() {
		elements = new Object[DEFAULT_INITIAL_CAPACITY];
		size = 0;
	} //查询JDK中的ArrayList 进行对比
}
