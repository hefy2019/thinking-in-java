package com.hfy.set;

import java.util.HashSet;
import java.util.Set;

class Student {
	private int sn;
	private String name;
	private int age;

	public Student(int sn, String name, int age) {
		super();
		this.sn = sn;
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "Student [sn=" + sn + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + sn;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (sn != other.sn)
			return false;
		return true;
	}

}

public class HashSetDemo3 {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();
		set.add(new Student(1, "赵一", 17));
		set.add(new Student(1, "赵一", 17));
		set.add(new Student(3, "张三", 18));
		set.add(new Student(4, "张三", 18));
		System.out.println(set.size());
		System.out.println(set);
	}
}
