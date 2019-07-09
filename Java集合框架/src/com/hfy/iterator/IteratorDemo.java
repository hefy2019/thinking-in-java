package com.hfy.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//����Ԫ�صĵ���/��������
public class IteratorDemo {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		//��ʽ1: forѭ��
		for (int index = 0; index < list.size(); index++) {
			Object ele = list.get(index);
			System.out.println(ele);
		}
		System.out.println("--------------------------------");
		//��ʽ2: for-each ��ǿforѭ��
		/*
		 for(����    ����: ������/iterable��ʵ��){
		 	//TODO
		 }
		 */
		for (Object ele : list) {
			System.out.println(ele);
		}
		System.out.println("--------------------------------");
		//��ʽ3: ʹ��whileѭ������������Iterator()
		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		//��ʽ4: ʹ��forѭ������������Iterator()   ���ܻ���� :�ͷ� it2 
		for (Iterator it2 = list.iterator(); it2.hasNext();) {
			System.out.println(it2.next());
		}
	}
}
