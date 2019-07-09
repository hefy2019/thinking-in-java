package com.hfy.map;

import java.util.Map;
import java.util.TreeMap;

//计算一个字符串中,每一个字符出现的次数
public class MapDemo {
	public static void main(String[] args) {
		String str = "adjijgnruvjaeoqjaosnvraodjadmvkfkgjriaaffi";
		//把字符串转换为char数组(字符串本质就是char[])
		char[] arr = str.toCharArray();
		//key存储字符名,value存储出现次数
		Map<Character, Integer> map = new TreeMap<>();
		for (char ch : arr) {
			//判断当前字符是否在Map中的key存在
			if (map.containsKey(ch)) {
				//当前Map的key包含该字符,此时取出该value值递增,再存放进去
				Integer old = map.get(ch);
				map.put(ch, old + 1);
			} else {
				//当前Map的key不包含该字符,把该字符存储到Map中.设置value为1
				map.put(ch, 1);
			}
		}
		//System.out.println(map);//HashMap<>(); {a=7, d=3, e=1, f=3, g=2, i=3, j=6, k=2, m=1, n=2, o=3, q=1, r=3, s=1, u=1, v=3}
		//System.out.println(map);//LinkedHashMap<>(); {a=7, d=3, j=6, i=3, g=2, n=2, r=3, u=1, v=3, e=1, o=3, q=1, s=1, m=1, k=2, f=3}
		System.out.println(map);//TreeMap<>(); {a=7, d=3, e=1, f=3, g=2, i=3, j=6, k=2, m=1, n=2, o=3, q=1, r=3, s=1, u=1, v=3}

	}
}
