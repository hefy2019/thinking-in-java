package com.hfy.map;

import java.util.Map;
import java.util.TreeMap;

//����һ���ַ�����,ÿһ���ַ����ֵĴ���
public class MapDemo {
	public static void main(String[] args) {
		String str = "adjijgnruvjaeoqjaosnvraodjadmvkfkgjriaaffi";
		//���ַ���ת��Ϊchar����(�ַ������ʾ���char[])
		char[] arr = str.toCharArray();
		//key�洢�ַ���,value�洢���ִ���
		Map<Character, Integer> map = new TreeMap<>();
		for (char ch : arr) {
			//�жϵ�ǰ�ַ��Ƿ���Map�е�key����
			if (map.containsKey(ch)) {
				//��ǰMap��key�������ַ�,��ʱȡ����valueֵ����,�ٴ�Ž�ȥ
				Integer old = map.get(ch);
				map.put(ch, old + 1);
			} else {
				//��ǰMap��key���������ַ�,�Ѹ��ַ��洢��Map��.����valueΪ1
				map.put(ch, 1);
			}
		}
		//System.out.println(map);//HashMap<>(); {a=7, d=3, e=1, f=3, g=2, i=3, j=6, k=2, m=1, n=2, o=3, q=1, r=3, s=1, u=1, v=3}
		//System.out.println(map);//LinkedHashMap<>(); {a=7, d=3, j=6, i=3, g=2, n=2, r=3, u=1, v=3, e=1, o=3, q=1, s=1, m=1, k=2, f=3}
		System.out.println(map);//TreeMap<>(); {a=7, d=3, e=1, f=3, g=2, i=3, j=6, k=2, m=1, n=2, o=3, q=1, r=3, s=1, u=1, v=3}

	}
}
