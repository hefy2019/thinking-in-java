package com.hfy.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StudentDemo {
	public static void main(String[] args) {
		//ʹ��Set���ϴ洢һ���༶ѧ��������
		Set<String> name1 = new HashSet<>();
		name1.add("��һ");
		name1.add("ٻ��");
		name1.add("����");

		//ѧԺA
		Set<String> name2 = new HashSet<>();
		name2.add("���Ŵ�ѩ");
		name2.add("Ҷ�³�");
		name2.add("½С��");
		//ʹ��Map���洢����༶��ѧ��
		//ѧԺA
		Map<String, Set<String>> classMap1 = new HashMap<>();
		classMap1.put("ѧǰ��", name1);
		classMap1.put("�����", name2);
		//ѧԺB
		Map<String, Set<String>> classMap2 = new HashMap<>();
		classMap2.put("ѧǰ��", name1);
		classMap2.put("�����", name2);
		//ʹ��List���洢����ѧԺ��ѧ������
		List<Map<String, Set<String>>> school = new ArrayList<>();
		school.add(classMap1);
		school.add(classMap2);
		System.out.println(school);

		//List<Map<String, Object>> list = new ArrayList<>();   �õñȽ϶�
	}
}
