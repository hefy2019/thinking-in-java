package com.hfy.list;

import java.util.LinkedList;

//LinkedList��ʵ�ֵ�����к�˫����еĽӿ�
public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		list.addLast("B");
		list.addLast("C");
		list.addLast("D");
		
		list.addFirst("A");
		System.out.println(list);
	}
}
