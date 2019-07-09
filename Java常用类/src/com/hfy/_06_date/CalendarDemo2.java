package com.hfy._06_date;

import java.util.Calendar;
import java.util.Date;

//判断条件:hireDate >= beginTime && hireDate < endTime //当前系统今天凌晨之前
public class CalendarDemo2 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		//需求:查询最近一周......的信息,如何表示这一周
		Date current = new java.util.Date();

		//把当前系统时间,作为日历的时间
		Calendar c = Calendar.getInstance();
		c.setTime(current);
		//把日历增加1天,再把时,分,秒设置为0
		c.add(Calendar.DAY_OF_MONTH, 1);
		//HOUR、MINUTE 和 SECOND 
		c.set(Calendar.HOUR_OF_DAY, 0);//把时设置为0
		c.set(Calendar.MINUTE, 0);//把分设置为0
		c.set(Calendar.SECOND, 0);//把秒设置为0
		Date endTime = c.getTime();//结束时间  
		c.add(Calendar.DAY_OF_MONTH, -7);
		Date beginTime = c.getTime();//开始时间
		System.out.println("开始时间=" + beginTime.toLocaleString());//2017-10-21 0:00:00
		System.out.println("结束时间=" + endTime.toLocaleString());//2017-10-28 0:00:00
	}
}