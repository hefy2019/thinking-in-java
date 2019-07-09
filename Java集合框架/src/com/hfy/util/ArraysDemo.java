package com.hfy.util;

import java.util.Arrays;
import java.util.List;

public class ArraysDemo {
	public static void main(String[] args) {
		//把输出转换为List对象
		String[] arr = { "A", "B", "C", "D" };
		List<String> list = Arrays.asList(arr);
		System.out.println(list);
		//list.remove(0); 删除第一个元素
		//System.out.println(list);//返回错误: UnsupportedOperationException
		//==============================
		//可以自动装箱,把1看成是Integer对象
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println(list1);//[1, 2, 3, 4, 5]
		
		//定义了int类型的数组
		int[] arr2 = { 1, 2, 3, 4, 5 };
		//直接把数组当做事对象
		List<int[]> list2 = Arrays.asList(arr2);
		System.out.println(list2);//[[I@15db9742]
	}
}
