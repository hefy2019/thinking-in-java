package com.hfy.linked;

public class MyLinkedListDemo {

	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		list.addLast("B");
		list.addLast("C");
		list.addLast("D");
		list.addFirst("A");
		list.addLast("E");
		System.out.println(list);
		list.remove("B");
		System.out.println(list);
	}
}
