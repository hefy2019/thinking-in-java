package com.hfy._06_java7;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

//java7:��ǿ��throw  �쳣����final �������¸�ֵ   ���Լ� '|' �������쳣 
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
			throw e;//�����׸�������
		}
	}
}
