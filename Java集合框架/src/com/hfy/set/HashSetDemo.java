package com.hfy.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//演示HashSet
public class HashSetDemo {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		//System.out.println(set);//不保证添加的循序 [0, A, 1, c, X]
		Set<String> set2 = new HashSet<>();
		set2.add("1");
		set2.add("2");
		set.addAll(set2);
		System.out.println(set);
		//set.clear();  
		//System.out.println(set); []
		System.out.println(set.contains("2"));
		for (String ele : set) {
			System.out.println(ele);
		}
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
