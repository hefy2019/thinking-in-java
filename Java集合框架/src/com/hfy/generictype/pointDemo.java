package com.hfy.generictype;

//������Ͳ�����Ĭ����Object
public class pointDemo {
	public static void main(String[] args) {
		//���1:ʹ��String����
		Point<String> p1 = new Point<String>();
		String x1 = p1.getX();
		//String x2 = (String) x1;
		//���2:ʹ��Integer����
		Point<Integer> p2 = new Point<Integer>();
		Integer x2 = p2.getX();
		//���3:ʹ��Double����
		Point<Double> p3 = new Point<Double>();
		Double x3 = p3.getX();
	}
	//���ͷ���	����Ӧ���ɲ�������
	public static <T> T doWork(T val) {
		return val;
	}
}
