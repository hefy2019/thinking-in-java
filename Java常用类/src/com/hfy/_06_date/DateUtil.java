package com.hfy._06_date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.hfy._04_char_sequence.StringUtil;

//���ڵĹ�����
public class DateUtil {
	public static final String DEFAULT_DATE_PATTERN = "yyyy-MM-dd HH:mm:ss";

	private DateUtil() {
	}

	public static void main(String[] args) {
		System.out.println(date2string(new Date(), "yyyy-MM-dd HH:mm:ss"));
		System.out.println(date2string(new Date(), "yyyy/MM/dd HH:mm:ss"));
		System.out.println(date2string(new Date(), "yyyy-MM-dd"));
		System.out.println(date2string(new Date(), null));
		System.out.println(date2string(new Date()));
	}

	//��ʽ������:��Date����--->String����
	public static String date2string(Date date) {
		return date2string(date, null);
	}

	public static String date2string(Date date, String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat();
		if (StringUtil.isBlank(pattern)) {
			pattern = DEFAULT_DATE_PATTERN;
		}
		sdf.applyPattern(pattern);
		return sdf.format(date);
	}

	//��������:��String����--->Date����
	public static Date string2date(String date) throws ParseException {
		return string2date(date, null);
	}

	public static Date string2date(String date, String pattern) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat();
		if (StringUtil.isBlank(pattern)) {
			pattern = DEFAULT_DATE_PATTERN;
		}
		sdf.applyPattern(pattern);
		return sdf.parse(date);
	}
}
