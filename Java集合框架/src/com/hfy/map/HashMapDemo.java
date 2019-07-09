package com.hfy.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		map.put("key4", "value4");
		map.put("key5", "value5");
		//System.out.println(map);
		//map.clear();
		System.out.println(map);//{key1=value1, key2=value2, key5=value5, key3=value3, key4=value4}
		boolean containsKey = map.containsKey("key1");
		System.out.println(containsKey);//true
		System.out.println(map.containsValue("value0"));//false
		System.out.println(map.get("key3"));//value3
		System.out.println(map.size());//5
		System.out.println(map.isEmpty());//false
		map.remove("key5");
		System.out.println(map.remove("key5"));//null
		System.out.println(map);//{key1=value1, key2=value2, key3=value3, key4=value4}
		//��ȡMap������key����ɵļ���(key�ǲ����ظ���,������Set)
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key + "->" + map.get(key));
		}
		//��ȡMap������value����ɵļ���(value�����ظ�,������List)
		Collection<Object> values = map.values();
		for (Object val : values) {
			System.out.println(val);
		}
		//��ȡMap�����е�Entry(key-value)
		Set<Entry<String, Object>> entrys = map.entrySet();
		for (Entry<String, Object> entry : entrys) {
			//System.out.print(entry + ","); //key1=value1,key2=value2,key3=value3,key4=value4,
			String key = entry.getKey();//��ȡkey
			Object value = entry.getValue();//��ȡvalue
			System.out.println(key + "->" + value);
		}
	}
}
