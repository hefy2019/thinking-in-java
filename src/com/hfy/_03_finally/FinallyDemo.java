package com.hfy._03_finally;

//使用try-catch捕获单个异常
public class FinallyDemo {
	public static void main(String[] args) {
		//讲解finally
		//test1();
		//如果finally有return语句,永远返回finally中的结果,避免该情况
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
			System.out.println("结果=" + ret);
		} catch (ArithmeticException e) {
			System.out.println("异常除数为0");
			//throw e;
			System.exit(0);//退出JVM  此时不执行  finally
		} finally {
			System.out.println("关闭资源");
		}
		System.out.println("end...");
	}
}
