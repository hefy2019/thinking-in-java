package com.hfy.list;

import java.util.LinkedList;

//LinkedList类实现单向队列和双向队列的接口
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
