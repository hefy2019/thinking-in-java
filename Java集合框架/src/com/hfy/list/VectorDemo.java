package com.hfy.list;

import java.util.Vector;

//��ʾVector���еķ���
//@SuppressWarnings("all")  ���Ʊ��������������еĻ�ɫ����
public class VectorDemo {
	public static void main(String[] args) {
		Vector v = new Vector(5);
		StringBuilder sb = new StringBuilder("ABC");
		v.addElement(sb);
		System.out.println(v);
		sb.append("SeeMyGo");
		System.out.println(v);//���õ��Ƕ��д�������ĵ�ַ,�������ݱ���
	}
}
