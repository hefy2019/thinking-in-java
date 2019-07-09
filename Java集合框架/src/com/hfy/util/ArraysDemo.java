package com.hfy.util;

import java.util.Arrays;
import java.util.List;

public class ArraysDemo {
	public static void main(String[] args) {
		//�����ת��ΪList����
		String[] arr = { "A", "B", "C", "D" };
		List<String> list = Arrays.asList(arr);
		System.out.println(list);
		//list.remove(0); ɾ����һ��Ԫ��
		//System.out.println(list);//���ش���: UnsupportedOperationException
		//==============================
		//�����Զ�װ��,��1������Integer����
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println(list1);//[1, 2, 3, 4, 5]
		
		//������int���͵�����
		int[] arr2 = { 1, 2, 3, 4, 5 };
		//ֱ�Ӱ����鵱���¶���
		List<int[]> list2 = Arrays.asList(arr2);
		System.out.println(list2);//[[I@15db9742]
	}
}
