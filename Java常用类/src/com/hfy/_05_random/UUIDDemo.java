package com.hfy._05_random;

import java.util.UUID;
//表示随机唯一的字符串  , 数据库主键中用到
public class UUIDDemo {
	public static void main(String[] args) {
		String uuid = UUID.randomUUID().toString();
		System.out.println(uuid);
	}
}
