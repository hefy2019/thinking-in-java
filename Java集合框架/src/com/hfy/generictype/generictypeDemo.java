package com.hfy.generictype;

import java.util.ArrayList;
import java.util.List;

//泛型的通配符: ? 
public class generictypeDemo {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		List<Number> list3 = new ArrayList<>();
		List<Object> list4 = new ArrayList<>();

		doWork1(list1);
		//doWork1(list2); 报错
		doWork1(list3);
		//doWork1(list4); 报错

		//doWork2(list1); 报错
		//doWork2(list2); 报错
		doWork2(list3);
		doWork2(list4);
	}

	//泛型的上限:此时的泛型?,必须是Number类型或Number类的子类
	private static void doWork1(List<? extends Number> list) {
	}

	//泛型的下限:此时的泛型?,必须是Number类型或Number类的父类
	private static void doWork2(List<? super Number> list) {
	}
}
