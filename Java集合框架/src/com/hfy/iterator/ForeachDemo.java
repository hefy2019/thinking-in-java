package com.hfy.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForeachDemo {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("B");
		/*
		for (Object ele : list) {
			System.out.println(ele);
			//ɾ��������Ϊb�ַ�����Ԫ��
			if ("B".equals(ele)) {//�����޸��쳣ConcurrentModificationException
				list.remove(ele);
			}
		}
		*/
		
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Object ele = it.next();
			if ("B".equals(ele)) {
				//list.remove(ele);	����,����ʹ�ü��϶����remove����
				it.remove();
			}
		}
		System.out.println(list);
	}
}
