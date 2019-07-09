package com.hfy._06_date;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class DateFormatDemo {
	public static void main(String[] args) throws Exception {
		Date date = new Date();
		System.out.println(date);//欧美风格  Fri Oct 27 09:34:20 CST 2017
		//格式化操作
		DateFormat df = DateFormat.getInstance();//默认SHORT风格
		String time = df.format(date);
		System.out.println(time);//17-10-27 上午9:34
		df = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		System.out.println(df.format(date));//2017年10月27日 上午09时34分20秒
		System.out.println("--------------------------------");
		//解析操作:String类型时间--->Date类型
		df = DateFormat.getInstance();//SHORT风格
		time = df.format(date);
		Date date2 = df.parse(time);
		System.out.println(date2);//Fri Oct 27 09:34:00 CST 2017
		System.out.println(df.parse(df.format(date)));
		
	}
}
