package com.hfy.array;

public class MyArrayListDemo {
	public static void main(String[] args) {
		//���������б����
		MyArrayList list = new MyArrayList();
		System.out.println(list.isEmpty());//true Ϊ��
		list.add("A");
		System.out.println(list.isEmpty());//false ����
		list.add("B");
		list.add("C");
		list.add(1);
		list.add(2);
		list.add(true);
		//��ӡ���϶���:��ӡ�����д洢������
		System.out.println(list);
		//list.print();
		list.remove(0);
		System.out.println(list);
		System.out.println(list.size());//5
		//��ռ����е�Ԫ��
		list.clear();
		System.out.println(list);//[]
	}
}
