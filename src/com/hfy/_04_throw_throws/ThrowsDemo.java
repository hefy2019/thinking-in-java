package com.hfy._04_throw_throws;

public class ThrowsDemo {
	public static void main(String[] args) throws Exception {
		divide(10, 1);
	}

	//表示:在本方法中不处理某种类型的异常,提醒调用者需要来处理该异常
	private static int divide(int num1, int num2) throws Exception {
		System.out.println("begin...");
		if (num2 == 0) {
			throw new  Exception("除数不能为0");//throw 返回一个错误的对象
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
