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

	//��д�ȽϹ���
	public int compareTo(Person other) {
		if (this.age > other.age) {
			return 1;
		} else if (this.age < other.age) {
			return -1;
		}
		return 0; // ��Ҫ�����ж�,�൱��ͳͳ����0,ֻ��ӡ��һ������,�����Ķ���Ӳ���ȥ
	}
}

public class TreeSetDemo2 {
	public static void main(String[] args) {
		//����Person�������������Ȼ����  (��С����)
		Set<Person> set = new TreeSet<>();
		set.add(new Person("���Ŵ�ѩ", 98));
		set.add(new Person("ٻ��", 18));
		set.add(new Person("��С��", 10));
		set.add(new Person("��", 52));
		System.out.println(set);
		System.out.println("--------------------------------");
		//����Person��������ֵĳ���������������
		Set<Person> set2 = new TreeSet<>(new NameLengthComparator());
		set2.add(new Person("���Ŵ�ѩ", 98));
		set2.add(new Person("ٻ��", 18));
		set2.add(new Person("��С��", 10));
		set2.add(new Person("��", 52));
		System.out.println(set2);
	}
}

//���ֳ��ȱȽ���
class NameLengthComparator implements Comparator<Person> {
	public int compare(Person o1, Person o2) {
		//��д�ȽϹ���
		if (o1.name.length() > o2.name.length()) {
			return 1;
		} else if (o1.name.length() < o2.name.length()) {
			return -1;
		}
		return 0;
	}
}
