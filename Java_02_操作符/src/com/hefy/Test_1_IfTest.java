package com.hefy;

/**
 * @author hefy:
 * @date 2019��7��14�� ����12:58:06
 * @version 1.0 ��˵��  if() ���������Ϊ�Ƚϱ��ʽ������ֵҪô�� true��Ҫô�� false��if(x=y) �ǽ� y ��ֵ�� x���������������� int ���͵ģ����벻��ͨ����
 */
public class Test_1_IfTest {
	public static void main(String[] args) {
		int x = 3;
		int y = 1;
		if (x == y) // ��if (x = y) Type mismatch: cannot convert from int to boolean ����������
			System.out.println("�����");
		else
			System.out.println("���");
	}
}
