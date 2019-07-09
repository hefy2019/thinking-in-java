package com.hfy._06_date;

import java.util.Calendar;
import java.util.Date;

//日历类
public class CalendarDemo {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		//创建日历对象
		Calendar c = Calendar.getInstance();
		System.out.println(c);

		System.out.println("年=" + c.get(Calendar.YEAR));
		System.out.println("月=" + (c.get(Calendar.MONTH) + 1));
		System.out.println("日=" + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("时=" + c.get(Calendar.HOUR_OF_DAY));
		System.out.println("分=" + c.get(Calendar.MINUTE));
		System.out.println("秒=" + c.get(Calendar.SECOND));
		System.out.println("--------------------------------");
		//Calendar转换为Date类型
		Date d = c.getTime();
		//abstract  void add(int field, int amount)  根据日历的规则，为给定的日历字段添加或减去指定的时间量
		System.out.println("日=" + c.get(Calendar.DAY_OF_MONTH));
		c.add(Calendar.DAY_OF_MONTH, -5);
		System.out.println(c.getTime().toLocaleString());
	}
}
