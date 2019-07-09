package com.hfy._06_date;

import java.text.SimpleDateFormat;

public class SimpleDateFormatDemo {
	public static void main(String[] args) throws Exception {
		//自定义日期格式
		String pattern = "yyyy/MM/dd HH:mm:ss E";
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern(pattern);//申请使用哪一种时间模式
		//格式化
		String time = sdf.format(new java.util.Date());
		System.out.println(time);//2017/10/27 00:28:05 星期五
		//解析
		java.util.Date d = sdf.parse(time);
		System.out.println(d);//Fri Oct 27 00:28:05 CST 2017
	}
}
