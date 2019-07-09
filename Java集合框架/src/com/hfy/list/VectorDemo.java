package com.hfy.list;

import java.util.Vector;

//演示Vector类中的方法
//@SuppressWarnings("all")  抑制编译器发出的所有的黄色警告
public class VectorDemo {
	public static void main(String[] args) {
		Vector v = new Vector(5);
		StringBuilder sb = new StringBuilder("ABC");
		v.addElement(sb);
		System.out.println(v);
		sb.append("SeeMyGo");
		System.out.println(v);//引用的是堆中创建对象的地址,不是数据本身
	}
}
