package com.hfy._06_date;

//��ʾjava.util.Date��  
public class DateDemo {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		//����Date����
		java.util.Date date = new java.util.Date();
		System.out.println(date);//Thu Oct 26 22:13:24 CST 2017
		date = new java.util.Date(System.currentTimeMillis());
		System.out.println(date);//Thu Oct 26 22:13:24 CST 2017;
		System.out.println(date.getTime());//���غ����� 1509027204884
		System.out.println(date.toLocaleString());//2017-10-26 22:13:24 (������ʹ��)
	}

}
