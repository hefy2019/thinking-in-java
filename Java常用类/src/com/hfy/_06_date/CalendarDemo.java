package com.hfy._06_date;

import java.util.Calendar;
import java.util.Date;

//������
public class CalendarDemo {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		//������������
		Calendar c = Calendar.getInstance();
		System.out.println(c);

		System.out.println("��=" + c.get(Calendar.YEAR));
		System.out.println("��=" + (c.get(Calendar.MONTH) + 1));
		System.out.println("��=" + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("ʱ=" + c.get(Calendar.HOUR_OF_DAY));
		System.out.println("��=" + c.get(Calendar.MINUTE));
		System.out.println("��=" + c.get(Calendar.SECOND));
		System.out.println("--------------------------------");
		//Calendarת��ΪDate����
		Date d = c.getTime();
		//abstract  void add(int field, int amount)  ���������Ĺ���Ϊ�����������ֶ���ӻ��ȥָ����ʱ����
		System.out.println("��=" + c.get(Calendar.DAY_OF_MONTH));
		c.add(Calendar.DAY_OF_MONTH, -5);
		System.out.println(c.getTime().toLocaleString());
	}
}
