package com.hfy._05_random;

import java.util.UUID;
//��ʾ���Ψһ���ַ���  , ���ݿ��������õ�
public class UUIDDemo {
	public static void main(String[] args) {
		String uuid = UUID.randomUUID().toString();
		System.out.println(uuid);
	}
}
