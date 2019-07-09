package com.hfy.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		Map<String, Object> map = new TreeMap<>();
		map.put("C", "CValue");
		map.put("A", "Aalue");
		map.put("Z", "CValue");
		map.put("d", "dValue");
		map.put("a", "aValue");
		map.put("2", "2Value");
		map.put("1", "1Value");
		System.out.println(map);
	}
}
