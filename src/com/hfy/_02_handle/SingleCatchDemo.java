package com.hfy._02_handle;

//使用try-catch捕获单个异常
public class SingleCatchDemo {
	public static void main(String[] args) {
		System.out.println("begin...");
		try {
			int ret = 10 / 0;
			System.out.println("结果=" + ret);
		} catch (ArithmeticException e) {//捕获算术异常
			System.out.println("异常消息" + e.getMessage());//获取异常信息,异常的原因
			System.out.println(e);//打印对象即打印的是 toString() 
			System.out.println(e.toString());
			System.out.println("出异常啦...");
			e.printStackTrace();//打印异常的跟踪栈信息 ,  开发调试阶段使用
		}
		System.out.println("end...");
	}
}
