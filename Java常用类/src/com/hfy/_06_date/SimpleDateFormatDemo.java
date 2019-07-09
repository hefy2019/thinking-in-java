package com.hfy._06_date;

import java.text.SimpleDateFormat;

public class SimpleDateFormatDemo {
	public static void main(String[] args) throws Exception {
		//�Զ������ڸ�ʽ
		String pattern = "yyyy/MM/dd HH:mm:ss E";
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern(pattern);//����ʹ����һ��ʱ��ģʽ
		//��ʽ��
		String time = sdf.format(new java.util.Date());
		System.out.println(time);//2017/10/27 00:28:05 ������
		//����
		java.util.Date d = sdf.parse(time);
		System.out.println(d);//Fri Oct 27 00:28:05 CST 2017
	}
}
