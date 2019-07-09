package com.hfy.list;

import java.util.ArrayDeque;
import java.util.Stack;

//栈
public class StackDemo {
	public static void main(String[] args) {
		Stack s1 = new Stack();//最后一个位置是栈顶
		s1.push("C");
		s1.push("B");
		s1.push("A");
		System.out.println(s1);
		System.out.println(s1.peek());
		s1.pop();
		System.out.println(s1);
		System.out.println(s1.peek());
		//-------------------------------------
		System.out.println("--------------------------------");
		ArrayDeque s2 = new ArrayDeque();//第一个位置是栈顶
		s2.push("C");
		s2.push("B");
		s2.push("A");
		System.out.println(s2);
		System.out.println(s2.peek());
		s2.pop();
		System.out.println(s2);
		System.out.println(s2.peek());
	}
}
