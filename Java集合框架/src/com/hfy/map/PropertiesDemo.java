package com.hfy.map;

import java.io.InputStream;
import java.util.Properties;

//������
public class PropertiesDemo {
	public static void main(String[] args) throws Exception {
		//��Map��ʵ����,��Hashtable������
		Properties p = new Properties();
		p.setProperty("username", "root");
		p.setProperty("password", "admin");
		System.out.println(p);
		//����key��ȡvalueֵ
		String val = p.getProperty("username", "//��key��������,���ص�Ĭ��ֵ");
		System.out.println(val);

		//������Դ�ļ�(IO)
		InputStream inputStream = null;
		p.load(inputStream);
	}
}
