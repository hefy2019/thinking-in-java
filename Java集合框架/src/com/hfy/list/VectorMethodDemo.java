package com.hfy.list;

import java.util.Vector;

public class VectorMethodDemo {
	public static void main(String[] args) {

		testAdd();
		testRemove();
		testUpdate();
	}
	
	/**
	 Object set(int index, Object element)	�޸ĵ�ǰ������ָ������λ�õ�Ԫ��
	 	���ر��滻�ľɵ�Ԫ��
	 */
	private static void testUpdate() {
	}

	/**
	 Object remove(int index)	ɾ��ָ������λ�õ�Ԫ��,������ɾ��֮���Ԫ��
	 boolean remove(Object o)	ɾ��ָ����Ԫ��
	 boolean removaAll(Collection c)	�Ӵ˼������Ƴ�������ָ������c�е�����Ԫ��
	 boolean retainAll(Collection c)	�ڴ˼����н�����������ָ������c�е�Ԫ�� (���������ϵĽ���)
	 */
	private static void testRemove() {
	}

	/**
	 boolean add(Object e)	��ָ��Ԫ����ӵ���������ĩβ,�ȼ���addElement����
	 void add(int index, Object element)	�ڴ�������ָ��λ�ò���ָ����Ԫ��
	 boolean addAll(Collection c)	�Ѽ����е�����Ԫ����ӵ���ǰ���϶�����
	 */
	private static void testAdd() {
		Vector v1 = new Vector();
		v1.add("A");
		v1.add("B");
		v1.add("C");
		//System.out.println(v1);
		//v1.add(0, "will");//���ܲ���
		System.out.println(v1);

		Vector v2 = new Vector();
		v2.add(1);
		v2.add(2);
		v2.add(3);

		//v1.add(v2);//[A, B, C, [1, 2, 3]]   ��v2����һ������
		v1.addAll(v2);//[A, B, C, 1, 2, 3]	  ����������ֵ
		System.out.println(v1);
	}
}
