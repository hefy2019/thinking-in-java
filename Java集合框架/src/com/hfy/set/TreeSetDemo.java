package com.hfy.set;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Object> set = new TreeSet<>();
		set.add("A");
		set.add("D");
		set.add("c");
		set.add("h");
		set.add("1");
		set.add("6");
		System.out.println(set);//[1, 6, A, D, c, h]  Âë±íµÄË³Ğò
		System.out.println(set.first());// 1
		System.out.println(set.last()); // h
		System.out.println(set.headSet("c")); // [1, 6]
	}
}
