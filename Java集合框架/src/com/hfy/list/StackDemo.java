package com.hfy.list;

import java.util.ArrayDeque;
import java.util.Stack;

//ջ
public class StackDemo {
	public static void main(String[] args) {
		Stack s1 = new Stack();//���һ��λ����ջ��
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
		ArrayDeque s2 = new ArrayDeque();//��һ��λ����ջ��
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
