package com.hfy.iterator;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("A");
		v.add("B");
		v.add("C");
		v.add("D");
		//���ϵĵ���������
		Enumeration en = v.elements();
		while (en.hasMoreElements()) {
			Object ele = en.nextElement();
			System.out.println(ele);
		}
	}
}
