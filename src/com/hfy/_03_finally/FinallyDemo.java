package com.hfy._03_finally;

//ʹ��try-catch���񵥸��쳣
public class FinallyDemo {
	public static void main(String[] args) {
		//����finally
		//test1();
		//���finally��return���,��Զ����finally�еĽ��,��������
		//test2();
		test3();
		int ret = test3();
		System.out.println(ret);// 1
	}

	private static int test3() {
		int a = 1;
		try {
			return 
					a;
		} finally {
			++
			a;
		}
	}

	private static int test2() {
		try {
			return 1;
		} finally {
			return 100;
		}
	}

	private static void test1() {
		System.out.println("begin...");
		try {
			int ret = 10 / 0;
			System.out.println("���=" + ret);
		} catch (ArithmeticException e) {
			System.out.println("�쳣����Ϊ0");
			//throw e;
			System.exit(0);//�˳�JVM  ��ʱ��ִ��  finally
		} finally {
			System.out.println("�ر���Դ");
		}
		System.out.println("end...");
	}
}
