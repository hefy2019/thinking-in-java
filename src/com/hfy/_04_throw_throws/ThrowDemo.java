package com.hfy._04_throw_throws;

public class ThrowDemo {
	public static void main(String[] args) {
		System.out.println("ABDCE".charAt(1));//打印index的值
		System.out.println("--------------------------------");
		try {
			int ret = divide(10, 2);
			System.out.println(ret);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static int divide(int num1, int num2) {
		System.out.println("begin...");
		if (num2 == 0) {
			throw new ArithmeticException("除数不能为0");//throw 返回一个错误的对象
		}
		System.out.println("--------------------------------");
		try {
			int ret = num1 / num2;
			System.out.println("结果=" + ret);
			return ret;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("end...");
		return 0;
	}
}
