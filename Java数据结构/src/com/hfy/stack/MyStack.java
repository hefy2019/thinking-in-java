package com.hfy.stack;

import com.hfy.array.MyArrayList;

//��������ʵ�ֵ� ջ 
public class MyStack extends MyArrayList {
	//��ջ
	public void push(Object ele) {
		super.add(ele);
	}

	//ɾ��ջ��Ԫ��
	public void pop() {
		int index = super.size() - 1;
		super.remove(index);
	}

	//��ѯջ��Ԫ��
	public Object peek() {
		int index = super.size() - 1;
		return get(index);
	}

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push("D");
		stack.push("C");
		stack.push("B");
		stack.push("A");
		System.out.println(stack);
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack);
	}
}
