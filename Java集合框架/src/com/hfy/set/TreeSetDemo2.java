package com.hfy.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Person implements java.lang.Comparable<Person> {
	String name;
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	//编写比较规则
	public int compareTo(Person other) {
		if (this.age > other.age) {
			return 1;
		} else if (this.age < other.age) {
			return -1;
		}
		return 0; // 不要以上判断,相当于统统返回0,只打印出一个对象,其它的都添加不进去
	}
}

public class TreeSetDemo2 {
	public static void main(String[] args) {
		//按照Person对象的年龄做自然排序  (从小到大)
		Set<Person> set = new TreeSet<>();
		set.add(new Person("李门吹雪", 98));
		set.add(new Person("倩儿", 18));
		set.add(new Person("孙小三", 10));
		set.add(new Person("赵", 52));
		System.out.println(set);
		System.out.println("--------------------------------");
		//按照Person对象的名字的长短来做定制排序
		Set<Person> set2 = new TreeSet<>(new NameLengthComparator());
		set2.add(new Person("李门吹雪", 98));
		set2.add(new Person("倩儿", 18));
		set2.add(new Person("孙小三", 10));
		set2.add(new Person("赵", 52));
		System.out.println(set2);
	}
}

//名字长度比较器
class NameLengthComparator implements Comparator<Person> {
	public int compare(Person o1, Person o2) {
		//编写比较规则
		if (o1.name.length() > o2.name.length()) {
			return 1;
		} else if (o1.name.length() < o2.name.length()) {
			return -1;
		}
		return 0;
	}
}
