package com.hfy._06_java7;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

//java7:增强的throw  异常中有final 不能重新赋值   可以加 '|' 或两个异常 
public class ThrowDemo {
	public static void main(String[] args) {
		try {
			doWork();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static void doWork() throws FileNotFoundException {
		try {
			new FileOutputStream("");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;//继续抛给调用者
		}
	}
}
