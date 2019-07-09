package com.hfy.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StudentDemo {
	public static void main(String[] args) {
		//使用Set集合存储一个班级学生的名称
		Set<String> name1 = new HashSet<>();
		name1.add("赵一");
		name1.add("倩儿");
		name1.add("张三");

		//学院A
		Set<String> name2 = new HashSet<>();
		name2.add("西门吹雪");
		name2.add("叶孤城");
		name2.add("陆小凤");
		//使用Map来存储多个班级的学生
		//学院A
		Map<String, Set<String>> classMap1 = new HashMap<>();
		classMap1.put("学前班", name1);
		classMap1.put("大神班", name2);
		//学院B
		Map<String, Set<String>> classMap2 = new HashMap<>();
		classMap2.put("学前班", name1);
		classMap2.put("大神班", name2);
		//使用List来存储所有学院的学生姓名
		List<Map<String, Set<String>>> school = new ArrayList<>();
		school.add(classMap1);
		school.add(classMap2);
		System.out.println(school);

		//List<Map<String, Object>> list = new ArrayList<>();   用得比较多
	}
}
