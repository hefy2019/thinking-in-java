package com.hfy._06_java7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class AutoCloseDemo {
	public static void main(String[] args) {
		test1();
		test2();
	}

	//java7手动资源关闭
	private static void test2() {
		OutputStream out = null;
		try {
			//打开一个资源对象
			out = new FileOutputStream("C:/123.txt");
			//操作资源对象
			out.write(1);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//关闭资源
			try {
				if (out != null) {
					out.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	//java7开始的自动资源关闭
	private static void test1() {

		try (//打开资源对象
				OutputStream out = new FileOutputStream("C:/123.txt");) {//可能出现异常的代码
			out.write(1);//IO异常  
		} catch (Exception e) {
			//处理异常
			e.printStackTrace();
		}

	}

}
