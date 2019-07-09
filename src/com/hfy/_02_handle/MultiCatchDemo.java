package com.hfy._02_handle;

//使用try-catch捕获多个异常:
public class MultiCatchDemo {
	public static void main(String[] args) {
		System.out.println("begin...");
		String sNum1 = "10";//用户输入被除数
		String sNum2 = "0";//用户输入除数   
		try {
			//把String转换为int类型
			int num1 = Integer.parseInt(sNum1);
			int num2 = Integer.parseInt(sNum2);
			//两个整数相处
			int ret = num1 / num2;
			System.out.println("结果=" + ret);
		} catch (ArithmeticException e) {
			//System.out.println(e.getMessage()); 返回此 throwable 的详细消息字符串
			e.printStackTrace();
		} catch (NumberFormatException e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			//都不属于上述异常则调用此处
			e.printStackTrace();
		}
		System.out.println("end...");
	}
}
