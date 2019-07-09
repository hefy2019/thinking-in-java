package com.hfy.generictype;

import java.util.ArrayList;
import java.util.List;

//堆污染警告    : 泛型的擦除    当一个方法使用泛型的时候也使用可变参数,此时容易导致堆污染问题.  如在Arrays类中的asList方法
public class generictypeDemo2 {
	public static void main(String[] args) {
		//带有Integer 类型的泛型
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(123);
		//不带泛型的集合
		List list2 = null;
		list2 = list1;//此时泛型被擦除
		list2.add("ABC");
		//带有String类型的泛型
		List<String> list3 = null;
		list3 = list2;
		//等价于: String num2 = 123; 报错
		String num = list3.get(0);//异常 ClassCastException  :Integer cannot be cast to java.lang.String
	}

	// 堆污染: Type safety: Potential heap pollution via varargs parameter arr
	//@SafeVarargs	抑制警告,没有解决问题
	public static <T> List<T> asList(T... arr) {
		return null;
	}
}
