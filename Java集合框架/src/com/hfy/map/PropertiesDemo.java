package com.hfy.map;

import java.io.InputStream;
import java.util.Properties;

//属性类
public class PropertiesDemo {
	public static void main(String[] args) throws Exception {
		//是Map的实现类,是Hashtable的子类
		Properties p = new Properties();
		p.setProperty("username", "root");
		p.setProperty("password", "admin");
		System.out.println(p);
		//根据key获取value值
		String val = p.getProperty("username", "//该key不存在是,返回的默认值");
		System.out.println(val);

		//加载资源文件(IO)
		InputStream inputStream = null;
		p.load(inputStream);
	}
}
