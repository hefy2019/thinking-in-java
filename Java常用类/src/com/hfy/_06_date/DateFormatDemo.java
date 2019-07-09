package com.hfy._06_date;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class DateFormatDemo {
	public static void main(String[] args) throws Exception {
		Date date = new Date();
		System.out.println(date);//ŷ�����  Fri Oct 27 09:34:20 CST 2017
		//��ʽ������
		DateFormat df = DateFormat.getInstance();//Ĭ��SHORT���
		String time = df.format(date);
		System.out.println(time);//17-10-27 ����9:34
		df = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		System.out.println(df.format(date));//2017��10��27�� ����09ʱ34��20��
		System.out.println("--------------------------------");
		//��������:String����ʱ��--->Date����
		df = DateFormat.getInstance();//SHORT���
		time = df.format(date);
		Date date2 = df.parse(time);
		System.out.println(date2);//Fri Oct 27 09:34:00 CST 2017
		System.out.println(df.parse(df.format(date)));
		
	}
}
