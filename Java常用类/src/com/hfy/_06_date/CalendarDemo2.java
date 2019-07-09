package com.hfy._06_date;

import java.util.Calendar;
import java.util.Date;

//�ж�����:hireDate >= beginTime && hireDate < endTime //��ǰϵͳ�����賿֮ǰ
public class CalendarDemo2 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		//����:��ѯ���һ��......����Ϣ,��α�ʾ��һ��
		Date current = new java.util.Date();

		//�ѵ�ǰϵͳʱ��,��Ϊ������ʱ��
		Calendar c = Calendar.getInstance();
		c.setTime(current);
		//����������1��,�ٰ�ʱ,��,������Ϊ0
		c.add(Calendar.DAY_OF_MONTH, 1);
		//HOUR��MINUTE �� SECOND 
		c.set(Calendar.HOUR_OF_DAY, 0);//��ʱ����Ϊ0
		c.set(Calendar.MINUTE, 0);//�ѷ�����Ϊ0
		c.set(Calendar.SECOND, 0);//��������Ϊ0
		Date endTime = c.getTime();//����ʱ��  
		c.add(Calendar.DAY_OF_MONTH, -7);
		Date beginTime = c.getTime();//��ʼʱ��
		System.out.println("��ʼʱ��=" + beginTime.toLocaleString());//2017-10-21 0:00:00
		System.out.println("����ʱ��=" + endTime.toLocaleString());//2017-10-28 0:00:00
	}
}