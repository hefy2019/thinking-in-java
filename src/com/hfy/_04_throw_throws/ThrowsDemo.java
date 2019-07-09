package com.hfy._04_throw_throws;

public class ThrowsDemo {
	public static void main(String[] args) throws Exception {
		divide(10, 1);
	}

	//��ʾ:�ڱ������в�����ĳ�����͵��쳣,���ѵ�������Ҫ��������쳣
	private static int divide(int num1, int num2) throws Exception {
		System.out.println("begin...");
		if (num2 == 0) {
			throw new  Exception("��������Ϊ0");//throw ����һ������Ķ���
		}
		System.out.println("--------------------------------");
		try {
			int ret = num1 / num2;
			System.out.println("���=" + ret);
			return ret;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("end...");
		return 0;
	}
}
