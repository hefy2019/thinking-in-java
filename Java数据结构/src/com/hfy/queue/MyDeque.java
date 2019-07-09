package com.hfy.queue;

import com.hfy.linked.MyLinkedList;

public class MyDeque extends MyLinkedList {

	public Object getFirst() {
		return this.first;
	}

	public Object getLast() {
		return this.last;
	}

	public void removeFirst() {
		remove(this.first);
	}

	public void removeLast() {
		remove(this.last);
	}

	public void addFirst(Object ele) {
		super.addFirst(ele);
	}

	public void addLast(Object ele) {
		super.addLast(ele);
	}
}