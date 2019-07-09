package com.hfy._06_java7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class AutoCloseDemo {
	public static void main(String[] args) {
		test1();
		test2();
	}

	//java7�ֶ���Դ�ر�
	private static void test2() {
		OutputStream out = null;
		try {
			//��һ����Դ����
			out = new FileOutputStream("C:/123.txt");
			//������Դ����
			out.write(1);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//�ر���Դ
			try {
				if (out != null) {
					out.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	//java7��ʼ���Զ���Դ�ر�
	private static void test1() {

		try (//����Դ����
				OutputStream out = new FileOutputStream("C:/123.txt");) {//���ܳ����쳣�Ĵ���
			out.write(1);//IO�쳣  
		} catch (Exception e) {
			//�����쳣
			e.printStackTrace();
		}

	}

}
