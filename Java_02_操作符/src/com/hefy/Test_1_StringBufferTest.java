package com.hefy;

/**
 * @author hefy:
 * @date 2019��7��14�� ����1:08:54
 * @version 1.0 ��˵��	delete(x, y) ɾ�����ַ��� x ������λ�ÿ�ʼ�� y-1 ��λ�ã�append() �������������ַ�����
 */
public class Test_1_StringBufferTest {
	public static void main(String[] args) {
		StringBuffer a = new StringBuffer("Runoob");
		StringBuffer b = new StringBuffer("Google");
		a.delete(1, 3);
		a.append(b);
		System.out.println(a);	//RoobGoogle
	}
}
