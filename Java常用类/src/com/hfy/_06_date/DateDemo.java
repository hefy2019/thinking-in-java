package com.hfy._06_date;

//演示java.util.Date类  
public class DateDemo {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		//创建Date对象
		java.util.Date date = new java.util.Date();
		System.out.println(date);//Thu Oct 26 22:13:24 CST 2017
		date = new java.util.Date(System.currentTimeMillis());
		System.out.println(date);//Thu Oct 26 22:13:24 CST 2017;
		System.out.println(date.getTime());//返回毫秒数 1509027204884
		System.out.println(date.toLocaleString());//2017-10-26 22:13:24 (不建议使用)
	}

}
