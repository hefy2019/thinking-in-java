package com.hfy.set;

import java.util.HashSet;
import java.util.Set;

class A {
	public boolean equals(Object o) {
		return true;
	}
}

class B {
	public int hashCode() {
		return 1;
	}
}

class C {
	public boolean equals(Object obj) {
		return true;
	}

	public int hashCode() {
		return 2;
	}
}

public class HashSetDemo2 {
	public static void main(String[] args) {
		Set<Object> set = new HashSet<>();
		set.add(new A());
		set.add(new A());
		set.add(new B());
		set.add(new B());
		set.add(new C());
		set.add(new C());
		System.out.println(set.size());
		System.out.println(set);
	}
}
