package com.hfy.stack;

import com.hfy.array.MyArrayList;

//基于数组实现的 栈 
public class MyStack extends MyArrayList {
	//入栈
	public void push(Object ele) {
		super.add(ele);
	}

	//删除栈顶元素
	public void pop() {
		int index = super.size() - 1;
		super.remove(index);
	}

	//查询栈顶元素
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
